package tasks;
import model.DataStartSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static userinterface.CreateMeetingPage.*;

public class CreateMeeting implements Task {
    private List<DataStartSharp> dataToForm;

    public CreateMeeting(List<DataStartSharp> data){
        this.dataToForm = data;
    }

    public static CreateMeeting withTheFollowingInformation(List<DataStartSharp> data) {
        return Tasks.instrumented(CreateMeeting.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataToForm.get(0).getName_meeting()).into(INPUT_NAME_NEW_MEETING)
                ,Enter.theValue(dataToForm.get(0).getNumber_meeting()).into(INPUT_NUMBER_NEW_MEETING)
                ,Click.on(SPAN_MEETING_TYPE)
                ,Enter.theValue(dataToForm.get(0).getType_meeting()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Click.on(SPAN_LOCATION)
                ,Enter.theValue(dataToForm.get(0).getLocation()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Click.on(SPAN_UNIT)
                ,Enter.theValue(dataToForm.get(0).getUnit()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Click.on(SPAN_ORGANIZE_BY)
                ,Enter.theValue(dataToForm.get(0).getOrganized_by()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Click.on(SPAN_REPORTER)
                ,Enter.theValue(dataToForm.get(0).getReporter()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Click.on(SPAN_ATTENDEE_LIST)
                ,Enter.theValue(dataToForm.get(0).getAttendee_list()).into(INPUT_SEARCHING)
                ,Click.on(UNIQUE_SELECT_ON_TREE)
                ,Enter.theValue(dataToForm.get(0).getStart_date()).into(INPUT_START_DATE)
                ,Enter.theValue(dataToForm.get(0).getEnd_date()).into(INPUT_END_DATE)
                ,SelectFromOptions.byVisibleText(dataToForm.get(0).getStart_hour()).from(SELECT_START_HOUR)
                ,SelectFromOptions.byVisibleText(dataToForm.get(0).getEnd_hour()).from(SELECT_END_HOUR)
                ,Click.on(SAVE_NEW_MEETING)

        );
        try {TimeUnit.SECONDS.sleep(2);}
        catch (InterruptedException e) {e.printStackTrace();}
    }
}
