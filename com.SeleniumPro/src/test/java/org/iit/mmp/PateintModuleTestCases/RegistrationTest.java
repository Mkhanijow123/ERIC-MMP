package org.iit.mmp.PateintModuleTestCases;

import org.iit.mmp.patientModulePages.RegistrationPage;
import org.iit.mmpBase.HelperRegistration;
import org.iit.mmpBase.TestRegister;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class RegistrationTest extends TestRegister
{
	
		@Test
	public void register() throws InterruptedException
	{
			
						
			HelperRegistration helperObj= new HelperRegistration(driver);		 
			helperObj.invokeTheApllication("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
			helperObj.navigateRegisterModule();
		
				 		
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.registrationPg();
		
	SoftAssert sAssert = new SoftAssert();
	sAssert.assertAll();
	
			
		}
	
	
}
	



	
	
	


		


