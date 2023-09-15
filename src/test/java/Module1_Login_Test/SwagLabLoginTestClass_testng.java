package Module1_Login_Test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import Module2_Menu.SwagLabMenuPage;

public class SwagLabLoginTestClass_testng  extends BaseClass
{
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;
	Sheet sh;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
	
		              initilizeBrowser();
	
		            login = new SwagLabLoginPage(driver);
		            home = new SwagLabHomePage(driver);
		            menu = new SwagLabMenuPage(driver);
	}
	
	@BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException
	{
		 
         login.enterUN(UtilityClass.getPFdata("UN"));
         login.enterPSW(UtilityClass.getPFdata("PSW"));
         login.clickLoginbtn();
	}
	
	@Test(priority=2)
	public void VerfyAddtoCartToRemoveBtn() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=102;
		Thread.sleep(2000);
	    home.clickOnArttocartBtn();
       String actResult = home.GetSwagLabHomePageremovetBtnResult();
       String expResult = (UtilityClass.getTestData(0, 2));
       Assert.assertEquals(actResult, expResult);
	}
	@Test(priority=1)
	public void VerfiyLogo() throws InterruptedException
	{
		TCID=102;
		Thread.sleep(2000);
		boolean actResult = home.getSwagLabHomePageLogoresult();
		Assert.assertTrue(actResult);
        
	}
	
	@AfterMethod
	public void LogoutFromApp(ITestResult s1) throws InterruptedException, IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
			
		{
			UtilityClass.captureSS(driver,TCID);
		}
		Thread.sleep(2000);
		home.clickOnMenuBtn();
		menu.Clickloutbtn();
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
       driver.quit();
	}
	
	
}
