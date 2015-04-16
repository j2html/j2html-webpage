package app.controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class TestController {

    public static ModelAndView sayHello(Request request, Response response) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Sam");
        return new ModelAndView(map, "hello.mustache");
    }

}
