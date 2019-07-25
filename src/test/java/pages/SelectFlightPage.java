package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage extends BasePage {

    public SelectFlightPage(WebDriver navegador) {
        super(navegador);
    }

    public BookAFlightPage SelectFlight() {
        navegador.findElement(By.name("reserveFlights")).click();

        return new BookAFlightPage(navegador);
    }
}
