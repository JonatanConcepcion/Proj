package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoSectionPage extends PageObject {


    public static final Target DROPDOWN_BUSINESS_UNIT = Target.the("Tree where we can see the sections relative to Business Unit")
            .located(By.cssSelector("ul#nav_menu1_3 li span"));
    public static final Target BUTTON_TO_BUSINESS_UNIT_SECTION = Target.the("Button that redirect us to Business Unit section")
            .located(By.cssSelector("ul#nav_menu1_3_1 li a"));

    public static final Target BUTTON_NEW_BUSSINES_UNIT = Target.the("Button to open the PopUp for create a new item")
            .located(By.cssSelector("div.tool-button.add-button.icon-tool-button span"));

    public static final Target DROPDOWN_MEETINGS = Target.the("Dropdown where we can see the sections relative to Meetings")
            .located(By.cssSelector("ul#nav_menu1_3 > li + li span"));
    public static final Target BUTTON_TO_MEETINGS_SECTION = Target.the("Button that redirect us to Meetings section")
            .located(By.cssSelector("ul#nav_menu1_3_2 li a"));



}
