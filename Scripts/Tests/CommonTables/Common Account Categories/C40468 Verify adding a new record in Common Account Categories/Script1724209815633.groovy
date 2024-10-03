import internal.GlobalVariable
import nicusnow.common.page.HeaderBar
import nicusnow.common.page.HeaderPage
import nicusnow.common.page.LeftNavigator
import nicusnow.common.page.LoginPage
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
NPages.nav(AccountCategoryPage).onGrid().searchData('Account Category', account_category).cleanUpDataTest()

NPages.takeScreenShot()

'5. Click New button on the header bar'
NPages.nav(HeaderBar).clickNew()

'6. On the Account Categories New Record page > Input Account Category, Active?, Default Flex Level'
NPages.nav(AccountCategoryPage).inputAccCate(account_category)
		.checkActive()
		.inputDefaultFlexLevel(flex_level)
		
'7. User continue click on Attribute field tab > Input Account Category Text Attribute 01...20, Account Category Flag Attribute 01...05, Account Category Numeric Attribute 01...05, Account Category Date Attribute 01...05'
NPages.nav(AccountCategoryPage).clickTabAttrFields()
		.inputAccCateTextAttr01(account_category_attrb_text_01)
		.inputAccCateTextAttr02(account_category_attrb_text_02)
		.inputAccCateTextAttr03(account_category_attrb_text_03)
		.inputAccCateTextAttr04(account_category_attrb_text_04)
		.inputAccCateTextAttr05(account_category_attrb_text_05)
		.inputAccCateTextAttr06(account_category_attrb_text_06)
		.inputAccCateTextAttr07(account_category_attrb_text_07)
		.inputAccCateTextAttr08(account_category_attrb_text_08)
		.inputAccCateTextAttr09(account_category_attrb_text_09)
		.inputAccCateTextAttr10(account_category_attrb_text_10)
		.inputAccCateTextAttr11(account_category_attrb_text_11)
		.inputAccCateTextAttr12(account_category_attrb_text_12)
		.inputAccCateTextAttr13(account_category_attrb_text_13)
		.inputAccCateTextAttr14(account_category_attrb_text_14)
		.inputAccCateTextAttr15(account_category_attrb_text_15)
		.inputAccCateTextAttr16(account_category_attrb_text_16)
		.inputAccCateTextAttr17(account_category_attrb_text_17)
		.inputAccCateTextAttr18(account_category_attrb_text_18)
		.inputAccCateTextAttr19(account_category_attrb_text_19)
		.inputAccCateTextAttr20(account_category_attrb_text_20)
		.checkAccCateFlagAttr01()
		.checkAccCateFlagAttr02()
		.checkAccCateFlagAttr03()
		.checkAccCateFlagAttr04()
		.checkAccCateFlagAttr05()
		.inputAccCateNumAttr01(account_category_attrb_float_01)
		.inputAccCateNumAttr02(account_category_attrb_float_02)
		.inputAccCateNumAttr03(account_category_attrb_float_03)
		.inputAccCateNumAttr04(account_category_attrb_float_04)
		.inputAccCateNumAttr05(account_category_attrb_float_05)
		.inputAccCateDateAttr01(account_category_attrb_datetime_01)
		.inputAccCateDateAttr02(account_category_attrb_datetime_02)
		.inputAccCateDateAttr03(account_category_attrb_datetime_03)
		.inputAccCateDateAttr04(account_category_attrb_datetime_04)
		.inputAccCateDateAttr05(account_category_attrb_datetime_05)
		
'8. User continue click on Attribute field tab > Input Notes'
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
		.verifyDataDisplayOnField('Account Category Text Attribute 01', account_category_attrb_text_01)
		.verifyDataDisplayOnField('Account Category Text Attribute 02', account_category_attrb_text_02)
		.verifyDataDisplayOnField('Account Category Text Attribute 03', account_category_attrb_text_03)
		.verifyDataDisplayOnField('Account Category Text Attribute 04', account_category_attrb_text_04)
		.verifyDataDisplayOnField('Account Category Text Attribute 05', account_category_attrb_text_05)
		.verifyDataDisplayOnField('Account Category Text Attribute 06', account_category_attrb_text_06)
		.verifyDataDisplayOnField('Account Category Text Attribute 07', account_category_attrb_text_07)
		.verifyDataDisplayOnField('Account Category Text Attribute 08', account_category_attrb_text_08)
		.verifyDataDisplayOnField('Account Category Text Attribute 09', account_category_attrb_text_09)
		.verifyDataDisplayOnField('Account Category Text Attribute 10', account_category_attrb_text_10)
		.verifyDataDisplayOnField('Account Category Text Attribute 11', account_category_attrb_text_11)
		.verifyDataDisplayOnField('Account Category Text Attribute 12', account_category_attrb_text_12)
		.verifyDataDisplayOnField('Account Category Text Attribute 13', account_category_attrb_text_13)
		.verifyDataDisplayOnField('Account Category Text Attribute 14', account_category_attrb_text_14)
		.verifyDataDisplayOnField('Account Category Text Attribute 15', account_category_attrb_text_15)
		.verifyDataDisplayOnField('Account Category Text Attribute 16', account_category_attrb_text_16)
		.verifyDataDisplayOnField('Account Category Text Attribute 17', account_category_attrb_text_17)
		.verifyDataDisplayOnField('Account Category Text Attribute 18', account_category_attrb_text_18)
		.verifyDataDisplayOnField('Account Category Text Attribute 19', account_category_attrb_text_19)
		.verifyDataDisplayOnField('Account Category Text Attribute 20', account_category_attrb_text_20)
		.verifyDataDisplayOnField('Account Category Flag Attribute 01', account_category_attrb_bit_01)
		.verifyDataDisplayOnField('Account Category Flag Attribute 02', account_category_attrb_bit_02)
		.verifyDataDisplayOnField('Account Category Flag Attribute 03', account_category_attrb_bit_03)
		.verifyDataDisplayOnField('Account Category Flag Attribute 04', account_category_attrb_bit_04)
		.verifyDataDisplayOnField('Account Category Flag Attribute 05', account_category_attrb_bit_05)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 01', account_category_attrb_float_01)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 02', account_category_attrb_float_02)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 03', account_category_attrb_float_03)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 04', account_category_attrb_float_04)
		.verifyDataDisplayOnField('Account Category Numeric Attribute 05', account_category_attrb_float_05)
		.verifyDataDisplayOnField('Account Category Date Attribute 01', account_category_attrb_datetime_01)
		.verifyDataDisplayOnField('Account Category Date Attribute 02', account_category_attrb_datetime_02)
		.verifyDataDisplayOnField('Account Category Date Attribute 03', account_category_attrb_datetime_03)
		.verifyDataDisplayOnField('Account Category Date Attribute 04', account_category_attrb_datetime_04)
		.verifyDataDisplayOnField('Account Category Date Attribute 05', account_category_attrb_datetime_05)

NPages.takeScreenShot()

'12. Log out the app'
NPages.nav(HeaderPage).switchOutIframe().clickLogout()

