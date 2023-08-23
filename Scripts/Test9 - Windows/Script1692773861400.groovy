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

WebUI.openBrowser("https://the-internet.herokuapp.com/windows");
WebUI.click(findTestObject('Object Repository/window/clickHereLink'));
String text = WebUI.getText(findTestObject('Object Repository/window/newWindowText'));
System.out.println("Text : "+text)
//WebUI.switchToWindowIndex(0); // Switching windows based on window index.
//WebUI.switchToWindowTitle("The Internet");// Switching windows based on window Title.
WebUI.switchToWindowUrl("https://the-internet.herokuapp.com/windows");//Switching windows based on window url.

//Taking Element screenshot :
String path = WebUI.takeElementScreenshot("/Users/krunalb/Katalon Studio/TestProject/Test Cases/Screenshots/scr1.png",findTestObject('Object Repository/window/clickHereLink'));
System.out.println("File Path :"+path);

