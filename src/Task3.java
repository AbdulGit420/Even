import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Even\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize(); 
		driver.switchTo().frame("");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
	}
}
