import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.management.BadAttributeValueExpException;
import java.time.Duration;

public class Lab03 {
    EdgeDriver d=new EdgeDriver();
    @Test
    public void testcase()
    {
        d.get("https://app.vwo.com/#/login");
        d.findElement(By.id("login-username")).sendKeys("contact+atb7x@thetestingacademy.com");
        d.findElement(By.id("login-password")).sendKeys("Wingify@1234");
        d.findElement(By.id("js-login-btn")).click();
        WaitHelpers.checkvisibility(d,(By.cssSelector("span[data-qa='lufexuloga']")));
       String text= d.findElement(By.cssSelector("span[data-qa='lufexuloga']")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Aman Ji");


    }
}
