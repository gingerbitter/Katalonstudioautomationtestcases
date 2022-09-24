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

Mobile.startApplication('C:\\Users\\Nandini\\Downloads\\Aulas.apk', true)
Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - UPDATE NOW'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - RESTART AULAS'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText - Mobile Number'), '9482787984')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - CONTINUE'), 0)


//WebUI.waitForElementVisible(findTestObject('Object Repository/testcase/android.widget.EditText'), 0)
Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText-verification code'), '592726',0)


Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - VERIFY'), 0)



//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Brigosha Center of Excellence (1)'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (2)'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Brigosha'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Next (5)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (23)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (24)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.ImageView (9)'), 0)

Mobile.closeApplication()

