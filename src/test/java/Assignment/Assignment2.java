package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment2 {
    EdgeDriver driver=new EdgeDriver();
    @Test
    public void testcase_login() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("John Doe");
        driver.findElement(By.name("password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
        String element= driver.findElement(By.xpath("//div/h2")).getText();
        System.out.println(element);
        Assert.assertEquals(element,"Make Appointment");

    }
}
