package app;

import app.controllers.TestController;
import spark.TemplateViewRoute;
import spark.template.mustache.MustacheTemplateEngine;

public class Routes {

    public static void main(String[] args) {

        get("/hello", TestController::sayHello);

    }

    private static void get(String path, TemplateViewRoute handler) {
        spark.Spark.get(path, handler, new MustacheTemplateEngine());
    }

}