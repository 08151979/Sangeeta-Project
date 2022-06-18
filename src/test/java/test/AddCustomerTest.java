package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	@Test
	public void vailidUserShouldBeAbleToCreateCustomer() {
		  driver = BrowserFactory.init();
		  LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		  login.insertUserName("demo@techfios.com");
		  login.insertPassWordName("abc123");
		  login.clickSignInButton();
		  
		  DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		  dashboardPage.clickCustomerMenuButton();
		  dashboardPage.clickAddCustomerButton();
		  
		  AddContactPage  addCustomerPage = PageFactory.initElements(driver, AddContactPage.class);
		  addCustomerPage.verifyAddContact();
		  addCustomerPage.insertFullName("Selenium December");
		  addCustomerPage.selectCompanyDropdown("Techfios");
		  addCustomerPage.insertEmial("sjtechfios@abc.com");
		  addCustomerPage.insertPhone("123-090");
		  addCustomerPage.inserAdress("43Carrolton ,Texas");
		  addCustomerPage.insertCity("Dallas");
		  addCustomerPage.insertState("FLorida");
		  addCustomerPage.insertZip("23400");
		  addCustomerPage.selectDropdownCountry("United Kingdom");
		  addCustomerPage.selectDropdownTag("Nicho");
		  addCustomerPage.clickButton();
		driver.close();
		driver.quit();
	}

}
