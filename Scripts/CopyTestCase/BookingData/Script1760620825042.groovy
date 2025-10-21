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

WebUI.navigateToUrl('https://dummytravels.com/dummy-hotel')

WebUI.setText(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_First Name_firstName'), 'Jonh')

WebUI.setText(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_Last Name_lastName'), 'Cooper')

WebUI.setText(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_(city name)_city'), 'Mum')

WebUI.click(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/div_(city name)_airport-option'))

WebUI.setText(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_(to receive booking)_email'), 
    'john@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_Check-In Date_checkInDate'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/span_Sat_flatpickr-day today'))

WebUI.click(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/input_Check-Out Date_checkOutDate'))

WebUI.click(findTestObject('Object Repository/Page_Book Dummy Hotel - Dummy Travels/span_Sat_flatpickr-day'))

