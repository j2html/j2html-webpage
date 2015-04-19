package app.controllers;

import app.utils.MessageGetter;
import app.views.*;
import spark.Request;
import spark.Response;

import static app.utils.ParamGetter.*;

public class LoginController {

    public static String serveLoginForm(Request req, Response res) {
        return LoginTestTemplate.render(
                new MessageGetter(locale(req)),
                brand(req)
        );
    }

    public static String handleLogin(Request req, Response res) {
        return LoginResultTemplate.render(
                new MessageGetter(locale(req)),
                brand(req),
                email(req),
                password(req)
        );
    }

    public static Object redirectToDefaultLogin(Request req, Response res) {
        res.redirect("/connect/no/login");
        return null;
    }
}
