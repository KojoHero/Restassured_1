package testdata;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static testdata.Constants.*;

public class TestBase {
    public static RequestSpecification REQUEST;
    public static RequestSpecification spec;
    private static final String baseUri = "https://apichallenges.herokuapp.com";

    @BeforeAll
    public static void beforeAll() {
        RestAssured.baseURI = BASE_URL;
//        REQUEST = RestAssured.given().contentType(ContentType.JSON);
        REQUEST = new RequestSpecBuilder().addHeader(headerName, headerValue).build();

//        spec = new RequestSpecBuilder().setBaseUri(baseUri).setContentType(ContentType.JSON)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
//                .build();

    }

//    protected final RequestSpecification given() {
//        return RestAssured.given(spec);
//    }
}
