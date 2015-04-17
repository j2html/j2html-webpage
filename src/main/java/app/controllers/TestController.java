package app.controllers;

import app.utils.Template;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class TestController extends Controller {

    public static ModelAndView sayHello(Request request, Response response) {
        Map<String, Object> model = new HashMap<>();
        model.put("name", "Sam");
        return render(Template.HELLO, model);
    }

}
