package app.controllers;

import app.utils.Path;
import app.views.login.LoginFormTemplate;
import app.views.login.LoginResultTemplate;
import spark.Request;
import spark.Response;

import static app.utils.RequestUtil.*;

public class LoginController {

    public static String serveLoginForm(Request req, Response res) {
        return LoginFormTemplate.render(
                messageGetter(req),
                brand(req)
        );
    }

    public static String handleLoginForm(Request req, Response res) {
        return LoginResultTemplate.render(
                messageGetter(req),
                brand(req),
                email(req),
                enterPassword(req)
        );
    }

    public static Object redirectToDefaultLogin(Request req, Response res) {
        res.redirect(Path.DEFAULT_QUERY_PARAMS+Path.LOGIN);
        return null;
    }
}
