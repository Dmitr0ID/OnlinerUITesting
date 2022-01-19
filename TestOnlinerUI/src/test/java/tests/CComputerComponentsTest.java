package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ComputerComponentsPage;

public class CComputerComponentsTest {
    private ComputerComponentsPage computerComponentsPage = new ComputerComponentsPage();
    @BeforeEach
    public void openCompoents(){
        computerComponentsPage.openPage().goToComponents();
    }
    @Test
    public void checkTitlesPresence(){
        Assertions.assertTrue(computerComponentsPage.checkTitles());
    }
    @Test
    public void checkDescriptionsPresence(){
        Assertions.assertTrue(computerComponentsPage.checkDescriptions());
    }
}
