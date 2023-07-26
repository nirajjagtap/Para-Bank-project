package sel_pak1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para_Bank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niraj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        //Registration functionality
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Niraj");
        driver.findElement(By.id("customer.lastName")).click();
        driver.findElement(By.id("customer.lastName")).sendKeys("jagtap");
        driver.findElement(By.cssSelector("input[name=\"customer.address.street\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"customer.address.street\"]")).sendKeys("Wardha");
        driver.findElement(By.id("customer.address.city")).click();
        driver.findElement(By.id("customer.address.city")).sendKeys("Wardha");
        driver.findElement(By.id("customer.address.state")).click();
        driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");
        driver.findElement(By.cssSelector("input[name=\"customer.address.zipCode\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"customer.address.zipCode\"]")).sendKeys("442001");
        driver.findElement(By.id("customer.phoneNumber")).click();
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9921873814");
        driver.findElement(By.id("customer.ssn")).click();
        driver.findElement(By.id("customer.ssn")).sendKeys("21554");
        driver.findElement(By.cssSelector("input[name=\"customer.username\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"customer.username\"]")).sendKeys("nirajjagtap");
        driver.findElement(By.xpath("//input[@name=\"customer.password\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"customer.password\"]")).sendKeys("Jd@12345");
        driver.findElement(By.id("repeatedPassword")).click();
        driver.findElement(By.id("repeatedPassword")).sendKeys("Jd@12345");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        Thread.sleep(3000);
        
        //Login functionality
        driver.findElement(By.cssSelector("input[name=username]")).click();
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys("nirajjagtap");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Jd@12345");
        driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
        Thread.sleep(3000);
        
        //Open New Account
        driver.findElement(By.linkText("Open New Account")).click();
        driver.findElement(By.id("type")).click();
        driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
        driver.findElement(By.id("fromAccountId")).click();
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
        Thread.sleep(3000);
        
        //Account Overview
        driver.findElement(By.linkText("Accounts Overview")).click();
        Thread.sleep(3000);
        
        
        //Update Contact Info
        driver.findElement(By.linkText("Update Contact Info")).click();
        driver.findElement(By.id("customer.firstName")).click();
        driver.findElement(By.id("customer.firstName")).clear();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jason");
        driver.findElement(By.id("customer.address.city")).click();
        driver.findElement(By.id("customer.address.city")).clear();
        driver.findElement(By.id("customer.address.city")).sendKeys("Pune");
        driver.findElement(By.id("customer.phoneNumber")).click();
        driver.findElement(By.id("customer.phoneNumber")).clear();
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("customer.lastName")).click();
        driver.findElement(By.id("customer.lastName")).clear();
        driver.findElement(By.id("customer.lastName")).sendKeys("John");
        driver.findElement(By.id("customer.address.city")).click();
        driver.findElement(By.id("customer.address.city")).clear();
        driver.findElement(By.id("customer.address.city")).sendKeys("Pune");
        driver.findElement(By.id("customer.address.state")).click();
        driver.findElement(By.id("customer.address.state")).clear();
        driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");
        driver.findElement(By.id("customer.address.zipCode")).click();
        driver.findElement(By.id("customer.address.zipCode")).clear();
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("14521");
        driver.findElement(By.cssSelector("input[value=\"Update Profile\"]")).click();
        Thread.sleep(2000);
        
        //Loan Request
        
        driver.findElement(By.linkText("Request Loan")).click();
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys("3000");
        driver.findElement(By.cssSelector("input#downPayment")).click();
        driver.findElement(By.cssSelector("input#downPayment")).sendKeys("10");
        driver.findElement(By.cssSelector("input[value=\"Apply Now\"]")).click();
        Thread.sleep(3000);
        
        //Logout
        driver.findElement(By.linkText("Log Out")).click();
             
             
        
        
        

	}

}
