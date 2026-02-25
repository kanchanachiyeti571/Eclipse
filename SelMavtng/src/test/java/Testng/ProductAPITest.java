package Testng;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ProductAPITest {

    //  GET SINGLE PRODUCT
    @Test
    public void getSingleProduct() {

        given()
        .when()
            .get("https://dummyjson.com/products/2")
        .then()
            .statusCode(200)
            .body("id", equalTo(2));
    
    }

    //  GET ALL PRODUCTS
    @Test
    public void getAllProducts() {

        given()
        .when()
            .get("https://dummyjson.com/products")
        .then()
            .statusCode(200)
            .body("products.size()", greaterThan(0));
    }

    // POST - CREATE PRODUCT
    @Test
    public void createProduct() {

        String requestBody = "{ \"title\": \"Test Product\" }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post("https://dummyjson.com/products/add")
        .then()
            .statusCode(201)
            .body("title", equalTo("Test Product"));
    }

    //  PUT - UPDATE PRODUCT
    @Test
    public void updateProduct() {

        String requestBody = "{ \"title\": \"Updated Product\" }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .put("https://dummyjson.com/products/2")
        .then()
            .statusCode(200)
            .body("title", equalTo("Updated Product"));
    }

    // DELETE PRODUCT
    @Test
    public void deleteProduct() {

        given()
        .when()
            .delete("https://dummyjson.com/products/2")
        .then()
            .statusCode(200)
            .body("isDeleted", equalTo(true));
    }
}