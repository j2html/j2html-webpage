package app.controllers;

import app.views.pages.*;
import spark.Request;
import spark.Response;

public class PageServer {

    public static String serveIndex(Request req, Response res) {
        return IndexView.render();
    }

    public static String serveDownload(Request req, Response res) {
        return DownloadView.render();
    }

    public static String serveExamples(Request req, Response res) {
        return ExamplesView.render();
    }

    public static String serveNews(Request req, Response res) {
        return NewsView.render();
    }

    public static String serve404(Request request, Response response) {
        return PageNotFoundView.render();
    }
}
