import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	WebDriver driver;
	String url1 = "https://www.wix.com/";
	String url2 = "https://www.amazon.in/";
	String url3 = "https://www.facebook.com/";
	String url4 = "https://www.flipkart.com/";
	String url5 = "https://google.com/";
	
	String [] str = {url1,url2,url3,url4,url5};

	public static void main(String[] args) throws InterruptedException{

		SeleniumTest test = new SeleniumTest();
	
		//test.findGoodsAmazon("printer");
		test.invokeBrowser();
	}

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.getWindowHandles();
		driver.manage().deleteAllCookies();
		for (int i = 0; i < str.length; i++) {
			
		}
		driver.get(url4);
		
		WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/a/span"));
		btn.click();
		WebElement btn2 = driver.findElement(By.xpath("WebElement btn = driver.findElement(By.xpath(\"/html/body/div[2]/div/div/div/div/div[2]/div/form/a/span\"));\n" + ""));
		btn2.click();
	}
	
	public void findGoodsAmazon(String product) {
		
		WebElement searchString = driver.findElement(By.id("twotabsearchtextbox"));
		searchString.sendKeys(product);
		searchString.submit();
	}
	
	public void findGoodsFlipkart(String product) {
		
		WebElement searchString = driver.findElement(By.id("twotabsearchtextbox"));
		searchString.sendKeys(product);
		searchString.submit();
	}
	
}
