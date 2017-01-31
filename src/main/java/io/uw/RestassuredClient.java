package io.uw;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static com.jayway.restassured.RestAssured.get;

public class RestassuredClient {
    public  void run() throws IOException {
        InputStream stream = get("/test").asInputStream(); // Don't forget to close this one when you're done
        byte[] byteArray = get("/test").asByteArray();
        String json = get("/test").asString();
        stream.close();

        System.out.println("---------------------------------");
        System.out.println();

        Configuration conf = Configuration.defaultConfiguration().addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);

        System.out.println("Contains body property");
        final List<Map<String, String>> object = JsonPath.using(conf).parse(json).read("$[*][?(@.body)]");
        for(Map<String, String> s : object){
            System.out.println(s.toString());
        }
        System.out.println();


        System.out.println("Contains age property");
        final List<Map<String, String>> object2 = JsonPath.using(conf).parse(json).read("$[*][?(@.age)]");
        for(Map<String, String> s : object2){
            System.out.println(s.toString());
        }
        System.out.println();


        System.out.println("Contains name property");
        final List<Map<String, String>> object3 = JsonPath.using(conf).parse(json).read("$[*][?(@.name)]");
        for(Map<String, String> s : object3){
            System.out.println(s.toString());
        }
        System.out.println();

        //More https://github.com/jayway/JsonPath
        //Here you can find more operaters and usages for JsonPath

    }
}
