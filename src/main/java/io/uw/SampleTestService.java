package io.uw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by lang on 1/31/17.
 */
@Path("/test")
public class SampleTestService {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg() {
        String output = "[\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":1,\n" +
                "      \"title\":\"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":2,\n" +
                "      \"title\":\"qui est esse\",\n" +
                "      \"body\":\"est rerum tempore vitaesequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendisnqui aperiam non debitis possimus qui neque nisi nulla\"\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":3,\n" +
                "      \"title\":\"ea molestias quasi exercitationem repellat qui ipsa sit aut\",\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":4,\n" +
                "      \"title\":\"eum et est occaecati\",\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":5,\n" +
                "      \"title\":\"nesciunt quas odio\",\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":6,\n" +
                "      \"title\":\"dolorem eum magni eos aperiam quia\",\n" +
                "      \"body\":\"ut aspernatur corporis harum nihil quis provident sequinmollitia nobis aliquid molestiaenperspiciatis et ea nemo ab reprehenderit accusantium quasnvoluptate dolores velit et doloremque molestiae\",\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":7,\n" +
                "      \"title\":\"magnam facilis autem\",\n" +
                "      \"body\":\"dolore placeat quibusdam ea quo vitaenmagni quis enim qui quis quo nemo aut saepe\\nquidem repellat excepturi ut quiasunt ut sequi eos ea sed quas\",\n" +
                "      \"age\":32\n" +
                "   },\n" +
                "   {\n" +
                "      \"userId\":1,\n" +
                "      \"id\":8,\n" +
                "      \"title\":\"dolorem dolore est ipsam\",\n" +
                "      \"body\":\"dignissimos aperiam dolorem qui eumnfacilis quibusdam animi sint suscipit qui sint possimus cum quaerat magni maiores excepturiipsam ut commodi dolor voluptatum modi aut vitae\",\n" +
                "      \"name\":\"John\"\n" +
                "   }\n" +
                "]";
        return Response.status(200).entity(output).build();
    }

}
