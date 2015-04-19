package app.controllers;

import app.views.*;
import spark.Request;
import spark.Response;
import java.util.Locale;

import static app.utils.ParamGetter.*;

public class LoginController {

    public static String serveLoginForm(Request req, Response res) {
        return LoginTestTemplate.render(
                brand(req),
                locale(req)
        );
    }

    public static String handleLogin(Request req, Response res) {
        return LoginResultTemplate.render(
                brand(req),
                locale(req),
                email(req),
                password(req)
        );
    }

    public static Object redirectToDefaultLogin(Request req, Response res) {
        res.redirect("/connect/no/login");
        return null;
    }
}
