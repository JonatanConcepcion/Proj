package tasks;

import model.DataStartSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static userinterface.CreateBusinessUnitPage.*;


public class CreateBusinessUnit implements Task {
    private List<DataStartSharp> dataToForm;
    public CreateBusinessUnit(List<DataStartSharp> data){
        this.dataToForm = data;
    }

    public static CreateBusinessUnit withTheFollowingInformation(List<DataStartSharp> data) {
        return Tasks.instrumented(CreateBusinessUnit.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataToForm.get(0).getName_unit()).into(INPUT_NAME_NEW_BUSNISSES_UNIT)
                ,Click.on(DROPDOWN_PARENS_UNIT)
                ,Enter.theValue(dataToForm.get(0).getParent_unit()).into(INPUT_PARENT_NEW_BUSINESS_UNIT)
                ,Click.on(UNIQUE_PAREN_NEW_BUSINESS_UNIT)
                ,Click.on(SAVE_NEW_BUSINESS_UNIT)
        );
    }
}
