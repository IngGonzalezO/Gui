package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("The Button That shows us the form to login")
            .located(new By.ByXPath("//div[@class = 'd-none d-log-block'] //strong [contains (text(), 'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("Where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.id("//button [contains (@class, 'btn btn-primary')]"));

}
