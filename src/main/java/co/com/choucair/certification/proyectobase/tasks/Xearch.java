package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.xpath.operations.String;

public class Xearch implements Task {
    private String course;

    public static Performable the(String course) {

        return Task.instrumented(Xearch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_UC),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_COURSE)
        );

    }
}
