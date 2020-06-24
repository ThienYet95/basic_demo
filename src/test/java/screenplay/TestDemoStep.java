package screenplay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemoStep {
    public static void main(String[] args) {
        /**
         * Khởi tạo trình duyệt và truy cập đến trang web cần test
         */
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        // đăng nhập bằng tài khoản sai

        /**
         * Xác định vị trí của các phần tử trong trang login
         */
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.id("loginbutton"));

        /**
         * Thực thi kịch bản test đăng nhập không thành công với thông tin email và password sai
         */
        email.sendKeys("diepanhxinhgai");
        password.sendKeys("123456");
        login.click();


        driver.close();
    }
}
