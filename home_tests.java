package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class home_tests
{
    WebDriver driver = new ChromeDriver();

    @Test (priority = 1)
    public void launch_browser()
    {

        driver.get("http://www.facebook.com");
        System.out.println(driver.getTitle());
    }

    @Test (priority = 2)
    public void login_facebook()
    {
        driver.findElement(By.id("email")).sendKeys("tmupakati1@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("#Tarpsburg123");
        driver.findElement(By.id("loginbutton")).click();
    }

    @Test (priority = 3)
    public void click_drop_down() {
      // driver.findElement(By.id("userNavigationLabel")).click();
        driver.findElement(By.xpath("//*[@id=\"logoutMenu\"]")).click();
    }

    @Test (priority =4 )
            public void logout_facebook()
    {
        driver.findElement(By.xpath("//*[@id=\"js_zz\"]/div/div/ul/li[13]/a/span/span")).click();
    }

    @Test (priority =5 )
    public void fetch_url ()
    {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println("Total links: " + i);
        }

    }
}


