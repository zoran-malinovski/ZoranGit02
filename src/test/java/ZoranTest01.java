import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class ZoranTest01 {

    @Test
    public void ZoranFirstTest(){
        System.out.println("Helloooo!!!");
        System.out.println("Olaa ke pasa");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://banzae.dev/");
        driver.manage().window().maximize();

    }

    @Test
    public void ZoranSecondTest(){
        System.out.println("Dobar den");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://dev.aleksandarak.mk/");
        driver.manage().window().maximize();
    }

    @Test
    public void ZoranThirdTest(){
        System.out.println("Kako si Malinovski. Dobro utro?");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.motogp.com/");
        driver.manage().window().maximize();
    }

}
