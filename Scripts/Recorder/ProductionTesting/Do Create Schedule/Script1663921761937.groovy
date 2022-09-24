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

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - UPDATE NOW (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - RESTART AULAS (4)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (50)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (51)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText - Mobile Number (9)'), '9399613815')

Mobile.hideKeyboard()

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - CONTINUE (9)'), 0)
Mobile.hideKeyboard()
Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText (13)'), '592726')
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - VERIFY (13)'), 0)

Mobile.scrollToText('Production testing.')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Production testing (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Next (7)'), 0)

Mobile.hideKeyboard()

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (52)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (53)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Subject (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (29)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Class (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (30)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Teacher (2)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (31)'), 0)

Mobile.scrollToText('Repeat on')

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (32)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (33)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (3)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (4)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (5)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - W'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (34)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.View - 28'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (6)'), 0)

Mobile.scrollToText('SAVE')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - SAVE (1)'), 0)

Mobile.closeApplication()

