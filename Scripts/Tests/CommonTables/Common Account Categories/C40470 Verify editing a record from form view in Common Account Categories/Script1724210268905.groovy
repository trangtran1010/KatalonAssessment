import internal.GlobalVariable
import nicusnow.common.page.HeaderBar
import nicusnow.common.page.HeaderPage
import nicusnow.common.page.LeftNavigator
import nicusnow.common.page.LoginPage
import nicusnow.common.page.OnDataGrid
import nicusnow.common.table.AccountCategoryPage
import nicusnow.fw.constant.CommonTables
import nicusnow.fw.lib.NPages
import nicusnow.fw.constant.Fmdb

'1. User enter credential to login to the system'
NPages.nav(LoginPage).enterCredential().clickLogin()

'2. Verify user logined sucessfully'
NPages.nav(HeaderPage).verifyUserLoginSucess()

NPages.takeScreenShot()

'3. On left Navigator do filter Common Account Categories in Nicus FMDB'
NPages.nav(LeftNavigator).searchAndNavigateToPage(CommonTables.NicusFmdbCommonTable, Fmdb.NicusFmdb, CommonTables.AccountCategories)

'4. On Common Account Categories data grid, user search a account category which is data to test to clean up before insert new'
NPages.nav(AccountCategoryPage).onGrid().searchData('Account Category',account_category).cleanUpDataTest()

NPages.takeScreenShot()

'5. Click New button on the header bar'
NPages.nav(HeaderBar).clickNew()

'6. On the Account Categories New Record page > Input Account Category, Active?, Default Flex Level'
NPages.nav(AccountCategoryPage).inputAccCate(account_category)
		.inputDefaultFlexLevel(flex_level)
		
'7. User continue click on Attribute field tab > Input Notes'
NPages.nav(AccountCategoryPage).clickTabActivities().inputNotes(notes)

'9. Click submit button'
NPages.nav(AccountCategoryPage).clickSubmit()

'10. Need to sleep alitte time for the page is completely show'
NPages.nav(AccountCategoryPage).sleepSomeTime()

'11. After creating Account Category, User need to verify the created data should be displayed correctly'
NPages.nav(AccountCategoryPage).onGrid()
		.verifyDataDisplayOnField('Account Category', account_category)
		.verifyDataDisplayOnField('Active?', active_ind)
		.verifyDataDisplayOnField('Default Flex Level', flex_level)
		.verifyDataDisplayOnField('Notes', notes)
		.verifyDataDisplayOnField('Updated by', GlobalVariable.userEmail)
		.verifyDataDisplayOnField('Created by', GlobalVariable.userEmail)

NPages.takeScreenShot()

'12. User click on an Account Category'
NPages.nav(OnDataGrid).clickOnCell('Account Category')

'13. On the Account Categories New Record page > Input updated Account Category, Active?, Default Flex Level'
NPages.nav(AccountCategoryPage).inputAccCate(account_category_edit)
		.checkActive()
		.inputDefaultFlexLevel(flex_level_edit)

'14. User continue click on Attribute field tab > Input updated Account Category Text Attribute 01...20, Account Category Flag Attribute 01...05, Account Category Numeric Attribute 01...05, Account Category Date Attribute 01...05'
NPages.nav(AccountCategoryPage).clickTabAttrFields()
		.inputAccCateTextAttr01(account_category_attrb_text_01_edit)
		.inputAccCateTextAttr02(account_category_attrb_text_02_edit)
		.inputAccCateTextAttr03(account_category_attrb_text_03_edit)
		.inputAccCateTextAttr04(account_category_attrb_text_04_edit)
		.inputAccCateTextAttr05(account_category_attrb_text_05_edit)
		.inputAccCateTextAttr06(account_category_attrb_text_06_edit)
		.inputAccCateTextAttr07(account_category_attrb_text_07_edit)
		.inputAccCateTextAttr08(account_category_attrb_text_08_edit)
		.inputAccCateTextAttr09(account_category_attrb_text_09_edit)
		.inputAccCateTextAttr10(account_category_attrb_text_10_edit)
		.inputAccCateTextAttr11(account_category_attrb_text_11_edit)
		.inputAccCateTextAttr12(account_category_attrb_text_12_edit)
		.inputAccCateTextAttr13(account_category_attrb_text_13_edit)
		.inputAccCateTextAttr14(account_category_attrb_text_14_edit)
		.inputAccCateTextAttr15(account_category_attrb_text_15_edit)
		.inputAccCateTextAttr16(account_category_attrb_text_16_edit)
		.inputAccCateTextAttr17(account_category_attrb_text_17_edit)
		.inputAccCateTextAttr18(account_category_attrb_text_18_edit)
		.inputAccCateTextAttr19(account_category_attrb_text_19_edit)
		.inputAccCateTextAttr20(account_category_attrb_text_20_edit)
		.checkAccCateFlagAttr01()
		.checkAccCateFlagAttr02()
		.checkAccCateFlagAttr03()
		.checkAccCateFlagAttr04()
		.checkAccCateFlagAttr05()
		.inputAccCateNumAttr01(account_category_attrb_float_01_edit)
		.inputAccCateNumAttr02(account_category_attrb_float_02_edit)
		.inputAccCateNumAttr03(account_category_attrb_float_03_edit)
		.inputAccCateNumAttr04(account_category_attrb_float_04_edit)
		.inputAccCateNumAttr05(account_category_attrb_float_05_edit)
		.inputAccCateDateAttr01(account_category_attrb_datetime_01_edit)
		.inputAccCateDateAttr02(account_category_attrb_datetime_02_edit)
		.inputAccCateDateAttr03(account_category_attrb_datetime_03_edit)
		.inputAccCateDateAttr04(account_category_attrb_datetime_04_edit)
		.inputAccCateDateAttr05(account_category_attrb_datetime_05_edit)
				
'15. User continue click on Attribute field tab > Input updated Notes'
NPages.nav(AccountCategoryPage).clickTabActivities().inputNotes(notes_edit)

'16. Click update button'
NPages.nav(AccountCategoryPage).clickUpdate()

'17. Need to sleep alitte time for the page is completely show'
NPages.nav(AccountCategoryPage).sleepSomeTime()

'18. After creating Account Category, User need to verify the created data should be displayed correctly'
NPages.nav(AccountCategoryPage).onGrid()
		.verifyDataDisplayOnField('Account Category', account_category_edit)
		.verifyDataDisplayOnField('Active?', active_ind_edit)
		.verifyDataDisplayOnField('Default Flex Level', flex_level_edit)
		.verifyDataDisplayOnField('Notes', notes_edit)
		.verifyDataDisplayOnField('Updated by', GlobalVariable.userEmail)
		.verifyDataDisplayOnField('Created by', GlobalVariable.userEmail)
		.verifyDataDisplayOnField('Account Category Text Attribute 01', account_category_attrb_text_01_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 02', account_category_attrb_text_02_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 03', account_category_attrb_text_03_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 04', account_category_attrb_text_04_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 05', account_category_attrb_text_05_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 06', account_category_attrb_text_06_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 07', account_category_attrb_text_07_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 08', account_category_attrb_text_08_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 09', account_category_attrb_text_09_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 10', account_category_attrb_text_10_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 11', account_category_attrb_text_11_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 12', account_category_attrb_text_12_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 13', account_category_attrb_text_13_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 14', account_category_attrb_text_14_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 15', account_category_attrb_text_15_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 16', account_category_attrb_text_16_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 17', account_category_attrb_text_17_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 18', account_category_attrb_text_18_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 19', account_category_attrb_text_19_edit)
		.verifyDataDisplayOnField('Account Category Text Attribute 20', account_category_attrb_text_20_edit)
		.verifyDataDisplayOnField('Account Category Flag Attribute 01', account_category_attrb_bit_01_edit)
		.verifyDataDisplayOnField('Account Category Flag Attribute 02', account_category_attrb_bit_02_edit)
		.verifyDataDisplayOnField('Account Category Flag Attribute 03', account_category_attrb_bit_03_edit)
		.verifyDataDisplayOnField('Account Category Flag Attribute 04', account_category_attrb_bit_04_edit)
		.verifyDataDisplayOnField('Account Category Flag Attribute 05', account_category_attrb_bit_05_edit)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 01', account_category_attrb_float_01_edit)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 02', account_category_attrb_float_02_edit)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 03', account_category_attrb_float_03_edit)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 04', account_category_attrb_float_04_edit)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 05', account_category_attrb_float_05_edit)
		.verifyDataDisplayOnField('Account Category Date Attribute 01', account_category_attrb_datetime_01_edit)
		.verifyDataDisplayOnField('Account Category Date Attribute 02', account_category_attrb_datetime_02_edit)
		.verifyDataDisplayOnField('Account Category Date Attribute 03', account_category_attrb_datetime_03_edit)
		.verifyDataDisplayOnField('Account Category Date Attribute 04', account_category_attrb_datetime_04_edit)
		.verifyDataDisplayOnField('Account Category Date Attribute 05', account_category_attrb_datetime_05_edit)

NPages.takeScreenShot()

'19. Log out the app'
NPages.nav(HeaderPage).switchOutIframe().clickLogout()

