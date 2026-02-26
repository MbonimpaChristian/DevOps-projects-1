//import org.testng.annotations.Test;
//import com.microsoft.playwright.*;
//
//import java.util.List;
//
//public class SortingTest {
//    @Test
//    public void verifySorting() {
//
//        Playwright playwright = Playwright.create();
//        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//        Page page = browser.newPage();
//
//        page.navigate("https://practicesoftwaretesting.com/practice/sorting");
//        page.selectOption("select[data-test='sort']", "price,asc");
//
//        List<String> prices = page.locator(".price").allTextContents();
//        for (int i = 0; i < prices.size() - 1; i++) {
//            double price1 = Double.parseDouble(prices.get(i).replace("$", ""));
//            double price2 = Double.parseDouble(prices.get(i + 1).replace("$", ""));
//            assert price1 <= price2 : "Prices are not sorted in ascending order";
//        }
//        browser.close();
//    }
//}


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {

    @Test
    public void verifySorting() {

        System.out.println("==== TEST STARTED ====");

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions()
                            .setHeadless(false)
                            .setSlowMo(700));   // Slow for visibility

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            System.out.println("Opening website...");
            page.navigate("https://practicesoftwaretesting.com/");
            page.waitForLoadState(LoadState.NETWORKIDLE);

            Locator products = page.locator(".card-body h5");
            products.first().waitFor();

            System.out.println("Page loaded successfully.");

            // ========================
            // SORT ASCENDING
            // ========================
            System.out.println("Selecting sorting: Name A-Z");

            page.selectOption("[data-test='sort']", "name,asc");
            page.waitForLoadState(LoadState.NETWORKIDLE);
            page.waitForTimeout(1500); // allow visible change

            List<String> actualAsc = products.allTextContents();
            System.out.println("Products after A-Z sort:");
            actualAsc.forEach(System.out::println);

            List<String> expectedAsc = new ArrayList<>(actualAsc);
            Collections.sort(expectedAsc);

            System.out.println("Validating ascending order...");
            Assert.assertEquals(actualAsc, expectedAsc, "Ascending sort failed");
            System.out.println("Ascending sorting validated successfully ✅");

            // ========================
            // SORT DESCENDING
            // ========================
            System.out.println("Selecting sorting: Name Z-A");

            page.selectOption("[data-test='sort']", "name,desc");
            page.waitForLoadState(LoadState.NETWORKIDLE);
            page.waitForTimeout(1500);

            List<String> actualDesc = products.allTextContents();
            System.out.println("Products after Z-A sort:");
            actualDesc.forEach(System.out::println);

            List<String> expectedDesc = new ArrayList<>(actualDesc);
            expectedDesc.sort(Collections.reverseOrder());

            System.out.println("Validating descending order...");
            Assert.assertEquals(actualDesc, expectedDesc, "Descending sort failed");
            System.out.println("Descending sorting validated successfully ✅");

            System.out.println("==== TEST COMPLETED SUCCESSFULLY ====");

            page.waitForTimeout(4000); // keep browser open to observe
            browser.close();
        }
    }
}