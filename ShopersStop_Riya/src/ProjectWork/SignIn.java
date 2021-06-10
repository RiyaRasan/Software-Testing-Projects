package ProjectWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SignIn 
{
	public SignIn(WebDriver w, Actions c) throws InterruptedException, IOException 
	{
		//Find file_path
	FileInputStream I=new FileInputStream("D:\\RIYA\\Software  Testing\\Eclipse Projects\\ShopersStop_Riya\\src\\ShopersStopLOGIN.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(I);	// Find workbook
	XSSFSheet s=wb.getSheet("Credentials");	//Find sheet in workbook
			
	c.moveToElement(w.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]/img[1]"))).perform();Thread.sleep(2000);
	w.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			
			for(int i=0;i<=s.getLastRowNum();i++)
			{
				System.out.println("Credential "+(i+1));
				String un=s.getRow(i).getCell(0).toString();// [i][0] cells ==getting usernames from excel sheet
				System.out.println(un);
			
				String pwd=s.getRow(i).getCell(1).toString();//[0][1] cells ==getting passwords from excel sheet
				System.out.println(pwd);
				
				//Taking username and password from Excelsheet---------------------------------------------------------------------------
				w.findElement(By.xpath("//input[@id='j_username']")).sendKeys(un);
				w.findElement(By.xpath("//input[@id='j_password']")).sendKeys(pwd);
				Thread.sleep(4000);w.findElement(By.xpath("//button[@id='loginajax']")).click();Thread.sleep(2000);
				
				
				if((un.equals("rrasanbhaire@gmail.com"))&&(pwd.equals("123456"))||(un.equals("8669043136"))&&(pwd.equals("Priya@18")))
				{	
					s.getRow(i).createCell(2).setCellValue("Login done");// In excel sheet
					System.out.println("Shoppersstop.com login successfully done");	
					wb.write(new FileOutputStream("D:\\RIYA\\Software  Testing\\Eclipse Projects\\ShopersStop_Riya\\src\\ShopersStopLOGIN.xlsx"));
					break;
				}
				else 
				{	
					s.getRow(i).createCell(2).setCellValue("Login failed");// In excel sheet
					System.out.println("Login failed\n");
					w.findElement(By.xpath("//input[@id='j_username']")).clear();
					w.findElement(By.xpath("//input[@id='j_password']")).clear();
				}	
				wb.write(new FileOutputStream("D:\\RIYA\\Software  Testing\\Eclipse Projects\\ShopersStop_Riya\\src\\ShopersStopLOGIN.xlsx"));
			}	w.navigate().to("https://www.shoppersstop.com/");Thread.sleep(2000);
	}

}
