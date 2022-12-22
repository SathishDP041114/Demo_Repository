package org.Adactin;

import org.facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver2 = Chromebrowser();
		urlLaunch("https://adactinhotelapp.com/index.php");
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("SathishPD041114");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Sathish@2504");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		WebElement Location = driver.findElement(By.name("location"));
		Select s =new Select(Location);
		s.selectByIndex(8);
		
		WebElement Hotel = driver.findElement(By.name("hotels"));
		Select s1= new Select(Hotel);
		s1.selectByIndex(1);
		
		WebElement Roomtype = driver.findElement(By.name("room_type"));
		Select s3 = new Select(Roomtype);
		s3.selectByIndex(1);
		
		WebElement Nos = driver.findElement(By.name("room_nos"));
		Select s4 =new Select (Nos);
		s4.selectByIndex(1);
		
		WebElement Datein = driver.findElement(By.name("datepick_in"));
		Datein.sendKeys("01/01/2023");
		
		WebElement Dateout = driver.findElement(By.name("datepick_out"));
		Dateout.sendKeys("01/01/2024");
		
		WebElement a = driver.findElement(By.name("adult_room"));
		Select s5 =new Select(a);
		s5.selectByIndex(1);
		
		WebElement b = driver.findElement(By.name("child_room"));
		Select s6 =new Select(b);
		s6.selectByIndex(1);
		
		WebElement sub = driver.findElement(By.name("Submit"));
		sub.click();
		
		WebElement btn = driver.findElement(By.name("radiobutton_0"));
		btn.click();
		
		WebElement Con = driver.findElement(By.name("continue"));
		Con.click();
		
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Dummy");
		
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("Dummy");
		
		WebElement Address = driver.findElement(By.name("address"));
		Address.sendKeys("Dummy address");
		
		WebElement Cardno = driver.findElement(By.name("cc_num"));
		Cardno.sendKeys("1234567890123456");
		
		WebElement Cardtype = driver.findElement(By.name("cc_type"));
		Select s7 = new Select(Cardtype);
		s7.selectByIndex(1);
		
		WebElement Edate = driver.findElement(By.name("cc_exp_month"));
		Select s8 = new Select(Edate);
		s8.selectByIndex(10);
		
		WebElement edate = driver.findElement(By.name("cc_exp_year"));
		Select  s9 = new Select(edate);
		s9.selectByIndex(10);
		
		WebElement CVV = driver.findElement(By.name("cc_cvv"));
		CVV.sendKeys("123");
		
		WebElement Book = driver.findElement(By.name("book_now"));
		Book.click();
		
		Thread.sleep(5000);
		
		WebElement Order = driver.findElement(By.name("order_no"));
		String text = Order.getText();
		System.out.println(text);
		
	}

	
	
}
