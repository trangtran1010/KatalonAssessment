import nicusnow.common.page.SeedingData

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import nicusnow.fw.utilities.FileUtils
import nicusnow.fw.lib.NPages

WebUI.verifyEqual(true, true)

@SetUp
def C1160() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1160', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
			.updateAdjustmentSetCells('adjustment_set_name', 1, 2)
			.updateAllocatotionSetCells('allocation_set_name', 1, 2)
			.updateUtilizationSetCells('utilization_set_name', 1, 2)
}

@SetUp
def C1170() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1170', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
}

@SetUp
def C1171() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1171', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
}

@SetUp
def C1172() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1172', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
}

@SetUp
def C1240() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1240', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
}

@SetUp
def C1699() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1699', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateAdjustmentSetCells('adjustment_set_name', 1, 2)
			.updateAllocatotionSetCells('allocation_set_name', 1, 3)
			.updateMagicSetCells('metric_set_name', 1, 2)
			.updateUtilizationSetCells('utilization_set_name', 1, 2)
}

@SetUp
def C1769() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1769', true)
			.updateCostsSetCells('cost_set_name', 1, 2)
			.updateMagicSetCells('metric_set_name', 1, 2)
}