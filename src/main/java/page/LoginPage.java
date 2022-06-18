package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	// For the POM we can not use two of theat techinique Which is Web and By Class
	// only we use for the POM @FindBy(how = How.XPATH, using = "//*[@id="username"]")
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	//webelement
	 @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT; 
     @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
     @FindBy(how = How.XPATH,using =  "/html/body/div/div/div/form/div[3]/button") WebElement SIGN_ELEMENT;
     
     //Interactable method
     public void insertUserName(String userName) {
    	 USERNAME_ELEMENT.sendKeys(userName);
     }
     public void insertPassWordName(String password) {
    	 PASSWORD_ELEMENT.sendKeys(password);
     }
     public void clickSignInButton() {
    	 SIGN_ELEMENT.click();
     }
}
