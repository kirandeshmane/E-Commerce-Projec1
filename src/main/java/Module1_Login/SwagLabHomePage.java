package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
    @FindBy(xpath="//div[@class='app_logo']") private WebElement Logo;
    @FindBy(xpath="//div[@class='bm-burger-button']") private WebElement menuBtn;
    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement clickonAddtoCart;
    @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") private WebElement RemoveBtn;
    
    public SwagLabHomePage (WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
  /*  public void LogoVerify()
    {
    	boolean result = Logo.isDisplayed();
    	if(result==true)
    	{
    		System.out.println("Logo Found --- tc Pass");
    	}
    	
    	else
    	{
    		System.out.println("Logon not Found --- tc Fail");
    	}
    }
    */
    public boolean getSwagLabHomePageLogoresult()
    {
    	boolean result = Logo.isDisplayed();
    	return result;
    	
    }
    
    public void clickOnMenuBtn()
    {
    	menuBtn.click();
    }
    
    public void clickOnArttocartBtn()
    {
    	clickonAddtoCart.click();
    }
   
    public String GetSwagLabHomePageremovetBtnResult()
    {
    	String acttext = RemoveBtn.getText();
    	return acttext;
    }
    
    
    
    /*
    public void VerifyremovetBtn(String exptext)
    {
    	String acttext = RemoveBtn.getText();
    	
    	if(acttext.equals(exptext))
    	{
    		System.out.println("pass");
    	}
    	else 
    	{
    		System.out.println("fail");
		}
    }
    */
}