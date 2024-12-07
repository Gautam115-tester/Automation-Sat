package hybridDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SauceDemo {
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://www.saucedemo.com/");
		SauceDemoRepo r = new SauceDemoRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\Lab-03-Demo\\Desktop\\Gautam Document\\SauceDemoHDF.xls");
		HSSFWorkbook work = new HSSFWorkbook(fis);
		HSSFSheet sheet = work.getSheet("Sheet1");
		for(int i = 1; i <= 6; i++) {
			HSSFRow row = sheet.getRow(i);
			HSSFCell username = row.getCell(0);
			HSSFCell password = sheet.getRow(1).getCell(1);
			for(int j = 1;j <= 3;j++) {
				HSSFRow row1 = sheet.getRow(j);
				HSSFCell teststep = row1.getCell(2);
			String convert = teststep.toString();	
			try {
				if (convert.equals("Login")) {
					Thread.sleep(2000);
					r.login(username.toString(), password.toString());
				}else if (convert.equals("Add to cart")) {
					Thread.sleep(2000);
					r.addToCart();
				}else if (convert.equals("Logout")) {
					r.logout();
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new 
						File("C:\\Users\\Lab-03-Demo\\Desktop\\Gautam Document\\notepad\\"+username.toString()+" "+password.toString()+".png"));
				
			}
				 
			}
		}
		
		
		

	}

}
