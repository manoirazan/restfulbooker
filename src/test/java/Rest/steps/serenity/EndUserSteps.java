package Rest.steps.serenity;

import Rest.pages.BookerPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    BookerPage bookerPage;


    @Step
    public void createSingleEntry(){
        createEntry("River Inn", "10 Lion Drive, PO3 62B", "Woo K", "01211456440" , "woo.k@emailbooker.com");
        bookerPage.createEntry().click();
    }

    @Step
    public void verifySingleEntry(){
        assertThat(bookerPage.containerClass().getText(), containsString("River In"));
        assertThat(bookerPage.containerClass().getText(), containsString("10 Lion Drive"));
        assertThat(bookerPage.containerClass().getText(), containsString("woo.k@emailbooker.com"));
    }

    @Step
    public void verifyMultipleEntry(){
        assertThat(bookerPage.containerClass().getText(), containsString("Greyhound Inn"));
        assertThat(bookerPage.containerClass().getText(), containsString("RedFox Inn"));
        assertThat(bookerPage.containerClass().getText(), containsString("Portsmouth Inn"));
    }


    @Step
    public void createMultipleEntry(){
        createEntry("Greyhound Inn", "54 Fox Street, PO1 22B", "James K", "0123456790" , "james.k@emailbooker.com");
        createEntry("RedFox Inn", "5 Red Street, PO1 12B", "Hale B", "01234563330" , "hale.b@emailbooker.com");
        createEntry("Portsmouth Inn", "1 Porto Street, PO2 62B", "Mat K", "01211456790" , "mat.k@emailbooker.com");
        bookerPage.createEntry().click();
    }

    public void createEntry(String hotelName, String address, String owner, String phone, String email){
        bookerPage.hotelName().type(hotelName);
        bookerPage.address().type(address);
        bookerPage.owner().type(owner);
        bookerPage.phone().type(phone);
        bookerPage.email().type(email);
    }

    @Step
    public void logoutIsPresent(){
        if(bookerPage.login().isCurrentlyVisible()){
            bookerPage.login().click();
            bookerPage.username().type("admin");
            bookerPage.password().type("password");
            bookerPage.doLogin().click();
        }
        bookerPage.logout().isCurrentlyVisible();
    }

    @Step
    public void removeExistingHotel(){
        getDriver().findElement(By.xpath("/span[contains(text(), 'Greyhound Inn')]/../following-sibling::section/span[@class*='hotelDelete']")).click();
    }

    @Step
    public void verifyHotelIsRemoved(){
        Assert.assertEquals(bookerPage.containerClass().getText(), false, containsString("'Greyhound Inn"));
    }

}