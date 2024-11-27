package Tests.PageObject.hh;

import Tests.PageObject.core.BaseSelenideTest;
import org.junit.Test;

public class HhTests extends BaseSelenideTest {
    /**
     * Ссылка на резюме для получения данных
     */
    private final static String URL = "https://hh.ru/applicant/resumes/view?resume=1edf0c93ff095811d20039ed1f6a3638497073";

    @Test
    public void checkAttributesHash(){
        HHPageObject hhPageObject = new HHPageObject(URL);

    }

}
