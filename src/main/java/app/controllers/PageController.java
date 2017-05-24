package app.controllers;

import app.views.pages.*;
import javalin.Request;
import javalin.Response;

public class PageController {

    public static void serveIndex(Request req, Response res) {
        res.html(IndexView.render());
    }

    public static void serveDownload(Request req, Response res) {
        res.html(DownloadView.render());
    }

    public static void serveExamples(Request req, Response res) {
        res.html(ExamplesView.render());
    }

    public static void serveNews(Request req, Response res) {
        res.html(NewsView.render());
    }

    public static void serve404(Request req, Response res) {
        res.html(PageNotFoundView.render());
    }
}
