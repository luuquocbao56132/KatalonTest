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
import java.util.Random
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

Random random = new Random()
int randomNumber = random.nextInt(1000) 

String username = "user${randomNumber}"
String email = "user${randomNumber}@test.com"
String password = "Pass@${randomNumber}"


WebUI.openBrowser('')

WebUI.navigateToUrl('https://page-rhythm-front-end.onrender.com')

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-input-info'))

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-input-info'), 
    username)

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-input-info'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-input-info'), 
    email)

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-fir_7c751d'), 
    password)

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/input_Sign up to continue_register-page-sec_cbf5a7'), 
    password)

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/Date input'),
	'22-12-2222')

WebUI.setText(findTestObject('Object Repository/Page_PageRhythm/textarea_d'), 'f')

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/input_I agree with the_agree-terms'))

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/button_Sign up'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PageRhythm/a_My Library'), 10)

WebUI.click(findTestObject('Object Repository/Page_PageRhythm/a_My Library'))

