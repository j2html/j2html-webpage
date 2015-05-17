package app;

import app.controllers.PageServer;

import static spark.Spark.get;

public class Routes {

    public static void setupRoutes() {

        get("/",                 PageServer::serveIndex);
        get("/download.html",    PageServer::serveDownload);
        get("/examples.html",    PageServer::serveExamples);
        get("/news.html",        PageServer::serveNews);
        get("/404.html",         PageServer::serve404);

    }

}
