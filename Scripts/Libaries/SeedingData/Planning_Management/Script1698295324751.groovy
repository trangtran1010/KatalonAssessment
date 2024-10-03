import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import nicusnow.common.page.SeedingData
import nicusnow.fw.lib.NPages

WebUI.verifyEqual(true, true)

@SetUp
def C15348() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C15348', true)
			.updatePeriodCells('period', 1, 2)
}

@SetUp
def C22193() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22193', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26800() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26800', true)
			.updatePeriodCells('period', 1, 2)
}

@SetUp
def C25753() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C25753', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 18)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C25754() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C25754', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 18)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C25755() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C25755', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 10)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateAccountCells('account_update', 2, 2)
			.updateCostCenterCells('cost_center_update', 2, 2)
			.updateProjectCells('project_update', 2, 2)
			.updateFundCells('fund_update', 1, 3)
}

@SetUp
def C25756() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C25756', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 10)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C15351() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C15351', true)
			.updatePeriodCells('period', 1, 5)
}

@SetUp
def C26812() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26812', true)
			.updatePeriodCells('period', 1, 5)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('amount_adjustment_period', 1, 7)
}

@SetUp
def C26813() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26813', true)
			.updatePeriodCells('period', 1, 3)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('amount_adjustment_period', 1, 4)
			.updatePeriodCells('amount_adjustment_period_update', 1, 9)
}

@SetUp
def C26814() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26814', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('amount_adjustment_period', 1, 9)
}

@SetUp
def C28824() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28824', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 18)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26804() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26804', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C28845() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28845', true)
			.updatePeriodCells('period', 1, 5)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}
@SetUp
def PC31() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'PC31', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 4)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('period', 1,2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent', 2, 2)
}

@SetUp
def PC32() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'PC32', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 4)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('period', 1,2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent', 2, 2)
}

@SetUp
def PC33() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'PC33', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 4)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('period', 1,2)
}

@SetUp
def C15346() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C15346', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent', 2, 2)
}

@SetUp
def C15347() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C15347', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('merit_effective_period', 1, 6)
}

@SetUp
def C24763() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24763', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period', 3, 2)
}

@SetUp
def C24765() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24765', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('merit_effective_period', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period', 3, 2)
}

@SetUp
def C22195() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22195', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22196() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22196', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26796() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26796', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22259() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22259', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26799() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26799', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updatePeriodCells('list_period_calculate', 3, 3)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22258() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22258', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26802() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26802', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26803() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26803', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22260() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22260', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updatePeriodCells('list_period_calculate', 3, 3)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26797() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26797', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updatePeriodCells('list_period_calculate', 3, 3)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26795() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26795', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26801() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26801', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C23227() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C23227', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C23228() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C23228', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C23230() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C23230', true)
			.updatePeriodCells('period', 1, 2)
			.updatePeriodCells('period_update', 1, 15)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C23231() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C23231', true)
			.updatePeriodCells('period', 1, 2)
			.updatePeriodCells('period_update', 1, 10)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22194() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22194', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22197() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22197', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C26798() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C26798', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updatePeriodCells('list_period_calculate', 3, 3)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C22261() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C22261', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C24761() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24761', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number_default', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent_default', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period_default', 3, 2)
			.updatePeriodCells('labor_salary_percent_by_period_update', 1, 13)
}

@SetUp
def C24762() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24762', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('merit_effective_period', 1, 6)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number_default', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent_default', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period_default', 3, 2)
			.updatePeriodCells('labor_salary_percent_by_period_update', 1, 13)
}

@SetUp
def C24766() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24766', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number_default', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent_default', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period_default', 3, 2)
			.updatePeriodCells('labor_hourly_hours_by_period_update', 1, 13)
}

@SetUp
def C24768() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C24768', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updatePeriodCells('merit_effective_period', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number_default', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent_default', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period_default', 3, 2)
			.updatePeriodCells('labor_hourly_hours_by_period_update', 1, 13)
}

@SetUp
def C33957() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33957', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 37)
			.updatePeriodCells('list_period', 3, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C33958() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33958', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateObjectCells('object', 2, 2)
}

@SetUp
def C33961() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33961', true)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateObjectCells('object', 2, 2)
}

@SetUp
def C33962() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33962', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateObjectCells('object', 2, 2)
}

@SetUp
def C33959() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33959', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateObjectCells('object', 2, 2)
			.updateLineItemCells('line_item', 1, 3)
			.updatePeriodCells('period_update', 1, 10)
			.updateAccountCells('account_update', 2, 2)
			.updateCostCenterCells('cost_center_update', 2, 2)
			.updateProjectCells('project_update', 2, 2)
			.updateFundCells('fund_update', 1, 3)
			.updateObjectCells('object_update', 2, 3)	
			.updateLineItemCells('line_item_update', 1, 5)
			.updateLineItemCells('line_item_update_non_labor', 1, 2)
}

@SetUp
def C36004() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C36004', true)
			.updatePeriodCells('period', 1, 2)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
			.updateObjectCells('object', 2, 2)
			.updateLineItemCells('line_item', 1, 2)
			.updatePeriodCells('period_update', 1, 10)
			.updateAccountCells('account_update', 2, 2)
			.updateCostCenterCells('cost_center_update', 2, 2)
			.updateProjectCells('project_update', 2, 2)
			.updateFundCells('fund_update', 1, 3)
			.updateObjectCells('object_update', 2, 3)
			.updateLineItemCells('line_item_update', 1, 4)
			.updateLineItemCells('line_item_update_non_labor', 1, 3)
}

@SetUp
def C28819() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28819', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 13)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def C28825() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28825', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 13)
}

@SetUp
def C36023() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C36023', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 13)
}

@SetUp
def C28826() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28826', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('list_period', 3, 5)
			.updatePeriodCells('list_period_on_liaa', 3, 4)
}

@SetUp
def C28828() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28828', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
}

@SetUp
def C28822() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28822', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('list_period', 3, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)		
}

@SetUp
def C28821() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28821', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('list_period', 3, 6)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_period_number', 1, 2)
			.updateLaborConfigurationSettingsCells('standard_annual_increase_percent', 2, 2)
			.updateLaborConfigurationSettingsCells('standard_hours_per_period', 3, 2)
			.updateLaborConfigurationSettingsCells('use_the_same_number_of_hours_each_period', 4, 2)
			.updateLaborConfigurationSettingsCells('spread_salary_evenly_across_the_year', 5, 2	)
			.updateLaborConfigurationSettingsCells('calculate_additional_non_salary_or_wage_expenses', 6, 2)
}

@SetUp
def C28827() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28827', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('list_period', 3, 6)
}

@SetUp
def C28820() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C28820', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('list_period_on_abpba', 3, 7)
			.updatePeriodCells('list_period_on_abp', 3, 8)
			.updatePeriodCells('list_period_on_amount_adjustment_tab', 3, 4)
			.updateAccountCells('account', 2, 3)
			.updateCostCenterCells('cost_center', 2, 3)
			.updateProjectCells('project', 2, 3)
			.updateFundCells('fund', 1, 2)
}

@SetUp
def C37086() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37086', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
}

@SetUp
def C37091() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37091', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def C37090() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37090', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
}

@SetUp
def C37089() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37089', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
}

@SetUp
def C37092() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37092', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def PC34() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'PC34', true)
			.updatePeriodCells('list_period_display', 3, 9)
}

@SetUp
def C37097() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37097', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def C37095() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37095', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def C37096() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C37096', true)
			.updatePeriodCells('start_period', 1, 2)
			.updatePeriodCells('end_period', 1, 6)
			.updatePeriodCells('current_snapshot_period', 1, 20)
}

@SetUp
def C38194() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C38194', true)
			.updateAccountCells('account_display', 2, 2)
			.updateCostCenterCells('cost_center_display', 2, 3)
			.updateProjectCells('project_display', 2, 3)
			.updateFundCells('fund_display', 1, 3)
}

@SetUp
def C33975() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C33975', true)
			.updateAccountCells('account_updated', 2, 2)
			.updateCostCenterCells('cost_center_updated', 2, 3)
			.updateProjectCells('project_updated', 2, 3)
			.updateFundCells('fund_updated', 1, 3)
			.updateObjectCells('object_updated', 2, 3)
			.updatePeriodCells('period_updated', 1, 2)
}

@SetUp
def C39231() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C39231', true)
			.updatePeriodCells('current_planning_period', 1, 20)
}

@SetUp
def C39232() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C39232', true)
			.updatePeriodCells('current_planning_period', 1, 20)
			.updatePeriodCells('current_planning_period_updated', 1, 2)
}

@SetUp
def C39234() {
	NPages.nav(SeedingData).setDataFilePath(data_file, 'C39234', true)
			.updatePeriodCells('current_planning_period', 1, 20)
}