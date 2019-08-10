package controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("UserInfoService")
public class HelloJersey {

    @POST
    @Path("/name/{i}")
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject JerseyRESTService(JSONObject json) {
//        String name = i;
        JSONObject data = json.getJSONObject("data");
        System.out.println(data);
        System.out.println(data.get("templow"));
        JSONArray index1 = data.getJSONArray("index");
        JSONObject msg0 = (JSONObject)index1.get(0);
        System.out.println(msg0.get("msg"));
        System.out.println(index1);
        System.out.println(data.getJSONArray("daily"));
        System.out.println(data.get("pm25"));
        System.out.println(data.getJSONObject("pm25"));
        return json;
    }

    @GET
    @Path("/age/{j}")
    @Produces(MediaType.TEXT_PLAIN)
    public String userAge(@PathParam("j") int j) {

        int age = j;
        return "<User>" + "<Age>" + age + "</Age>" + "</User>";
    }
}
