package app.controllers;

import app.utils.Message;
import app.yoloTemplates.FormTestTemplate;
import spark.Request;
import spark.Response;

public class TestController {

    public static String sayHello(Request request, Response response) {

        return FormTestTemplate.render(Message.get("FORM_TEST"), Message.get("FORM_TEST"));

    }

}
