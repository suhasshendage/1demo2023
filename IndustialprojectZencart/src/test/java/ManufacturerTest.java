import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ManufacturerTest {
	WebDriver driver=null;
	@BeforeClass
	
	public void setup(){
		System.setProperty("wbdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://ingecnotechnologies.com/other/zenith/index.php?main_page=login&action=process");
		
		
	}
	@Test
	public void checkRadiobutton() throws Exception{
		WebElement dropdown1=driver.findElement(By.id(""));
		Select firstprod=new Select(dropdown1);
		firstprod.selectByIndex(1);
		Thread.sleep(2000);
	}

}
