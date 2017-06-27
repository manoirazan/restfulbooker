package Rest;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.BeforeStory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AcceptanceTestSuite extends SerenityStories {

    @BeforeStory
    public void setup() {

        getDriver().get("http://192.168.99.100:3003");
        try
        {
            getDriver().manage().window().maximize();
        }catch (Exception e) {
            System.out.println("Could not maximise");

        }
    }
}