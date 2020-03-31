package ten10.pages;

import com.frameworkium.core.ui.annotations.Visible;
import com.frameworkium.core.ui.pages.BasePage;
import com.frameworkium.core.ui.pages.PageFactory;
import ten10.configuration.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.qameta.allure.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class SamplePageObject extends BasePage<SamplePageObject> {

    @Visible
    @Name("Search Field")
    @FindBy(name = "q")
    private WebElement searchField;

    @Name("Search Button")
    @FindBy(xpath = "//*[@value=\"Google Search\"][@type='submit']")
    private WebElement searchButton;

    public static SamplePageObject open(){
        return PageFactory.newInstance(SamplePageObject.class, Config.getProperty("baseUrl"));
    }

    @Step("Search For Value")
    public SearchResultsPage searchForValue(String searchValue){

        searchField.sendKeys(searchValue);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        return new SearchResultsPage(searchValue).get();
    }
}
