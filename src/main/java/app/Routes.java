package app;

import app.controllers.TestController;
import app.utils.Path;
import spark.TemplateViewRoute;
import spark.template.mustache.MustacheTemplateEngine;

public class Routes {

    public static void main(String[] args) {
        Config.ConfigureApp();

        get(Path.HELLO, TestController::sayHello);

    }

    private static void get(String path, TemplateViewRoute handler) {
        spark.Spark.get(path, handler, new MustacheTemplateEngine());
    }



}