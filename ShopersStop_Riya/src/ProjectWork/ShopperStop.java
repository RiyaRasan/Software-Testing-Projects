package ProjectWork;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class ShopperStop 
{
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\OneDrive\\Desktop\\SeleniumJar\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.shoppersstop.com/");
		w.manage().window().maximize();Thread.sleep(2000);

		Actions c=new Actions(w);		
		JavascriptExecutor js=(JavascriptExecutor) w;	
		
		//SignUp===================================================================================================================================
		Thread.sleep(2000);
		c.moveToElement(w.findElement(By.className("user"))).perform();Thread.sleep(5000);
		w.findElement(By.xpath("//*[contains(text(),'Sign up')]")).click();Thread.sleep(5000);
		w.findElement(By.id("signupFullName")).sendKeys("Riya Rasanbhaire");
		w.findElement(By.id("signupEmail")).sendKeys("rrasanbhaire@gmail.com");
		w.findElement(By.id("signupMobileNumber")).sendKeys("9920889646");
		w.findElement(By.id("signupPassword")).sendKeys("123456");
		w.findElement(By.id("women")).click();Thread.sleep(5000);
	
		w.findElement(By.partialLinkText("Sign")).click();
		
		//SignIn==========================================================================================================================================
		
		SignIn sign=new SignIn(w,c);    

		//Profile===================================================================================================================================
		Thread.sleep(2000);
		c.moveToElement(w.findElement(By.className("user"))).perform();Thread.sleep(5000);
		w.findElement(By.xpath("//*[contains(text(),'Profile')]")).click();Thread.sleep(5000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
	
		//Bargains Tab=>Other Offer=>Puma-UPTO 50% OFF click=>Navigate to=====================================================================================================================		
		
		c.moveToElement(w.findElement(By.linkText("BARGAINS"))).perform();
		c.moveToElement(w.findElement(By.linkText("Other Offer"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Puma-UPTO 50% OFF")).click();
		
		//Filter checkbox
		w.findElement(By.xpath("//body/main[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/form[1]/div[1]/label[1]")).click();
		Thread.sleep(3000);

		List<WebElement> list = w.findElements(By.id("primaryImage"));
		list.get(1).click();Thread.sleep(2000);
		w.findElement(By.xpath("//button[contains(text(),'Large')]")).click();Thread.sleep(2000);
		w.findElement(By.id("addToCartButton")).click();Thread.sleep(5000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
		
		//Women Tab=>Indian wear=>Kurtas click=>Navigate to=====================================================================================================================		
		
		c.moveToElement(w.findElement(By.linkText("WOMEN"))).perform();
		c.moveToElement(w.findElement(By.linkText("Indian wear"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Kurtas")).click();
		
		//List view
		Thread.sleep(5000);
		w.findElement(By.xpath("//*[@class='list-view']")).click();
		
		//Clicking 1 kurta
		Thread.sleep(3000);w.findElement(By.xpath("//div[contains(text(),'JUNIPER Womens Fuschia Chanderi Gold Foil Print A-')]")).click();Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");	Thread.sleep(2000);
		w.findElement(By.xpath("(//a[contains(text(),'Large')])[1]")).click();Thread.sleep(3000);
		w.findElement(By.id("addToCartButton")).click();Thread.sleep(3000);
	
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
		
		//Women Tab=>Watches=>Analog click=>Navigate to=====================================================================================================================		
		
		c.moveToElement(w.findElement(By.linkText("WOMEN"))).perform();
		c.moveToElement(w.findElement(By.linkText("Watches"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Analog")).click();
		
		//Clicking 1 watch
		List<WebElement> list1 = w.findElements(By.id("primaryImage"));
		list1.get(3).click();Thread.sleep(4000);
		w.findElement(By.id("addToCartButton")).click();Thread.sleep(2000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
					

		//Kids Tab=>Boys=>Shirts click=>Navigate to=================================================================================================
		
		c.moveToElement(w.findElement(By.linkText("KIDS"))).perform();
		c.moveToElement(w.findElement(By.linkText("Boys"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Shirts")).click();
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);

		//Kids Tab=>Toys=>Soft Toys click=>Navigate to=================================================================================================
		
		c.moveToElement(w.findElement(By.linkText("KIDS"))).perform();
		c.moveToElement(w.findElement(By.linkText("Toys"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Soft Toys")).click();
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);

		//BRANDS Tab=>Luxury Brands=>MAC click=>Navigate to=================================================================================================
		
		c.moveToElement(w.findElement(By.linkText("BRANDS"))).perform();
		c.moveToElement(w.findElement(By.linkText("Luxury Brands"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("MAC")).click();
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);

		//GIFTS Tab=>Wedding Gifts=>See All Wedding Gifts click=>Navigate to=================================================================================================
		
		c.moveToElement(w.findElement(By.linkText("GIFTS"))).perform();
		c.moveToElement(w.findElement(By.linkText("Wedding Gifts"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("See All Wedding Gifts")).click();
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
		
		//DISCOVER Tab=>Style Hub=>Fashion click=>Navigate to=================================================================================================
		
		c.moveToElement(w.findElement(By.linkText("DISCOVER"))).perform();
		c.moveToElement(w.findElement(By.linkText("Style Hub"))).perform();Thread.sleep(2000);
		w.findElement(By.linkText("Fashion")).click();
	
		Set <String> ob=w.getWindowHandles();						//Window handling
		Iterator <String> it=ob.iterator();
		String parent_window=it.next();
		String child_window=it.next();
		w.switchTo().window(child_window);Thread.sleep(2000);
		w.switchTo().window(parent_window);
		w.navigate().to("https://www.shoppersstop.com/discover");Thread.sleep(2000);

		//Search=========================================================================================================================================
		
		Thread.sleep(2000);
		w.findElement(By.name("text")).click();
		w.findElement(By.name("text")).sendKeys("Toys");
		w.navigate().to("https://www.shoppersstop.com/search/?text=toys");Thread.sleep(2000);
		
		//Filter checkbox
		w.findElement(By.xpath("//body/main[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/form[1]/div[1]/label[1]")).click();
		Thread.sleep(3000);
		
		//Filter checkbox
		w.findElement(By.xpath("//body/main[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[2]/form[1]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		
		//Scroll down the page by 1500 pixels
		
		js.executeScript("window.scrollBy(0,1500)");	Thread.sleep(2000);
		
		//Filter checkbox
		w.findElement(By.xpath("//body/main[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[8]/div[2]/ul[1]/li[4]/form[1]/div[1]/label[1]")).click();
		
		//List view
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@class='list-view']")).click();
		
		//Clicking on 1 toy
		Thread.sleep(3000);w.findElement(By.id("2HashPosition")).click();Thread.sleep(2000);
		
		//w.findElement(By.id("favouriteLink")).click();Thread.sleep(2000);			// for adding item to wishlist
		w.findElement(By.id("pincodetxt")).sendKeys("400708");
		w.findElement(By.className("codbtn")).click();
		js.executeScript("window.scrollBy(0,500)");	Thread.sleep(2000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
	
		//WishList==================================================================================================================================
		
		w.findElement(By.className("wishlist")).click();Thread.sleep(5000);
		//w.findElement(By.xpath("//form[@id='addToCartForm']")).click();Thread.sleep(3000);
		//w.findElement(By.xpath("//a[contains(text(),'Small')]")).click();Thread.sleep(3000);
		//w.findElement(By.xpath("//form[@id='addToCartForm']")).click();Thread.sleep(3000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);


		//Cart==================================================================================================================================
		
		if(w.findElement(By.xpath("//a[contains(@href, '/cart')]")).isDisplayed())
		{
				w.findElement(By.xpath("//a[contains(@href, '/cart')]")).click();Thread.sleep(3000);
		}
		else
		{
			w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
			w.findElement(By.xpath("//a[contains(@href, '/cart')]")).click();Thread.sleep(3000);
		}
				
		w.findElement(By.xpath("//button[contains(text(),'CHECKOUT')]")).click();Thread.sleep(2000);
				
		if(w.getCurrentUrl().equals("https://www.shoppersstop.com/login/checkout"))
		{
			w.findElement(By.id("checkout_username")).sendKeys("rrasanbhaire@gmail.com");
			w.findElement(By.id("checkout_password")).sendKeys("123456");
			w.findElement(By.id("checkout-login-existuser")).click();Thread.sleep(2000);
		}
		else
		{
			Thread.sleep(2000);
		}
	
		//Check out===============================================================================================================================
		
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[contains(text(),'Modify')]")).click();
		w.findElement(By.id("postcode")).sendKeys("400708");Thread.sleep(2000);
		w.findElement(By.id("townCity")).sendKeys("Airoli");Thread.sleep(2000);
		w.findElement(By.id("address1")).sendKeys("sector 4, Airoli");Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");	
		w.findElement(By.id("checkout_proceed_to_pay_submit")).click();Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");Thread.sleep(2000);
		
		//Clicking Netbanking 
		w.findElement(By.xpath("//body/main[1]/section[2]/div[1]/div[1]/div[3]/div[4]/div[3]/div[3]/ul[1]/li[4]/a[1]")).click();Thread.sleep(2000);
		//Selecting SBI bank
		w.findElement(By.xpath("//*[contains(text(),'SBI')]")).click();Thread.sleep(2000);
		//Click on Pay button
		w.findElement(By.id("orderSubmitNetbanking")).click();Thread.sleep(2000);
		
		//Taking screenshot
		
		TakesScreenshot t=(TakesScreenshot) w;			//TakesScreenshot is an interface which convert webdriver object to screenshot object
		File obj=t.getScreenshotAs(OutputType.FILE);		//getScreenshotAs() helps to get image file
		Files.copy(obj, new File("D:\\\\RIYA\\\\Software  Testing\\\\Eclipse Projects\\\\ShopersStop_Riya\\\\src\\\\SystemIntegration.jpg")); //Copy files to desired location

		
		w.navigate().back();Thread.sleep(2000);	
		w.navigate().back();Thread.sleep(2000);	
		Alert A=w.switchTo().alert();Thread.sleep(2000);				//Switching to alert
		String alertMessage=w.switchTo().alert().getText();Thread.sleep(2000);	 // To get alert message displayed on alert box
		System.out.print(alertMessage);Thread.sleep(2000);				//Print alert msg
		A.accept();Thread.sleep(3000);
		
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);	
		
		//Orders===============================================================================================================================
		
		Thread.sleep(2000);
		c.moveToElement(w.findElement(By.className("user"))).perform();Thread.sleep(3000);
		w.findElement(By.xpath("//a[contains(text(),'Orders')]")).click();Thread.sleep(5000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);

		//Track Order============================================================================================================================
		
		js.executeScript("window.scrollBy(0,2700)");	Thread.sleep(2000);Thread.sleep(2000);
		w.findElement(By.xpath("//div/div/ul/li/div/ul/li[2]/a")).click();Thread.sleep(2000);	
		w.findElement(By.name("email")).sendKeys("rrasanbhaire@gmail.com");
		w.findElement(By.name("orderCode")).sendKeys("xyz");Thread.sleep(2000);
		w.findElement(By.className("sbt-button")).click();Thread.sleep(2000);
		w.navigate().to("https://www.shoppersstop.com/");

		//Find places we deliver===============================================================================================================================	
	
		js.executeScript("window.scrollBy(0,2500)");	Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(@href, '/findplaces')]")).click();Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");	Thread.sleep(2000);
		w.findElement(By.id("pincode")).sendKeys("400708");
		w.findElement(By.className("sbt-button")).click();	Thread.sleep(5000);
		w.navigate().to("https://www.shoppersstop.com/");

		//All Stores=========================================================================================================================================
		
		w.findElement(By.linkText("All Stores")).click();
		Thread.sleep(2000);
		Select ss=new Select(w.findElement(By.name("cityName")));		//	Create object of Select class and find Dropdown
		ss.selectByVisibleText("Navi Mumbai");							//	Select Option 2 in dropdown menu
		Thread.sleep(2000);
		Select sss=new Select(w.findElement(By.name("pointOfServices")));		
		sss.selectByIndex(2);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
		
		//Contact Us=========================================================================================================================================
		
		w.findElement(By.linkText("Contact Us")).click();
		w.findElement(By.name("firstName")).clear();
		w.findElement(By.name("firstName")).sendKeys("Riya");
		w.findElement(By.name("lastName")).clear();
		w.findElement(By.name("lastName")).sendKeys("Rasanbhaire");
		w.findElement(By.name("emailID")).clear();
		w.findElement(By.name("emailID")).sendKeys("abc@gmail.com");
		w.findElement(By.name("mobile")).clear();
		w.findElement(By.name("mobile")).sendKeys("9087654321");
		w.findElement(By.name("orderNumber")).clear();
		w.findElement(By.name("orderNumber")).sendKeys("105");
		Thread.sleep(3000);		
		Select sssss=new Select(w.findElement(By.name("IssueCategory")));		
		sssss.selectByIndex(3);
		
		w.findElement(By.name("Comments")).sendKeys("I have a query.. Can i do testing of this website?");		
		w.findElement(By.xpath("//button[contains(text(),'SUBMIT')]")).click();
		w.navigate().to("https://www.shoppersstop.com/");
		
		//INSTANT GIFTING===============================================================================================================================
		
		js.executeScript("window.scrollTo(0,116.80000305179781)");	Thread.sleep(10000);
		w.findElement(By.xpath("(//a[contains(text(),'Instant Gifting')])[3]")).click();Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");	Thread.sleep(2000);
		w.findElement(By.id("giftcard")).sendKeys("123456789");Thread.sleep(2000);
		w.findElement(By.id("giftcardSubmit")).click();Thread.sleep(2000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
		
		//Career===============================================================================================================================
		
		js.executeScript("window.scrollTo(0,116.80000305179781)");	Thread.sleep(2000);
		w.findElement(By.xpath("//div/div/ul/li[3]/div/ul/li[5]/a")).click();	Thread.sleep(5000);
		w.findElement(By.xpath("//p[@id='find-your-spot']")).click();Thread.sleep(2000);
		//w.findElement(By.id("title")).click();		//Choose file clicked
		// File to be uploaded selected
		//w.findElement(By.name("fileUpload")).sendKeys("D:\\RIYA\\Software  Testing\\Eclipse Projects\\ShopersStop_Riya\\src\\TestingFile.xlsx");
		//w.findElement(By.id("upload")).click();			Thread.sleep(5000);		//Click on upload button
		w.findElement(By.className("home-btn")).click();Thread.sleep(2000);
		w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
			
		//Sign Out===============================================================================================================================
	
		Thread.sleep(2000);
		c.moveToElement(w.findElement(By.className("user"))).perform();Thread.sleep(3000);
		w.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();Thread.sleep(5000);

		Thread.sleep(2000);w.quit();
	}

}
