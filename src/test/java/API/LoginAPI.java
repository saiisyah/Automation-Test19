package API;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class LoginAPI {

    @Test
    public void loginValid() {
        given()
                .header("content-type", "application/json")
                .body("""
                        {
                         "email": "sasisyu@yopmail.com",
                         "password": "rahasia"
                         }
                       """)
                .when()
                .post("https://api.rizqifauzan.com/api/auth/login")
                .then()
                .statusCode(anyOf(is(200), is(401)));


    }

    @Test
    public void loginInvalid() {
        given()
                .header("content-type", "application/json")
                .body("""
                        {
                        "email": "sasisyu@yopmail.com",
                        "password": ""
                        }
                      """)
                .when()
                .post("https://api.rizqifauzan.com/api/auth/login")
                .then()
                .statusCode(400);

    }
}

