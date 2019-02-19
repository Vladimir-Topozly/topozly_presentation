import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {
    ChromeDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
    }

    @Test
    public void OpenPage() {
//        wd.get("https://search.maven.org");
        wd.navigate().to("https://search.maven.org"); // the same as above
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        wd.quit();
    }
    
}
