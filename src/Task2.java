import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Even\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		driver.manage().window().maximize(); 
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		a1.accept();
		
		
		System.out.println(text);
		driver.quit();
	}

}
