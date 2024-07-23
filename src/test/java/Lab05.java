import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Lab05 {
    EdgeDriver d=new EdgeDriver();

    @Test
    public void testcase(){
        d.get("https://the-internet.herokuapp.com/dropdown");
       WebElement dropdown= d.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);
        select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

    }
}
