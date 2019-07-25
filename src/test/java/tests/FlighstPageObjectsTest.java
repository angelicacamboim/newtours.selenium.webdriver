package tests;

import org.easetech.easytest.annotation.Param;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import suporte.Web;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class FlighstPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();

    }

    @Test
    public void bookAFlight(){
        String texto = new LoginPage(navegador)
                 .fazerLogin("admin","mercury")
                .FlightFinder()
                .SelectFlight()
                .BookAFlight("Teste", "Silva", "843954398")
                .capturarTextoSucess();
        assertEquals("Flight Confirmation: Mercury Tours", texto);

    }

    @After
    public void tearDown() {
        navegador.quit();
    }
}

