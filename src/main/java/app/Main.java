package app;

import static app.Routes.setupRoutes;
import static spark.SparkBase.staticFileLocation;

public class Main {

    public static void main(String[] args) {
        staticFileLocation("/public");
        setupRoutes();
    }

}