package ten10.pages;

import com.frameworkium.core.ui.pages.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage extends BasePage<SearchResultsPage> {

    public SearchResultsPage(String searchValue){
        wait.until(ExpectedConditions.titleContains(searchValue));
    }

}
