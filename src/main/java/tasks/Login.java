package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import model.DataStartSharp;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static userinterface.LoginPage.*;

public class Login implements Task {
    private List<DataStartSharp> dataToForm;
    public Login(List<DataStartSharp> data){
        this.dataToForm = data;
    }

    public static Login onThePageWith(List<DataStartSharp> data) {

        return Tasks.instrumented(Login.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataToForm.get(0).getUsername()).into(INPUT_USERNAME),
                Enter.theValue(dataToForm.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );


    }
}
