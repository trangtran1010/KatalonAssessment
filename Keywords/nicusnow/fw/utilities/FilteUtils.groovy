package nicusnow.fw.utilities

import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import org.apache.commons.io.FileUtils as ApacheFileUtils
import java.nio.file.Files
import java.nio.file.Paths

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class FileUtils {

	public static final int WAIT_FOR_FILE_EXIST = 30 // 30 seconds
	
	/**
	 * Try to clean up a folder in the file system
	 * @param folderPath
	 */
	def public static cleanUpFolder(String folderPath) {
		ApacheFileUtils.cleanDirectory(new File(folderPath))
	}

	/**
	 * Try to delete a specific file
	 * @param filePath
	 * @return true if the file deleted successfully; otherwise, false
	 */
	def public static boolean deleteAFile(String filePath) {
		File checkingFile = new File(filePath)

		if (checkingFile.exists()) {
			return checkingFile.delete()
		}

		return false
	}

	public static String getDownloadDir() {
		return Paths.get(System.getProperty("user.home"), GlobalVariable.downloadFolder).toString() + File.separatorChar
	}

	public static String getDataFilesDir() {
		return Paths.get(System.getProperty('user.dir'), GlobalVariable.dataFileFolder).toString() + File.separatorChar
	}

	public static String getRefDataFilesDir() {
		return getDataFilesDir() + GlobalVariable.refDataFolder + File.separatorChar
	}

	public static String getImportFilesDir() {
		return getDataFilesDir() + GlobalVariable.importFileFolder + File.separatorChar
	}


	public static String readDataFiles(String dataDir) {
		dataDir = Paths.get(System.getProperty('user.dir')).toString() + File.separatorChar + dataDir
		return readFile(dataDir)
	}

	public static String readFile(String path, Charset encoding = StandardCharsets.UTF_8) {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void waitForFile(String filePath) {
		int sleepTime = 1000

		int i = 0
		while (i < WAIT_FOR_FILE_EXIST) {
			i++

			File checkingFile = new File(filePath)

			if (checkingFile.exists()) {
				return
			}

			Thread.sleep(sleepTime)
		}
	}

	/**
	 * Get file length in kilobyte
	 * @param fileName
	 * @return file length
	 */
	@Keyword
	public static long getFileLengthInKB(String fileName) {
		File file = new File(fileName);

		if (file.exists()) {

			// size of a file (in bytes)
			long bytes = file.length();

			return (bytes / 1024);
		}

		return 0
	}

	public static String findFileByName(String downloadDir, String fileName) {
		File dir = new File(downloadDir)
		File[] files = dir.listFiles({File dir1, String name -> name.contains(fileName)}as FilenameFilter)
		if (files.size() != 0) {
			return files[0].getAbsolutePath()
		}
		return ''
	}

	public static String waitForFileByName(String downloadDir, String fileName) {
		int sleepTime = 1000
		int i = 0
		while (i < WAIT_FOR_FILE_EXIST) {
			i++

			File dir = new File(downloadDir)
			File[] files = dir.listFiles({File dir1, String name -> name.contains(fileName)}as FilenameFilter)
			if (files.size() != 0) {
				return files[0].getAbsolutePath()
			}
		}
		Thread.sleep(sleepTime)
	}
}
