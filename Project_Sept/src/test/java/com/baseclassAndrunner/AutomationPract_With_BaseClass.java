package com.baseclassAndrunner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POM.automationpractice.Casual_Dresses;
import com.POM.automationpractice.Evening_Dresses;
import com.POM.automationpractice.Login;
import com.POM.automationpractice.My_Account;
import com.POM.automationpractice.My_Store;
import com.POM.automationpractice.My_Store2;
import com.POM.automationpractice.Order;
import com.POM.automationpractice.Order_Confirmation;
import com.POM.automationpractice.Order_History;
import com.object.manager.Project_Object_Manager_AutomationPract;
import com.utility.Utility_Files;

public class AutomationPract_With_BaseClass extends Utility_Files{

	public static WebDriver driver = Utility_Files.get_Browser("chrome");
	
//public static	My_Store store = new My_Store(driver);
//public static Login logi = new Login(driver);
//               ===
	
public static Project_Object_Manager_AutomationPract manag_Autom = new Project_Object_Manager_AutomationPract(driver);	
	
	
	
	public static void main(String[] args) throws IOException {
		

	//	driver = get_Browser("chrome");


		get("http://automationpractice.com/index.php?controller=order&step=1");
		
	
		implicit_Wait(15);
	
	
//	WebElement signup = driver.findElement(By.xpath("//a[@class='login']"));
click_On_Element(manag_Autom.getStore().getSignup());
	/////


//	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
send_Keys(manag_Autom.getLogi().getEmail(), "autopract@gmail.com");

//WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
send_Keys(manag_Autom.getLogi().getPwd(), "Automation");

//WebElement signin = driver.findElement(By.xpath("(//button//parent::span)[3]"));
click_On_Element(manag_Autom.getLogi().getSignin());

//////

//	Actions ac = new Actions(driver);
		
//		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
//		ac.moveToElement(dresses).build().perform();
Actions(manag_Autom.getAccount().getDresses());
		
//		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
//		ac.moveToElement(casual).build().perform();
		Actions(manag_Autom.getAccount().getCasual());

//		ac.click().build().perform();
		click_On_Element(manag_Autom.getAccount().getCasual());
		
		
//		WebElement dress1 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//		dress1.click();
	click_On_Element(manag_Autom.getCasual_Dress().getDress1());
		
//	WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//	driver.switchTo().frame(frame);	
Frame_Method(manag_Autom.getCasual_Dress().getFrame());


//		WebElement q = driver.findElement(By.xpath("//i[@class='icon-plus']"));

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		
//		WebElement q2 = wait.until(ExpectedConditions.visibilityOf(q));
//		
//		q2.click();

		explicit_Visibility(manag_Autom.getCasual_Dress().getQuantity(), 15);
		
//	WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));


	 
//	Select ss = new Select(size);
//
//	ss.selectByValue("2");

	select_Value(manag_Autom.getCasual_Dress().getSize(), "2");
	
//		WebElement add2cart = driver.findElement(By.xpath("//span[.='Add to cart']"));
//		add2cart.click();
	click_On_Element(manag_Autom.getCasual_Dress().getAdd2cart());
		
//		WebElement proceed = driver.findElement(By.xpath("//span[normalize-space(.)='Proceed to checkout']"));
//		proceed.click();
		click_On_Element(manag_Autom.getCasual_Dress().getProceed());
         /////
		
		
//		WebElement p2check = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
//		p2check.click();
click_On_Element(manag_Autom.getOrder().getP2check());
//	WebElement p2check2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
//	p2check2.click();
click_On_Element(manag_Autom.getOrder().getP2check2());
//	WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
//	agree.click();
click_On_Element(manag_Autom.getOrder().getAgree());
//	WebElement p2check3 = driver.findElement(By.xpath("(//span[normalize-space(.)='Proceed to checkout'])[2]"));
//	p2check3.click();
click_On_Element(manag_Autom.getOrder().getP2check3());
//	WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
//	bank.click();
click_On_Element(manag_Autom.getOrder().getBank());
	
////

//WebElement conf = driver.findElement(By.xpath("//span[.='I confirm my order']"));
//	conf.click();
click_On_Element(manag_Autom.getStore2().getConfrim());

//	WebElement back2order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
//	back2order.click();
click_On_Element(manag_Autom.getOrder_conf().getBack2order());
//	TakesScreenshot ts = (TakesScreenshot) driver;
//
//	File source = ts.getScreenshotAs(OutputType.FILE);
//


//	File dest = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\s1.png");
//
//	FileUtils.copyFile(source, dest);

ScreenShot("D:\\New folder\\s3.png");


//WebElement signouta = driver.findElement(By.xpath("//a[@class='logout']"));
click_On_Element(manag_Autom.getOrder_History().getSignouta());


	//Second Order

send_Keys(manag_Autom.getLogi().getEmail(), "autopract@gmail.com");

//WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
send_Keys(manag_Autom.getLogi().getPwd(), "Automation");

//WebElement signin = driver.findElement(By.xpath("(//button//parent::span)[3]"));
click_On_Element(manag_Autom.getLogi().getSignin());


//	WebElement dresses2 = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
	//ac.moveToElement(dresses2).build().perform();
Actions(manag_Autom.getAccount().getDresses2());
//	WebElement evedress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
	//ac.moveToElement(evedress).click().build().perform();
Actions(manag_Autom.getAccount().getEvening());

click_On_Element(manag_Autom.getAccount().getEvening());


//WebElement clickdres = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
//	clickdres.click();
click_On_Element(manag_Autom.getEve_Dress().getClickdress2());

//	WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//	driver.switchTo().frame(frame2);	
Frame_Method(manag_Autom.getEve_Dress().getFrame2());
//	WebElement count2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
//	ac.doubleClick(count2).build().perform();;
Actions(manag_Autom.getEve_Dress().getCount2());
//	WebElement size2 = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));

//	Select s1 = new Select(size2);
//
//	s1.selectByValue("3");

	select_Value(manag_Autom.getEve_Dress().getSize2(), "3");
//	WebElement color2 = driver.findElement(By.name("Pink"));
//	color2.click();
click_On_Element(manag_Autom.getEve_Dress().getColor2());
//	WebElement add2car2 = driver.findElement(By.xpath("//span[.='Add to cart']"));
//	add2car2.click();
	
click_On_Element(manag_Autom.getEve_Dress().getAdd2cart2());
	

//WebElement checkout1 = driver.findElement(By.xpath("//span[normalize-space(.)='Proceed to checkout']"));
//	checkout1.click();
click_On_Element(manag_Autom.getEve_Dress().getCheckout1());

////
//WebElement checkout2 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
//	checkout2.click();
click_On_Element(manag_Autom.getOrder().getP2check2());
//	WebElement checkout3 = driver.findElement(By.xpath("//span[.='Proceed to checkout']"));
//	checkout3.click();
click_On_Element(manag_Autom.getOrder().getP2check2());
//	WebElement agree2 = driver.findElement(By.name("cgv"));
//	agree2.click();
click_On_Element(manag_Autom.getOrder().getAgree2());
//	WebElement checkout4 = driver.findElement(By.xpath("(//span[normalize-space(.)='Proceed to checkout'])[2]"));
//	checkout4.click();
click_On_Element(manag_Autom.getOrder().getCheckout4());
//	WebElement cheque = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
//	cheque.click();
click_On_Element(manag_Autom.getOrder().getCheque());
//	WebElement conf2 = driver.findElement(By.xpath("//span[.='I confirm my order']"));
//	conf2.click();
click_On_Element(manag_Autom.getStore2().getConfrim());
//	WebElement bac2ord = driver.findElement(By.xpath("//a[@title='Back to orders']"));
//	bac2ord.click();

click_On_Element(manag_Autom.getOrder_conf().getBack2order());
//	File source2 = ts.getScreenshotAs(OutputType.FILE);
//
//	File dest2 = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\s2.png");
//
//	FileUtils.copyFile(source2, dest2);

ScreenShot("D:\\New folder\\s4.png");
//	WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
//	signout.click();
		
	click_On_Element(manag_Autom.getOrder_History().getSignouta());
	}
	
	
}
