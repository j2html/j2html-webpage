package app.utils;

import spark.Request;

import java.util.Locale;

public class ParamGetter {

    //params
    public static String brand(Request req) {
        return req.params("brand");
    }

    public static Locale locale(Request req) {
        return null != req.params("locale") ? new Locale(req.params("locale")) : new Locale("en");
    }

    //queryParams
    public static String email(Request req) {
        return req.queryParams("email");
    }

    public static String password(Request req) {
        return req.queryParams("password");
    }

}
