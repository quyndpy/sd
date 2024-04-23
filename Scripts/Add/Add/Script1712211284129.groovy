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

WebUI.navigateToUrl('http://10.0.0.80:5021/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to APECDigital/input_Username'), '0966782524')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to APECDigital/input_Password'), '12345678')

WebUI.click(findTestObject('Object Repository/Page_Sign in to APECDigital/input_Remember'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/button_Add1'))

WebUI.click(findTestObject('Page_Room Type Mapping/div_Hotel'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_DEV Mandala'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_Market segment'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_BG - Business Group'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_Sub segment'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_CG - Coporate Group'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_Company'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_000013 - SK GOLF TOUR'))

WebUI.setText(findTestObject('Object Repository/Page_Room Type Mapping/textarea_r'), 's')

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/input_Start date - End date_startDate_endDate'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_5'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_6'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/span_Add'))

WebUI.scrollToElement(findTestObject('Page_Room Type Mapping/td_4418'), 0)

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_Type'))

WebUI.click(findTestObject('Object Repository/Page_Room Type Mapping/div_Suite 1PN'))

not_run: WebUI.click(findTestObject('Page_Room Type Mapping/div_2'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Room Type Mapping/div_2'), '2')

not_run: WebUI.setText(findTestObject('Page_Room Type Mapping/input_9_qty'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Room Type Mapping/Page_Room Type Mapping/div'))

WebUI.setText(findTestObject('Page_Room Type Mapping/input_9_rate'), '10')

