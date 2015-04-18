package app.controllers;

import app.utils.Message;
import app.yoloTemplates.LoginResultTemplate;
import app.yoloTemplates.LoginTestTemplate;
import spark.Request;
import spark.Response;

public class LoginController {

    public static String serveLoginForm(Request request, Response response) {
        return LoginTestTemplate.render();
    }

    public static String handleLogin(Request request, Response response) {
        return LoginResultTemplate.render(
                request.queryParams("email"),
                request.queryParams("password")
        );
    }

}
