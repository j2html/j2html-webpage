package app;

import app.controllers.*;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        staticFileLocation("/public");
        port(8888);
        get("/",                PageController::serveIndex);
        get("/download.html",   PageController::serveDownload);
        get("/examples.html",   PageController::serveExamples);
        get("/news.html",       PageController::serveNews);
        get("/404.html",        PageController::serve404);
    }

}
