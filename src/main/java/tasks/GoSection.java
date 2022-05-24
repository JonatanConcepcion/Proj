package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import static userinterface.GoSectionPage.*;

public class GoSection implements Task {
    private String ToSection;
    public GoSection(String section){
        this.ToSection = section;
    }

    public static GoSection aboutOf(String secton){
        return Tasks.instrumented(GoSection.class, secton);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                (Check.whether( ToSection.toString().trim().equals("Business Units") ).
                        andIfSo(
                                Click.on(DROPDOWN_BUSINESS_UNIT)
                                ,Click.on(BUTTON_TO_BUSINESS_UNIT_SECTION)
                                ,Click.on(BUTTON_NEW_BUSSINES_UNIT)
                        ).
                        otherwise(
                                Click.on(DROPDOWN_MEETINGS)
                                ,Click.on(BUTTON_TO_MEETINGS_SECTION)
                                ,Click.on(BUTTON_NEW_BUSSINES_UNIT)
                        )
                )
        );
    }
}
