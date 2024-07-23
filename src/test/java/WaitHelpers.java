import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelpers {
    EdgeDriver d=new EdgeDriver();
    public static void checkvisibility(WebDriver d, By locator)
    {
        WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10)) ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
