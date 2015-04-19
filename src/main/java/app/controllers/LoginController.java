package app.controllers;

import app.views.*;
import spark.Request;
import spark.Response;

import java.util.Locale;

public class LoginController {

    public static String serveLoginForm(Request α, Response ω) {
        String brand = α.params("brand");
        Locale locale = null != α.params("locale") ? new Locale(α.params("locale")) : new Locale("en");
        return LoginTestTemplate.render(
                brand,
                locale
        );
    }

    public static String handleLogin(Request α, Response ω) {
        String brand = α.params("brand");
        Locale locale = null != α.params("locale") ? new Locale(α.params("locale")) : new Locale("en");
        return LoginResultTemplate.render(
                brand,
                locale,
                α.queryParams("email"),
                α.queryParams("password")
        );
    }

}
