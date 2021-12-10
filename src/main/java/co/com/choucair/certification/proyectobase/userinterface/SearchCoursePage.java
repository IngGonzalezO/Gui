package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    private String course;

    public static final Target BUTTON_UC = Target.the("Selecciona la universidad Choucair")
            .located(new By.ByXPath("//div[@id = 'universidad'] //strong "));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da clic para buscar el curso")
            .located(By.id("//button [@class, 'btn btn-primary']"));

    public static final Target SELECT_COURSE = Target.the("Da clic para buscar el curso")
            .located(By.id("//h4 [contains (text(), 'Recursos Automatización Bancolombia')]"));


    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso")
            .located(By.id("//h1 [contains (text(), 'Recursos Automatización Bancolombia')]"));

    public SearchCoursePage(String course) {
        this.course = course;
    }
}
