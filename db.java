


package crawller;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class db {





 public static void main(String[] args) {
  WebDriver driver = new FirefoxDriver();
  driver.get("http://www.w3schools.com/");
  WebElement in = driver.findElement(By.xpath("//div[last()]"));
  System.out.println(in);
  driver.close();
 }
}


