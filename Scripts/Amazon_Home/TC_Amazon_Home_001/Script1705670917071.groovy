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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon Sign-In/input_email'), 'gokakaran2@gmail.com')

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon Sign-In/input_password'), 'HJY6UhajWA/v5VsB+/qBYg==')

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.setText(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com  thermometer/input_field-keywords'), 'Thermometer ')

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com  thermometer/inputnav-search-submit-button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com  thermometer/span_ThermoScan 6, IRT6515  Digital Ear The_0d297b'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com Braun ThermoScan6,IRT6515 D_69136c/a_View Your List'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com/a_Braun ThermoScan6,IRT6515 DigitalEar Ther_f832aa'), 
    'Braun ThermoScan 6, IRT6515 – Digital Ear Thermometer for Adults, Babies, Toddlers and Kids – Fast, Gentle, and Accurate with Color Coded Results')

WebUI.click(findTestObject('Object Repository/Amazon_Home001_OR/Page_Amazon.com/input_submit.deleteItem'))

WebUI.closeBrowser()

