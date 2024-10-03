 import nicusnow.common.page.SeedingData

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import nicusnow.fw.utilities.FileUtils
import nicusnow.fw.lib.NPages

WebUI.verifyEqual(true, true)

@SetUp
def C1168() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1168', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
}

@SetUp
def C3424() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C3424', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateCostCenterCells('cost_center_display',2, 2)
}

@SetUp
def C3422() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C3422', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
}

@SetUp
def C1179() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1179', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
}

@SetUp
def C3427() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C3427', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateCostCenterCells('cost_center_display',2, 2)
}

@SetUp
def C1188() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1188', true)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateAccountCategoriesCells('account_category', 1, 2)
}

@SetUp
def C3430() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C3430', true)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateAccountCategoriesCells('account_category', 1, 2)
							.updateCostCenterCells('cost_center_display',2, 2)
}

@SetUp
def C1190() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1190', true)
							.updateObjectCells('source_object', 2, 2)
							.updateObjectCells('target_object', 2, 3)
}

@SetUp
def C1191() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1191', true)
							.updateServiceCells('service', 2, 2)
							.updateConsumerCells('consumer', 1, 2)
}

@SetUp
def C3431() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C3431', true)
							.updateServiceCells('service', 1, 2)
							.updateServiceCells('service_dis', 2, 2)
							.updateServiceCells('service_desc', 3, 2)
							.updateServiceCells('service_category', 4, 2)
							.updateServiceCells('chargeback_method', 5, 2)
							.updateServiceCells('uom', 6, 2)
							.updateConsumerCells('consumer_dis', 1, 2)
							.updateConsumerCells('consumer_desc', 2, 2)
							.updateConsumerCells('invoice_entity', 3, 2)
}

@SetUp
def C1169() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1169', true)
							.setImportFilePath('C1169_costs_set_entry.xlsx', 'x_niso_nicus_cost_am_costs_set_', true)
							.updateFundCells('Fund',1, 3)
							.updateCostCenterCells('Cost Center',2, 3)
							.updateAccountCells('Account', 2, 3)
							.updateProjectCells('Project', 2, 3)
							.updateObjectCells('Object', 2, 3)
}

@SetUp
def C1194() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1194', true)
							.setImportFilePath('C1194_cost_am_metrics_set_entry.xlsx', 'x_niso_nicus_cost_am_metrics_se', true)
							.updateObjectCells('Source Object', 2, 2)
							.updateObjectCells('Target Object', 2, 3)
}

@SetUp
def C1508() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1508', true)
							.updateObjectCells('source_object', 2, 2)
							.updateObjectCells('target_object', 2, 3)
}


@SetUp
def C1192() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1192', true)
							.setImportFilePath('C1192_adjustment_set_entry.xlsx', 'x_niso_nicus_cost_am_adjustment', true)
							.updateFundCells('Fund',1, 3)
							.updateCostCenterCells('Cost Center',2, 3)
							.updateAccountCells('Account', 2, 3)
							.updateProjectCells('Project', 2, 3)
							.updateObjectCells('Object', 2, 3)
}
@SetUp
def C1193() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1193', true)
							.setImportFilePath('C1193_gl_allocations_set_entry.xlsx', 'x_niso_nicus_cost_am_gl_allocat', true)
							.updateCostCenterCells('Cost Center',2, 2)
							.updateAccountCells('Account', 2, 2)
							.updateObjectCells('Object', 2, 2)
							.updateAccountCategoriesCells('Account Category', 1, 2)
}

@SetUp
def C1230() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1230', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
}

@SetUp
def C1231() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1231', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
}

@SetUp
def C1232() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1232', true)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateAccountCategoriesCells('account_category', 1, 2)
}


@SetUp
def C1233() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1233', true)
							.updateObjectCells('source_object', 2, 2)
							.updateObjectCells('target_object', 2, 3)
}

@SetUp
def C1234() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1234', true)
							.updateServiceCells('service', 2, 2)
							.updateConsumerCells('consumer', 1, 2)
}

@SetUp
def C1235() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1235', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateFundCells('fund_edit',1, 3)
							.updateCostCenterCells('cost_center_edit',2, 3)
							.updateAccountCells('account_edit', 2, 3)
							.updateProjectCells('project_edit', 2, 3)
							.updateObjectCells('object_edit', 2, 3)
}

@SetUp
def C1236() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1236', true)
							.updateFundCells('fund',1, 2)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateProjectCells('project', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateFundCells('fund_edit',1, 3)
							.updateCostCenterCells('cost_center_edit',2, 3)
							.updateAccountCells('account_edit', 2, 3)
							.updateProjectCells('project_edit', 2, 3)
							.updateObjectCells('object_edit', 2, 3)
}

@SetUp
def C1237() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1237', true)
							.updateCostCenterCells('cost_center',2, 2)
							.updateAccountCells('account', 2, 2)
							.updateObjectCells('object', 2, 2)
							.updateAccountCategoriesCells('account_category', 1, 2)
							.updateCostCenterCells('cost_center_edit',2, 2)
							.updateAccountCells('account_edit', 2, 2)
							.updateObjectCells('object_edit', 2, 2)
							.updateAccountCategoriesCells('account_category_edit', 1, 3)
}

@SetUp
def C1238() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1238', true)
							.updateObjectCells('source_object', 2, 2)
							.updateObjectCells('target_object', 2, 3)
							.updateObjectCells('source_object_edit', 2, 3)
							.updateObjectCells('target_object_edit', 2, 2)
}

@SetUp
def C1239() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1239', true)
							.updateServiceCells('service', 2, 2)
							.updateConsumerCells('consumer', 1, 2)
							.updateServiceCells('service_edit', 2, 3)
							.updateConsumerCells('consumer_edit', 1, 3)
}
@SetUp
def C1195() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C1195', true)
							.setImportFilePath('C1195_am_utilizations_set_entry.xlsx', 'x_niso_nicus_cost_am_utilizatio', true)
							.updateServiceCells('Service', 2, 2)
							.updateConsumerCells('Consumer', 1, 2)
}