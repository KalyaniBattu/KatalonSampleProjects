import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testautomationpractice.blogspot.com/')

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Practice/input_Name_name'), 'Kalyani')

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Practice/input_Email_email'), 'kalyani@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Practice/input_Phone_phone'), '7788877888')

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Practice/textarea_Address_textarea'), 'Nagpur, MS')

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Male_female'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Days_sunday'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Sunday_monday'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Monday_tuesday'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Country_country'), 'australia', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Colors_colors'), 'white', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Sorted List_animals'), 
    'dog', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Sorted List_datepicker'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/a_Sa_ui-state-default ui-state-hover'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Sorted List_txtDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Next_ui-datepicker-month'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/a_Sa_ui-state-default ui-state-hover_1'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Sorted List_datepicker'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_Sorted List_txtDate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Next_ui-datepicker-year'), 
    '2022', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Testing Practice/select_Next_ui-datepicker-year_1'), 
    '2027', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/a_Sa_ui-state-default ui-state-hover_2'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/button_to_submit-btn'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/td'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/td_2'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_checkbox_1'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/td_3'))

WebUI.click(findTestObject('Object Repository/Page_Automation Testing Practice/input_checkbox_2'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Testing Practice/input_Section 1_input1'), 'TEst Test Submit Paragraph 1')

