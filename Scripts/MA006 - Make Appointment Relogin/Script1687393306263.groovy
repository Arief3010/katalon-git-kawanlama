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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Login page/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Login page/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login page/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Make appointment page/select_Facility'))

WebUI.click(findTestObject('Make appointment page/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Make appointment page/label_Medicare'))

WebUI.setText(findTestObject('Make appointment page/input_Visit Date'), '25/06/2023')

WebUI.setText(findTestObject('Make appointment page/input_Comment'), 'Make appointment and relogin')

WebUI.click(findTestObject('Make appointment page/button_Book Appointment'))

WebUI.delay(10)

WebUI.click(findTestObject('Make appointment page/Burger menu'))

WebUI.click(findTestObject('Make appointment page/Burger menu_Logout'))

WebUI.delay(3)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Login page/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Login page/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login page/button_Login'))

WebUI.delay(3)

WebUI.closeBrowser()

