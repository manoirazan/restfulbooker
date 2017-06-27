package Rest.pages;



import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://192.168.99.100:3003")
public class BookerPage extends PageObject {


    public WebElementFacade createEntry(){
        return  element(By.cssSelector("#createHotel"));
    }

    public WebElementFacade logout(){
        return  element(By.cssSelector("#logout"));
    }
    public WebElementFacade login(){
        return  element(By.linkText("Login"));
    }

    public WebElementFacade doLogin(){
        return  element(By.cssSelector("#doLogin"));
    }
    public WebElementFacade username(){
        return  element(By.cssSelector("username"));
    }

    public WebElementFacade password(){
        return  element(By.cssSelector("password"));
    }

    public WebElementFacade hotelName(){
        return  element(By.cssSelector("#hotelName"));
    }
    public WebElementFacade address(){
        return  element(By.cssSelector("#address"));
    }
    public WebElementFacade owner(){
        return  element(By.cssSelector("#owner"));
    }
    public WebElementFacade phone(){
        return  element(By.cssSelector("#phone"));
    }
    public WebElementFacade email(){
        return  element(By.cssSelector("#email"));
    }

    public WebElementFacade containerClass(){
        return  element(By.cssSelector(".container"));
    }







}