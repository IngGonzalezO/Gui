package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.AnonymousPerformableRunnable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {

    private ChoucairAcademyPage choucairAcademyPage;

    public static AnonymousPerformableRunnable ThePage() {

        return Task.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }
}
