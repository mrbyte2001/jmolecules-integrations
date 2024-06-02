package org.jmolecules.integrations.quarkus.it;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class JmoleculesQuarkusResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/jmolecules-quarkus")
                .then()
                .statusCode(200)
                .body(is("Hello jmolecules-quarkus"));
    }
}
