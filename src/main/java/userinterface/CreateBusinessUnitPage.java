package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateBusinessUnitPage extends PageObject {


    public static final Target INPUT_NAME_NEW_BUSNISSES_UNIT = Target.the("Field where we can write the name of the new Business Unit")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
    public static final Target DROPDOWN_PARENS_UNIT = Target.the("Tree that can show us the parents unit for the new Business Unit")
            .located(By.className("select2-arrow"));
    public static final Target INPUT_PARENT_NEW_BUSINESS_UNIT = Target.the("Field where we can write the parent of the new Business Unit")
            .located(By.cssSelector("input.select2-input"));
    public static final Target UNIQUE_PAREN_NEW_BUSINESS_UNIT = Target.the("Unique element that reference us the name of the parent for the new Business Unit")
            .located(By.className("select2-result-label"));
    public static final Target SAVE_NEW_BUSINESS_UNIT = Target.the("Button that save the new Bussines Unit")
            .located(By.className("fa-check-circle"));

}
