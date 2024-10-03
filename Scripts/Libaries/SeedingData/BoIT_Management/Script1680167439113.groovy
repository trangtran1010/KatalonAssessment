import nicusnow.common.page.SeedingData

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import nicusnow.fw.utilities.FileUtils
import nicusnow.fw.lib.NPages

WebUI.verifyEqual(true, true)

@SetUp
def C14307() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C14307', true)
			.updateApplicationGrpCells('application_group', 1, 3)
			.updateBusServicesCells('business_service', 1, 2)
}

@SetUp
def C14308() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C14308', true)
			.updateApplicationGrpCells('application_group', 1, 3)
			.updateBusServicesCells('business_service', 1, 3)
			.updateApplicationGrpCells('application_group_edit', 1, 2)
			.updateBusServicesCells('business_service_edit', 1, 2)
}

@SetUp
def C14310() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C14310', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateBusServicesCells('business_service', 1, 2)
			.updateApplicationGrpCells('application_group_edit', 1, 3)
			.updateBusServicesCells('business_service_edit', 1, 3)
}

@SetUp
def C14330() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C14330', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateBusServicesCells('business_service', 1, 2)
}