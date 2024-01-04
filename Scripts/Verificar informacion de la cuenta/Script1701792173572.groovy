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

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Button - Ingresar - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Click - Campo- Correo electrnico'), 
    0)

Mobile.setText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Agregar Correo electrnico'), 
    'poc.exito.correo1@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Click - Campo- Contrasea'), 0)

Mobile.setText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/agregar - Contrasea'), 'G2peMoDanx3TSd', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Button Confirmar - Ingreso de datos correo y password'), 
    0)

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Boton- Mi cuenta'), 0)

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Boton - Mi perfil'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Text - Emilia'), 
    'Emilia')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Text - Ospina'), 
    'Ospina')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Fecha-01121979'), 
    '01/12/1979')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Text - Cdula de ciudadana'), 
    'Cédula de ciudadanía')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/TextCedula - 100001'), 
    '100001')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/TextTelefono - 3141234567'), 
    '3141234567')

Mobile.verifyElementText(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/TextCorreo - poc.exito.correo1gmail.com'), 
    'poc.exito.correo1@gmail.com')

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Button-atras-datos de perfil'), 
    0)

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Boton - Cerrar sesin'), 0)

Mobile.tap(findTestObject('Object Repository/Verificación datos del usuario en la cuenta/Boton Aceptar- Cerrar Sesion'), 
    0)

Mobile.closeApplication()

