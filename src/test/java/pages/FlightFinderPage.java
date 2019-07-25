package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinderPage extends BasePage {

    public FlightFinderPage(WebDriver navegador) {
        super(navegador);
    }
    public SelectFlightPage FlightFinder() {
        navegador.findElement(By.name("findFlights")).click();

        return new SelectFlightPage(navegador);
    }
}
