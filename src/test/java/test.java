import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class test {

    @Test
    public void shouldCheckData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("some dat"))
        ;
    }


}
