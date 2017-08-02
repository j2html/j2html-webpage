package app.controllers;

import app.views.pages.*;
import io.javalin.Context;

public class PageController {

    public static void serveIndex(Context ctx) {
        ctx.html(IndexView.render());
    }

    public static void serveDownload(Context ctx) {
        ctx.html(DownloadView.render());
    }

    public static void serveExamples(Context ctx) {
        ctx.html(ExamplesView.render());
    }

    public static void serveNews(Context ctx) {
        ctx.html(NewsView.render());
    }

    public static void serve404(Context ctx) {
        ctx.html(PageNotFoundView.render());
    }
}
