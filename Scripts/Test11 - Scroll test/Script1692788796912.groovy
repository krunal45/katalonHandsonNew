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

WebUI.openBrowser("https://trytestingthis.netlify.app/");
WebUI.delay(3);
WebUI.maximizeWindow();
WebUI.delay(3);
//WebUI.scrollToElement(findTestObject('Object Repository/ScrollExample/longMSGTextBox'), 3);
//WebUI.delay(3);
//WebUI.setText(findTestObject('Object Repository/ScrollExample/longMSGTextBox'), "Have Reached Destination");
//WebUI.delay(3);

int height = WebUI.getPageHeight();
int width = WebUI.getPageWidth();
System.out.println("Height :"+height);
System.out.println("Width :"+width);

int moveToX = width/2;
int moveToY = height/2;
WebUI.scrollToPosition(moveToX, moveToY);
WebUI.delay(3);