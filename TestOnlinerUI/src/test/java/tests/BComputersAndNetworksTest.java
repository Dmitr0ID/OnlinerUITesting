package tests;

import org.junit.jupiter.api.*;
import pages.ComputersAndNetworksPage;
import util.WebDriverRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BComputersAndNetworksTest {

    private ComputersAndNetworksPage computersAndNetworksPage = new ComputersAndNetworksPage();

    private static List<String> expectedItems;
    private List<String> actualItems;

    @BeforeAll
    public static void createList(){
        expectedItems = new ArrayList<>();
        expectedItems.add("Ноутбуки, компьютеры, мониторы");
        expectedItems.add("Комплектующие");
        expectedItems.add("Хранение данных");
        expectedItems.add("Сетевое оборудование");
    }
    @BeforeEach
    public void openOnliner(){
        computersAndNetworksPage = computersAndNetworksPage.openPage().clickSection();
        actualItems = computersAndNetworksPage.getNamesOfItems();
    }
    @Test
    public void testSectionItemsPresence(){
        Assertions.assertAll(
                () -> assertTrue(actualItems.contains(expectedItems.get(0))),
                () -> assertTrue(actualItems.contains(expectedItems.get(1))),
                () -> assertTrue(actualItems.contains(expectedItems.get(2))),
                () -> assertTrue(actualItems.contains(expectedItems.get(3)))
        );
    }
    @AfterEach
    public void cleanUp(){
        WebDriverRunner.close();
    }
}

