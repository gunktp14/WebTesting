

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MakeAppointment {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.id("vfb-5")).sendKeys("Kuttapat"); 
		driver.findElement(By.id("vfb-7")).sendKeys("Somwang"); 
		//WebElement radio1 = driver.findElement(By.id("vfb-31-1")); 
		//radio1.click();  
		driver.findElement(By.id("vfb-13-address")).sendKeys("Nakhonpathom");   
		driver.findElement(By.id("vfb-13-address-2")).sendKeys("207");  
		driver.findElement(By.id("vfb-13-city")).sendKeys("Lumpaya");   
		driver.findElement(By.id("vfb-13-state")).sendKeys("-");  
		driver.findElement(By.id("vfb-13-zip")).sendKeys("73000");  
		//Select option1 = new Select(driver.findElement(By.xpath("//*[@id=\"select2-vfb-13-country-container"]")));
		//option1.selectByVisibleText("Thailand");
		driver.findElement(By.id("vfb-14")).sendKeys("email@gmail.com");   
		driver.findElement(By.id("vfb-18")).sendKeys("03/18/02");  
		driver.findElement(By.id("vfb-19")).sendKeys("0979603214");  
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click(); 
		driver.findElement(By.id("vfb-23")).sendKeys("NPRU");  
		driver.findElement(By.id("vfb-3")).sendKeys("88"); 
		driver.findElement(By.id("vfb-4")).click(); 
		
		String result = driver.findElement(By.id("vfb-23")).getText();

		assertEquals("NPRU", result);
		


		Thread.sleep(8000);
		driver.quit();
		

	}

	private void assertEquals(String string, String result) {
		// TODO Auto-generated method stub
		
	}
	
	

}
