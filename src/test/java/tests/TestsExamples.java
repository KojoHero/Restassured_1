package tests;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import testdata.TestBase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static testdata.Constants.*;

public class TestsExamples extends TestBase {

//    @Test
//    public void testPost() {
//        given().post(POST_ENDPOINT).then().assertThat().statusCode(201).log().all();
//    }

    @Test
    public void testGet() {
//        given().header(headerName, headerValue).get(GET_ENDPOINT).then().assertThat().statusCode(404).log().all();
        given().get(GET_ENDPOINT).then().assertThat().statusCode(404).log().all();
    }


}
