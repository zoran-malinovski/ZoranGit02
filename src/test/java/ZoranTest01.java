import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class ZoranTest01 {

    @Test
    public void ZoranFirstTest(){
        System.out.println("Helloooo!!!");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://banzae.dev/");
        driver.manage().window().maximize();


    }



}
