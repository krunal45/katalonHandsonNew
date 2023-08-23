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

//WebUI.openBrowser("https://trytestingthis.netlify.app/");
//WebUI.click(findTestObject('Object Repository/Frames/sampleAlertButton'));
//WebUI.closeBrowser();

WebUI.openBrowser("https://the-internet.herokuapp.com/iframe");
boolean flag = WebUI.switchToFrame(findTestObject('Object Repository/Frames/iFrame'), 5, FailureHandling.STOP_ON_FAILURE);
System.out.print("switched To iFrame ? : "+flag);

String text = WebUI.getText(findTestObject('Object Repository/Frames/iframeTextBox'), FailureHandling.CONTINUE_ON_FAILURE);
System.out.println("Text fetched from iFrame TextBox : "+text);
WebUI.clearText(findTestObject('Object Repository/Frames/iframeTextBox'));
WebUI.setText(findTestObject('Object Repository/Frames/iframeTextBox'), "This is Sample text Entered from Krunal.");
text = WebUI.getText(findTestObject('Object Repository/Frames/iframeTextBox'), FailureHandling.CONTINUE_ON_FAILURE);
System.out.println("Text fetched from iFrame TextBox after Update: "+text);
WebUI.switchToDefaultContent();
WebUI.closeBrowser();