package apiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApiStatusCode {

    @Test
    public void testGetRequest() {
        Response response = RestAssured.get("https://reqres.in/api/users/2");

        // Validate response status code is 200
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");
        
        System.out.println("Response Status Code: " + response.getStatusCode());
    }
}
