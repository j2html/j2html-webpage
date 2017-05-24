package app;

import app.controllers.PageController;
import javalin.Javalin;


public class Main {

    public static void main(String[] args) {
        Javalin.create()
            .enableStaticFiles("/public")
            .port(8888)
            .get("/",               PageController::serveIndex)
            .get("/download.html",  PageController::serveDownload)
            .get("/examples.html",  PageController::serveExamples)
            .get("/news.html",      PageController::serveNews)
            .get("/404.html",       PageController::serve404);
    }

}
