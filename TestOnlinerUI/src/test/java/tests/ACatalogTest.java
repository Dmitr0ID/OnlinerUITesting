package tests;


import org.junit.jupiter.api.*;
import pages.CatalogPage;
import util.WebDriverRunner;

import java.util.ArrayList;
import java.util.List;

public class ACatalogTest {
    private CatalogPage catalogPage = new CatalogPage();
    private static List<String> expectedSections;
    @BeforeAll
    public static void createList(){
        expectedSections = new ArrayList<>();
        expectedSections.add("Электроника");
        expectedSections.add("Компьютеры и сети");
        expectedSections.add("Бытовая техника");
        expectedSections.add("Стройка и ремонт");
        expectedSections.add("Дом и сад");
        expectedSections.add("Авто и мото");
        expectedSections.add("Красота и спорт");
        expectedSections.add("Детям и мамам");
        expectedSections.add("Работа и офис");
        expectedSections.add("Еда");
    }
    @BeforeEach
    public void openOnliner(){
        catalogPage = catalogPage.openPage();
    }
    @Test
    public void testSectionItemsPresence(){
        Assertions.assertEquals(expectedSections, catalogPage.getNamesOfSections());
    }
    @AfterEach
    public void cleanUp(){
        WebDriverRunner.close();
    }
}
