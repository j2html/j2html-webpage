package app.utils;

import spark.Request;
import java.util.Locale;

public class RequestUtil {

    //misc
    public static MessageGetter messageGetter(Request req) {
        return new MessageGetter(locale(req));
    }

    //params
    public static String brand(Request req) {
        return req.params("brand");
    }

    public static Locale locale(Request req) {
        return null != req.params("locale") ? new Locale(req.params("locale")) : new Locale("en");
    }

    //query params
    public static String email(Request req) {
        return req.queryParams("email");
    }

    public static String enterPassword(Request req) {
        return req.queryParams("enterPassword");
    }

    public static String choosePassword(Request req) {
        return req.queryParams("choosePassword");
    }

    public static String repeatPassword(Request req) {
        return req.queryParams("repeatPassword");
    }

}
