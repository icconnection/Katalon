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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.worldometers.info/coronavirus/')

WebUI.click(findTestObject('Object Repository/Covid-19 Object Repo/Page_Coronavirus Update (Live) 1204075 Case_106633/a_view by country'))

WebUI.setText(findTestObject('Object Repository/Covid-19 Object Repo/Page_Coronavirus Update (Live) 1204075 Case_106633/input_Search_form-control input-sm'), 
    'Thailand')

'Get New Cases'
WebUI.getText(findTestObject('Covid-19 Object Repo/Page_Coronavirus Update (Live) 1204075 Case_106633/td_102'))

'Get New Deaths'
WebUI.getText(findTestObject('Covid-19 Object Repo/Page_Coronavirus Update (Live) 1204075 Case_106633/td_3'))

WebUI.closeBrowser()

