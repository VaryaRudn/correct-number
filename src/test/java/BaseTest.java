import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// ...

public class BaseTest {
    @BeforeEach
    public void setUp() {
        // Открываем нужный сайт
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://severstal.com/rus/search/?search=%D0%98%D1%81%D1%82%D0%BE%D1%80%D0%B8%D1%8F");
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        Selenide.closeWebDriver();
    }
}