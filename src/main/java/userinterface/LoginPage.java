package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input where  do we write the username")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Input where  do we write the password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BUTTON_LOGIN = Target.the("Button to  sing in the page")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}
