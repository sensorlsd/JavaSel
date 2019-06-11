package src.API;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

public class PokemonApi {

    @Test
    public void firstRequest(){
        Response resp = (Response) when().
                        get("https://pokeapi.co/api/v2/pokemon/1/").body();
        System.out.println(resp.getStatusCode());
        System.out.println(resp.getHeaders());
        System.out.println(resp.getContentType());
    }


}
