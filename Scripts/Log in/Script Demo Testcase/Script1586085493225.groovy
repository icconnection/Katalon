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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Open Browser
WebUI.openBrowser('https://www.worldometers.info/coronavirus/')

//Click View By Country
WebUI.click(findTestObject('Object Repository/Covid19 Manual Object Repo/Page_Coronavirus Update (Live) 1213194 Cases and 65600 Deaths from COVID-19 Virus Outbreak - Worldometer/a_view by country'))

//Search For Thailand
WebUI.setText(findTestObject('Object Repository/Covid19 Manual Object Repo/Page_Coronavirus Update (Live) 1213194 Cases and 65600 Deaths from COVID-19 Virus Outbreak - Worldometer/input_Search_form-control input-sm'), 
    'Thailand')

//Get Text
WebUI.getText(findTestObject('Object Repository/Covid19 Manual Object Repo/Page_Coronavirus Update (Live) 1213194 Cases and 65600 Deaths from COVID-19 Virus Outbreak - Worldometer/td_102'))

WebUI.getText(findTestObject('Object Repository/Covid19 Manual Object Repo/Page_Coronavirus Update (Live) 1213194 Cases and 65600 Deaths from COVID-19 Virus Outbreak - Worldometer/td_3'))

//Close Browser
WebUI.closeBrowser()

