package tests;

import ten10.pages.SamplePageObject;
import org.testng.annotations.Test;
import ten10.configuration.BaseSeleniumTest;
import static com.google.common.truth.Truth.assertThat;
import com.frameworkium.core.ui.UITestLifecycle;

public class ExampleTests extends BaseSeleniumTest {

@Test(description = "Passing Test")
public void PassingTest(){

    SamplePageObject.open().then()
            .searchForValue("Ten10");
    assertThat(UITestLifecycle.get().getWebDriver().getTitle()).contains("Ten10");
}

    @Test(description = "Failing Test")
    public void FailingTest(){

        SamplePageObject.open().then()
                .searchForValue("Ten10");
        assertThat(UITestLifecycle.get().getWebDriver().getTitle()).contains("Ten12");
    }

}
