import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/users/sofianikonova/downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        boolean Display =  driver.findElement(By.id("btn-consultation-hero")).isDisplayed();
        System.out.println("Element displayed is :"+Display);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }
        driver.quit();

    }
}
