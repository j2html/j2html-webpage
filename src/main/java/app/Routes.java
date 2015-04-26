package app;

import app.controllers.PageServer;

import static spark.Spark.get;

public class Routes {

    public static void setupRoutes() {

        //login
        get("/",            PageServer::serveIndex);
        get("/download",    PageServer::serveDownload);
        get("/examples",    PageServer::serveExamples);
        get("/news",        PageServer::serveNews);

    }

}
