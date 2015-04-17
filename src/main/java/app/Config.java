package app;

import static spark.SparkBase.staticFileLocation;

public class Config {

    public static void ConfigureApp(){
        staticFileLocation("/public");
    }

}
