package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAFlightPage extends BasePage {

    public BookAFlightPage(WebDriver navegador) {
        super(navegador);
    }

    public BookAFlightPage digitarFirstName(String name) {//click control + F - find element in console
        navegador.findElement(By.name("passFirst0")).sendKeys(name);

        return this;
    }

    public BookAFlightPage digitarLastname(String name) {
        navegador.findElement(By.name("passLast0")).sendKeys(name);

        return this;
    }
    public BookAFlightPage digitarCreditCardNumber(String number) {
        navegador.findElement(By.name("creditnumber")).sendKeys(number);

        return this;
    }

    public FlightConfirmationPage clicarSecurePurchase() {
        navegador.findElement(By.name("buyFlights")).click();

        return new FlightConfirmationPage(navegador);
    }

    public FlightConfirmationPage BookAFlight(String firstName, String lastName, String number) {
        return digitarFirstName(firstName)
                .digitarLastname(lastName)
                .digitarCreditCardNumber(number)
                .clicarSecurePurchase();
    }
}
