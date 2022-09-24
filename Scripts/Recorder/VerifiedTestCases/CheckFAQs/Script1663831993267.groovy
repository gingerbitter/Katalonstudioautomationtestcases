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

Mobile.startApplication('C:\\Users\\Prabhakar\\Downloads\\Aulas.apk', true)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - UPDATE NOW (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - RESTART AULAS (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (42)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText - Mobile Number (8)'), '7483093376')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - CONTINUE (8)'), 0)

Mobile.hideKeyboard()
Mobile.hideKeyboard()
Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText (11)'), '592726')
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - VERIFY (12)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Schedule'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.ImageView (15)'), 0)


Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - More'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Account Details (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - aulas Care (1)'), 0)

Mobile.scrollToText('FAQs')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - FAQs (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - What is aulas (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - What is aulas (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - How can an institute get onboard aulas (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - How can an institute get onboard aulas (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Technical specifications (1)'), 0)
Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Technical specifications (1)'), 0)

Mobile.closeApplication()

