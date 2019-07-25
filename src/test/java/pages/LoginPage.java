package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver navegador) {
            super(navegador);
        }

        public LoginPage digitarLogin(String login) {//click control + F - find element in console
            navegador.findElement(By.name("userName")).sendKeys(login);

            return this;
        }

        public LoginPage digitarSenha(String password) {
            navegador.findElement(By.name("password")).sendKeys(password);

            return this;
        }

        public FlightFinderPage clicarSignIn() {
            navegador.findElement(By.name("login")).click();

            return new FlightFinderPage(navegador);
        }

        public FlightFinderPage fazerLogin(String login, String senha) {
            return digitarLogin(login)
                    .digitarSenha(senha)
                    .clicarSignIn();
        }
}
