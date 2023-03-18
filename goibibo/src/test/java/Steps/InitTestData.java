package Steps;

import Pages.dataMapper;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class InitTestData {
    dataMapper datamapper=new dataMapper();
    @Given("initiate testDate")
    public void TestData() throws IOException {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        datamapper.getData("TC_001");

    }
}
