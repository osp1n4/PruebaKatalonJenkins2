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

Mobile.startApplication('C:\\Users\\nevardo.ospina\\Downloads\\Apk\\exito1.apk', true)

Mobile.tap(findTestObject('Object Repository/Prueba-CasoFallido/Boton Log In  - Ingresar'), 0)

Mobile.tap(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.EditText - Correo electrnico'), 0)

Mobile.setText(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.EditText - Correo electrnico (1)'), 'poc.exito.correo1@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.EditText - Contrasea'), 0)

Mobile.setText(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.EditText - Contrasea (1)'), 'G2peMoDanx3TSd', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.Button - Ingresar'), 0)

Mobile.setText(findTestObject('Prueba-CasoFallido/android.widget.Button - Ingresar'), 'sddfsssssssssssssssssssss', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Prueba-CasoFallido/android.widget.TextView - Cmo quieres recibir tu pedido'), 
    '¿Cómo quieres recibir tu pedido?')

Mobile.closeApplication()

