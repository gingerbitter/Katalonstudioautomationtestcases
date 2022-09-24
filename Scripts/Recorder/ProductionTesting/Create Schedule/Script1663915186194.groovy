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
Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - UPDATE NOW (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - RESTART AULAS (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (39)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (40)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText - Mobile Number (7)'), '9399613815')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - CONTINUE (7)'), 0)
Mobile.hideKeyboard()
Mobile.hideKeyboard()
Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText (10)'), '592726')
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - VERIFY (11)'), 0)

Mobile.scrollToText('Production testing.')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Production testing (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Next (6)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (48)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (49)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Subject'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (22)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Class (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (23)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Teacher (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (24)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (25)'), 0)

Mobile.scrollToText('Last Date')

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (26)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (27)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Th'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (28)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.View - 20'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (4)'), 0)

//Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - SAVE'), 0)

Mobile.closeApplication()

