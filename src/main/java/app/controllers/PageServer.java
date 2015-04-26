package app.controllers;

import app.views.pages.DownloadTemplate;
import app.views.pages.ExamplesTemplate;
import app.views.pages.IndexTemplate;
import app.views.pages.NewsTemplate;
import spark.Request;
import spark.Response;

public class PageServer {

    public static String serveIndex(Request req, Response res) {
        return IndexTemplate.render();
    }

    public static String serveDownload(Request req, Response res) {
        return DownloadTemplate.render();
    }

    public static String serveExamples(Request req, Response res) {
        return ExamplesTemplate.render();
    }

    public static String serveNews(Request req, Response res) {
        return NewsTemplate.render();
    }


}
