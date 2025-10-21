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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory


// Load test data
def tabData = TestDataFactory.findTestData('Data Files/WebTabDD')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3.org/WAI/demos/bad/before/home.html')

// Loop through each row (each tab name)
for (def row = 1; row <= tabData.getRowNumbers(); row++) {
	String tabName = tabData.getValue('tabName', row)
	
	// Click the tab based on name
	WebUI.click(findTestObject('Object Repository/Page_w3org_WebTabCheck/img_Today_nav_' + tabName))
	
	// Verify the tab content or header
	WebUI.verifyTextPresent(tabName, false)
	
	println("✅ Verified tab: " + tabName)
}

//WebUI.click(findTestObject('Object Repository/Page_w3org_WebTabCheck/img_Today_nav_home'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_w3org_WebTabCheck/p_Today_headline'), 'Welcome to CityLights')

//String pagetitle = WebUI.getText(findTestObject('Page_w3org_WebTabCheck/p_Today_headline', [('variable') : 'Welcome to CityLights']))

//println ("  Title is " + pagetitle)
//WebUI.click(findTestObject('Object Repository/Page_w3org_WebTabCheck/img_Today_nav_home'))


WebUI.closeBrowser()

