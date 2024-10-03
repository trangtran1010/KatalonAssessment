import nicusnow.common.page.SeedingData

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import nicusnow.fw.utilities.FileUtils
import nicusnow.fw.lib.NPages

WebUI.verifyEqual(true, true)

@SetUp
def C40483() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40483', true)
			.updateAccountCategoriesCells('account_category', 1, 2)
			.updateAccountCells('account_related', 2, 2)
			.updateCostPoolCells('cost_pool', 1, 2)
			.updateCostSubPoolCells('cost_sub_pool', 1, 2)
}

@SetUp
def C40486() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40486', true)
			.updateAccountCategoriesCells('account_category_edit', 1, 2)
			.updateAccountCells('account_related_edit', 2, 2)
			.updateCostPoolCells('cost_pool_edit', 1, 2)
			.updateCostSubPoolCells('cost_sub_pool_edit', 1, 2)
}

@SetUp
def C40489() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40489', true)
			.setImportFilePath('C40489_common_accounts_new.xlsx', 'x_niso_nicus_core_common_accoun', true)
			.updateAccountCategoriesCells('Account Category', 1, 2)
			.updateAccountCells('Account Related', 1, 2)
			.updateCostPoolCells('Cost Pool', 1, 2)
			.updateCostSubPoolCells('Cost Sub-Pool', 1, 2)
			.setImportFilePath('C40489_common_accounts_02.xlsx', 'x_niso_nicus_core_common_accoun', true)
			.updateAccountCategoriesCells('Account Category', 1, 3)
			.updateAccountCells('Account Related', 1, 2)
			.updateCostPoolCells('Cost Pool', 1, 3)
			.updateCostSubPoolCells('Cost Sub-Pool', 1, 3)
}

@SetUp
def C40487() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40487', true)
			.updateAccountCategoriesCells('account_category_edit', 1, 2)
			.updateAccountCells('account_related_edit', 2, 2)
			.updateCostPoolCells('cost_pool_edit', 1, 2)
			.updateCostSubPoolCells('cost_sub_pool_edit', 1, 2)
}

@SetUp
def C40488() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40488', true)
			.updateAccountCategoriesCells('account_category', 1, 2)
			.updateAccountCells('account_related', 2, 2)
			.updateCostPoolCells('cost_pool', 1, 2)
			.updateCostSubPoolCells('cost_sub_pool', 1, 2)
}

@SetUp
def C40501() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40501', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateApplicationPlfCells('application_platform', 1, 2)
}

@SetUp
def C40502() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40502', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateApplicationPlfCells('application_platform', 1, 2)
}

@SetUp
def C40504() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40504', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateApplicationPlfCells('application_platform', 1, 2)
}

@SetUp
def C40509() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40509', true)
			.updateApplicationGrpCells('application_group', 1, 2)
			.updateApplicationPlfCells('application_platform', 1, 2)
}

@SetUp
def C40508() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40508', true)
			.updateApplicationGrpCells('Application Group', 1, 2)
			.updateApplicationPlfCells('Platform', 1, 2)
			.setImportFilePath('C40508_common_applications_new.xlsx', 'x_niso_nicus_core_common_applic', true)
			.updateApplicationGrpCells('Application Group', 1, 2)
			.updateApplicationPlfCells('Platform', 1, 2)
			.setImportFilePath('C40508_common_applications_02.xlsx', 'x_niso_nicus_core_common_applic', true)
			.updateApplicationGrpCells('Application Group', 1, 3)
			.updateApplicationPlfCells('Platform', 1, 3)
}

@SetUp
def C41822() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41822', true)
			.updateBusServicesCategoryCells('business_service_category', 1, 2)
}

@SetUp
def C41823() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41823', true)
			.updateBusServicesCategoryCells('business_service_category', 1, 2)
}

@SetUp
def C41837() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41837', true)
			.updateBusServicesCells('business_service', 1, 2)
}

@SetUp
def C41838() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41838', true)
			.updateBusServicesCells('business_service', 1, 2)
			.updateBusServicesCells('business_service_edit', 1, 3)
}

@SetUp
def C41839() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41839', true)
			.updateBusServicesCells('business_service', 1, 2)
}

@SetUp
def C41840() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41840', true)
			.updateBusServicesCells('business_service', 1, 2)
			.updateBusServicesCells('business_service_edit', 1, 3)
}

@SetUp
def C41841() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41841', true)
			.updateBusServicesCells('business_service', 1, 2)
}

@SetUp
def C41842() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41842', true)
			.updateBusServicesCells('Business Service', 1, 2)
			.setImportFilePath('C41842_common_business_service_metrics_new.xlsx', 'x_niso_nicus_fmdb_common_busine', true)
			.updateBusServicesCells('Business Service', 1, 2)
			.setImportFilePath('C41842_common_business_service_metrics_02.xlsx', 'x_niso_nicus_fmdb_common_busine', true)
			.updateBusServicesCells('Business Service', 1, 2)
}

@SetUp
def C41849() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41849', true)
			.updateBusServicesCells('business_service', 1, 2)
}

@SetUp
def C41682() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41682', true)
			.updateTBMTowerCells('tbm_tower', 1, 2)
}

@SetUp
def C41683() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41683', true)
			.updateTBMTowerCells('tbm_tower', 1, 3)
			.updateTBMTowerCells('tbm_tower_edit', 1, 2)
}

@SetUp
def C41740() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41740', true)
			.updateServiceCells('service', 2, 2)
}

@SetUp
def C41741() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41741', true)
			.updateServiceCells('service', 2, 3)
}

@SetUp
def C41743() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41743', true)
			.updateServiceCells('service', 2, 2)
			.updateServiceCells('service_edit', 2, 3)
}

@SetUp
def C41807() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41807', true)
			.updateConsumerCells('consumer', 1, 2)
}

@SetUp
def C41808() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41808', true)
			.updateConsumerCells('consumer', 1, 3)
}

@SetUp
def C41574() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41574', true)
			.updateCostCenterRollupCells('cost_center_rollup_1', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_2', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_3', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_4', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_5', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_6', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_7', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_8', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_9', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_10', 1, 4)
}

@SetUp
def C41572() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41572', true)
			.updateCostCenterRollupCells('cost_center_rollup_1', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_2', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_3', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_4', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_5', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_6', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_7', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_8', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_9', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_10', 1, 4)
}

@SetUp
def C41571() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41571', true)
			.updateCostCenterRollupCells('cost_center_rollup_1', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_2', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_3', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_4', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_5', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_6', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_7', 1, 4)
			.updateCostCenterRollupCells('cost_center_rollup_8', 1, 2)
			.updateCostCenterRollupCells('cost_center_rollup_9', 1, 3)
			.updateCostCenterRollupCells('cost_center_rollup_10', 1, 4)
}

@SetUp
def C41825() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41825', true)
			.updateBusServicesCategoryCells('business_service_category', 1, 2)
			.updateBusServicesCategoryCells('business_service_category_edit', 1, 3)
}

@SetUp
def C40545() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40545', true)
			.updateServiceCells('service', 2, 2)
			.updateTBMTowerCells('tbm_tower', 1, 2)
			.updateTBMServiceCells('tbm_service', 1, 2)
			.updateTBMSubTowerCells('tbm_sub_tower', 1, 2)
}

@SetUp
def C41589() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41589', true)
			.updateDefaultCostCenterCells('cost_center_display', 2, 2)
}

@SetUp
def C41586() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41586', true)
			.updateDefaultCostCenterCells('project_cost_center_id', 2, 2)
}

@SetUp
def C41587() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41587', true)
			.updateDefaultCostCenterCells('project_cost_center_id', 2, 2)
}

@SetUp
def C41643() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41643', true)
			.updateInvoiceEntitiesCells('invoice_entity', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_1', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_2', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_3', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_4', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_5', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_6', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_7', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_8', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_9', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_10', 1, 3)
}

@SetUp
def C41644() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41644', true)
			.updateInvoiceEntitiesCells('invoice_entity', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_1', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_2', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_3', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_4', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_5', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_6', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_7', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_8', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_9', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_10', 1, 3)
}

@SetUp
def C41646() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41646', true)
			.updateInvoiceEntitiesCells('invoice_entity', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_1', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_2', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_3', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_4', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_5', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_6', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_7', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_8', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_9', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_10', 1, 3)
}

@SetUp
def C41654() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41654', true)
			.updateInvoiceEntitiesCells('invoice_entity', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_1', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_2', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_3', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_4', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_5', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_6', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_7', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_8', 1, 3)
			.updateConsumerRollupCells('consumer_rollup_9', 1, 2)
			.updateConsumerRollupCells('consumer_rollup_10', 1, 3)
}

@SetUp
def C40542() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40542', true)
			.updateTBMServiceCells('tbm_service', 1, 2)
			.updateTBMSubTowerCells('tbm_sub_tower', 1, 2)
			.updateTBMTowerCells('tbm_tower', 1, 2)
			.updateServiceCells('service', 2, 2)
}

@SetUp
def C40543() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C40543', true)
			.updateTBMServiceCells('tbm_service', 1, 2)
			.updateTBMSubTowerCells('tbm_sub_tower', 1, 2)
			.updateTBMTowerCells('tbm_tower', 1, 2)
			.updateServiceCells('service', 2, 2)
}

@SetUp
def C41769() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41769', true)
			.updateServiceCategoriesCells('service_category', 1, 2)
}

@SetUp
def C41770() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41770', true)
			.updateServiceCategoriesCells('service_category', 1, 2)
}

@SetUp
def C41772() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41772', true)
			.updateServiceCategoriesCells('service_category', 1, 2)
}

@SetUp
def C41685() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41685', true)
			.updateTBMTowerCells('tbm_tower', 1, 2)
			.updateTBMTowerCells('tbm_tower_edit', 1, 3)
}

@SetUp
def C41810() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C41810', true)
			.updateConsumerCells('consumer', 1, 2)
			.updateConsumerCells('consumer_edit', 1, 3)
}