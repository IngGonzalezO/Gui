package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChourcairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Xearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovy.transform.Undefined;
import io.vavr.collection.List;
import jnr.ffi.StructLayout;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.xpath.operations.String;
import org.junit.Before;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given ("^than brandon wants to learn automation at the academy Choucair")
    public void thanbrandonwantstolearnautomationattheacademyChoucair (List<AcademyChourcairData> academyChourcairDataList) throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.ThePage(), Login.onThePage
                (academyChourcairDataList.get(0).getStrPassword()));

    }

    @When ("^he search for the course (.*) on the choucair academy platform$")
    public void hesearchforthecourseRecursosAutomatizaciónBancolombiaonthechoucairacademyplatform(List<AcademyChourcairData> academyChourcairDataList){

        OnStage.theActorInTheSpotlight().attemptsTo(Xearch.the(academyChourcairDataList.get(0).getStrCourse()));
    }

    @Then ("^he finds the course called resources (.*)$")
    public void hefindsthecoursecalledresourcesRecursosAutomatizaciónBancolombia(List<AcademyChourcairData> academyChourcairDataList) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChourcairDataList.get(0).getStrCourse())));
    }
}
