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

Mobile.startApplication('C:\\Users\\nevardo.ospina\\Downloads\\Apk\\App_Exito.apk', true)

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.Button - Ingresar'), 0)

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.EditText - Correo electrnico'), 0)

Mobile.setText(findTestObject('Object Repository/Prueba/android.widget.EditText - Correo electrnico (1)'), 'poc.exito.correo1@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.EditText - Contrasea'), 0)

Mobile.setText(findTestObject('Object Repository/Prueba/android.widget.EditText - Contrasea (1)'), 'G2peMoDanx3TSd', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.Button - Ingresar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.TextView - Mi cuenta'), 0)

Mobile.tap(findTestObject('Object Repository/Prueba/android.widget.TextView - Mi perfil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Prueba/android.widget.EditText - Emilia'), 'Emilia')

Mobile.verifyElementText(findTestObject('Object Repository/Prueba/android.widget.EditText - Ospina'), 'Ospina')

Mobile.verifyElementText(findTestObject('Object Repository/Prueba/android.widget.EditText - 3141234567'), '3141234567')

Mobile.closeApplication()

