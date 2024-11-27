package Tests.PageObject.hh;

import com.codeborne.selenide.Selenide;

public class HHPageObject {
    public HHPageObject(String URL) {
        Selenide.open(URL);
    }
}
