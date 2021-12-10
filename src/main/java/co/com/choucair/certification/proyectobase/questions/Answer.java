package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.tasks.Override;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import jxl.write.Boolean;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.xpath.operations.String;

public class Answer implements Question <Boolean> {

    private String question;


    public Answer (String question){

        this.question = question;

    }

    public static Answer toThe(String question) {

        return new Answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result = false;

        java.lang.String namecourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();

        if (question.equals(namecourse)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
