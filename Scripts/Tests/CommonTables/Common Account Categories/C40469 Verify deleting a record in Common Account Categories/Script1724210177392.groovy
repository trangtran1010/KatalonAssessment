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
NPages.nav(AccountCategoryPage).onGrid().searchData('Account Category', account_category).cleanUpDataTest()

NPages.takeScreenShot()

'5. Click New button on the header bar'
NPages.nav(HeaderBar).clickNew()

'6. On the Account Categories New Record page > Input Account Category, Active?, Default Flex Level'
NPages.nav(AccountCategoryPage).inputAccCate(account_category)
		.checkActive()
		.inputDefaultFlexLevel(flex_level)
		
'7. Click submit button'
NPages.nav(AccountCategoryPage).clickSubmit()
		
'8. Need to sleep alitte time for the page is completely show'
NPages.nav(AccountCategoryPage).sleepSomeTime()

'9. After creating Account Category, User need to verify the created data should be displayed correctly'
NPages.nav(AccountCategoryPage).onGrid()
		.verifyDataDisplayOnField('Account Category', account_category)
		.verifyDataDisplayOnField('Active?', active_ind)
		.verifyDataDisplayOnField('Default Flex Level', flex_level)
		.verifyDataDisplayOnField('Updated by', GlobalVariable.userEmail)
		.verifyDataDisplayOnField('Created by', GlobalVariable.userEmail)
		
'10. User click on an Account Category'
NPages.nav(OnDataGrid).clickOnCell('Account Category')
		
'11. User click Delete button '
NPages.nav(AccountCategoryPage).clickDelete()
		
NPages.takeScreenShot()
		
'12. User click Delete button on confirmation popup'
NPages.nav(AccountCategoryPage).clickDeleteOnConfrimation().sleepAlittleTime()
		
'13. On Data Grid, User verify the No records to display which mean the Account Category was deleted successfully'
NPages.nav(OnDataGrid).verifyEmptyGrid()
		
NPages.takeScreenShot()

'14. Click New button on the header bar'
NPages.nav(HeaderBar).clickNew()

'15. On the Account Categories New Record page > Input Account Category, Active?, Default Flex Level'
NPages.nav(AccountCategoryPage).inputAccCate(account_category)
		.checkActive()
		.inputDefaultFlexLevel(flex_level)
		
'16. Click submit button'
NPages.nav(AccountCategoryPage).clickSubmit()
		
'17. Need to sleep alitte time for the page is completely show'
NPages.nav(AccountCategoryPage).sleepSomeTime()

'18. After creating Account Category, User need to verify the created data should be displayed correctly'
NPages.nav(AccountCategoryPage).onGrid()
		.verifyDataDisplayOnField('Account Category', account_category)
		.verifyDataDisplayOnField('Active?', active_ind)
		.verifyDataDisplayOnField('Default Flex Level', flex_level)
		.verifyDataDisplayOnField('Updated by', GlobalVariable.userEmail)
		.verifyDataDisplayOnField('Created by', GlobalVariable.userEmail)

'19. On Data Grid, user select All'
NPages.nav(OnDataGrid).selectAllRows()
		
NPages.takeScreenShot()
		
'20. On Data Grid, Open the dropdown and click delete'
NPages.nav(OnDataGrid).deleteRows().sleepAlittleTime()
		
'21. On Data Grid, User verify the No records to display which mean the adjustment set was deleted successfully '
NPages.nav(OnDataGrid).verifyEmptyGrid()
		
NPages.takeScreenShot()

'22. Log out the app'
NPages.nav(HeaderPage).switchOutIframe().clickLogout()