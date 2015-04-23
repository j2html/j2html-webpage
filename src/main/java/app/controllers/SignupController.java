package app.controllers;

import app.utils.Path;
import app.views.signup.SignupFormTemplate;
import app.views.signup.SignupResultTemplate;
import spark.Request;
import spark.Response;

import static app.utils.RequestUtil.*;

public class SignupController {

    public static String serveSignupForm(Request req, Response res) {
        return SignupFormTemplate.render(
                messageGetter(req),
                brand(req)
        );
    }

    public static String handleSignupForm(Request req, Response res) {
        return SignupResultTemplate.render(
                messageGetter(req),
                brand(req),
                email(req),
                choosePassword(req),
                repeatPassword(req)
        );
    }

    public static Object redirectToDefaultSignup(Request req, Response res) {
        res.redirect(Path.DEFAULT_QUERY_PARAMS+Path.SIGNUP);
        return null;
    }

}
