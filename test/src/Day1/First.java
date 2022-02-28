package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class First {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/ssilwal/Documents/selenium/chromedriver_linux64/chromedriver");
	   WebDriver d = new ChromeDriver();  
    
    d.navigate().to("http://localhost/form.php");  
   
    d.manage().window().maximize(); 
  
  
    WebElement pdf_field=d.findElement(By.name("pdf"));
    pdf_field.sendKeys("/home/ssilwal/Downloads/Complete IELTS Material List.pdf"); 
    Thread.sleep(3000);
    WebElement upload_field=d.findElement(By.name("submit"));
    upload_field.click();
    System.out.println("File is Uploaded Successfully");
  
	}

}
