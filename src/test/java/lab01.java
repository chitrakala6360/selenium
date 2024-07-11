import org.openqa.selenium.edge.EdgeDriver;

public class lab01 {

    public static void main(String[] args)
    {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://courses.thetestingacademy.com/");
        driver.quit();
    }
}
