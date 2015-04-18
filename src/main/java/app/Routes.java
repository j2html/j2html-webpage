package app;

import app.controllers.TestController;
import app.utils.Path;

import static spark.Spark.get;

public class Routes {

    public static void main(String[] args) {
        Config.ConfigureApp();

        get(Path.FORMTEST, TestController::sayHello);

    }



}