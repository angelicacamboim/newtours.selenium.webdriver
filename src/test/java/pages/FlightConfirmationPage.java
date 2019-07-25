package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suporte.Generator;
import suporte.Screenshot;

public class FlightConfirmationPage extends BasePage {

    public FlightConfirmationPage(WebDriver navegador) {
        super(navegador);
    }

    public String capturarTextoSucess() {
        String screenshotArquivo = "Prints/" + Generator.dataHoraParaArquivo() + "FlightConfirmationPage" + ".png";
        Screenshot.tirar(navegador, screenshotArquivo);//ok
        return navegador.getTitle();
    }
}
