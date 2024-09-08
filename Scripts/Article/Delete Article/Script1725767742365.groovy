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

WebUI.navigateToUrl('https://medium.com/')

WebUI.click(findTestObject('Object Repository/Page_Medium Read and write stories/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Medium Read and write stories/a_Sign in with X'))

WebUI.setText(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Log in to Twitter_sessionusername_or_email'), 
    'rakhacimano')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Log in to Twitter_sessionpassword'), 
    '/8PG73wC/EaRPSXmU+0koQ==')

WebUI.click(findTestObject('Object Repository/Page_Twitter  Authorize an application/input_Sign in to Medium using your account_allow'))

WebUI.click(findTestObject('Object Repository/Page_Medium/div_Write_cn s x co cp cq z bn cr'))

WebUI.click(findTestObject('Object Repository/Page_Medium/div_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Rakha Putra Pratama  Medium/svg'))

WebUI.click(findTestObject('Object Repository/Page_Rakha Putra Pratama  Medium/button_Delete story'))

WebUI.click(findTestObject('Object Repository/Page_Rakha Putra Pratama  Medium/button_Delete'))
