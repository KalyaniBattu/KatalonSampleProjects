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

WebUI.navigateToUrl('https://jqueryui.com/selectmenu/')

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/span_Select a speed_ui-selectmenu-icon ui-i_3da000'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/div_Fast_ui-id-5'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/span_Select a file_ui-selectmenu-icon ui-ic_689415'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/div_Other files_ui-id-8'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/span_Select a number_ui-selectmenu-text'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/div_Some other file with a very long option_420134'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/span_Select a title_salutation-button'))

WebUI.click(findTestObject('Object Repository/Page_Selectmenu  jQuery UI/div_Mr_ui-id-31'))

WebUI.closeBrowser()

