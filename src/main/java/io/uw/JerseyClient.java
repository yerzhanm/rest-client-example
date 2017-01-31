package io.uw;

import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class JerseyClient {

    public void run() throws ParseException {
        Client client = ClientBuilder.newClient(new ClientConfig());

        String entity = client.target("http://localhost:8080/")
                .path("test")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(entity);

        JSONArray array = (JSONArray)obj;

        System.out.println("Contains body property");
        array.stream().filter(x -> ((JSONObject)x).containsKey("body")).forEach(x -> System.out.println(((JSONObject)x).toJSONString()));
        System.out.println();

        System.out.println("Contains age property");
        array.stream().filter(x -> ((JSONObject)x).containsKey("age")).forEach(x -> System.out.println(((JSONObject)x).toJSONString()));
        System.out.println();

        System.out.println("Contains name property");
        array.stream().filter(x -> ((JSONObject)x).containsKey("name")).forEach(x -> System.out.println(((JSONObject)x).toJSONString()));
        System.out.println();
    }

}
