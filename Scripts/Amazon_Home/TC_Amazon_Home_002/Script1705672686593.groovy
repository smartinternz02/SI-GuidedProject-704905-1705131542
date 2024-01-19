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

WebUI.setText(findTestObject('Object Repository/Amazon_Home002_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'gift cards amazon ecard')

WebUI.click(findTestObject('Object Repository/Amazon_Home002_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Home002_OR/Page_Amazon.com  gift cards amazon ecard/span_Amazon.com eGift Card'))

WebUI.click(findTestObject('Object Repository/Amazon_Home002_OR/Page_Amazon.com Amazon eGift Card - Amazon _bad889/input_submit.gc-add-to-cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Amazon_Home002_OR/Page_Amazon.com Amazon eGift Card - Amazon _bad889/h2_2. Enter your gift card detailsThis Gift_27c7ed'), 
    '2. Enter your gift card details\nThis Gift Card can only be used to purchase eligible goods and services available on Amazon.com, and cannot be used on Amazon websites in other countries.')

WebUI.closeBrowser()

