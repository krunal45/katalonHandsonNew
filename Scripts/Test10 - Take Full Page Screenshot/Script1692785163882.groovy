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

List<TestObject> ignoredElements = new ArrayList();
ignoredElements.add(findTestObject('Object Repository/Frames/sampleAlertButton'));
WebUI.openBrowser("https://trytestingthis.netlify.app/")
//String imagePath = WebUI.takeFullPageScreenshot("/Users/krunalb/Katalon Studio/TestProject/Test Cases/Screenshots/fullPage.png");//Takes full Page screenshot.
//System.out.print("imagePath :"+imagePath);
//String path = WebUI.takeFullPageScreenshot(ignoredElements);
//System.out.print("imagePath :"+path);

path = WebUI.takeScreenshot("/Users/krunalb/Katalon Studio/TestProject/Test Cases/Screenshots/img2.png");
def timestamp = new Date().format("YYYY-MM-dd HH:mm:ss")
path = WebUI.takeScreenshot("/Users/krunalb/Katalon Studio/TestProject/Test Cases/Screenshots/img3.png", ["text" : timestamp]);
System.out.println("imagePath 3 :"+path);

//Take Area Screenshot : 
