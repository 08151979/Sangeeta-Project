package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddContactPage extends BasePage {

	WebDriver driver;
	
	public void AddContact(WebDriver driver) {
		this.driver = driver;
	}
	
      @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_ELEMENT;
	  @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;

      @FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
      
      @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADRESS_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")WebElement STATE_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")WebElement ZIP_ELEMENT;
      @FindBy(how = How.XPATH,using = "//select[@id='country']")WebElement COUNTRY_ELEMENT;
      @FindBy(how = How.XPATH, using = "//select[@id='tags']")WebElement BOX_ELEMENT;
      @FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")WebElement CLICKABLE_ELEMENT;
      
      public void verifyAddContact() {
    	  Assert.assertEquals(ADD_CONTACT_ELEMENT.getText(), "Add Contact", "wrong page");
      }
      
      public void insertFullName(String fullName) {
    	  
    	  int insertName =  generateRandom(999);
    	  FULL_NAME_ELEMENT.sendKeys(insertName + fullName);
      }
      

	public void selectCompanyDropdown(String company) {
    	  selectDropdown(COMPANY_ELEMENT, company);
    
	}
     
	public void insertEmial(String email){
		
		EMAIL_ELEMENT.sendKeys(generateRandom(99) + email);
    	
      }
	public void insertPhone(String phone) {
		int phoneNum = generateRandom(999);
		PHONE_ELEMENT.sendKeys(phone + phoneNum);
	}
	public void inserAdress(String adress) {
		ADRESS_ELEMENT.sendKeys(adress);
	}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
     public void insertState(String state) {
    	 STATE_ELEMENT.sendKeys(state);
     }
     public void insertZip(String zip) {
    	 ZIP_ELEMENT.sendKeys(zip);
    	 
     }
     public void selectDropdownCountry(String country) {
    	 Select sel = new Select( COUNTRY_ELEMENT);
    	 selectDropdown(COUNTRY_ELEMENT, country);
     }
     public void selectDropdownTag(String box) {
       selectDropdown(BOX_ELEMENT, box);
    	 
     }
     public void clickButton() {
    	 CLICKABLE_ELEMENT.click();
     }
     public void tearDown() {
    	 driver.close();
    	 driver.quit();
     }
}