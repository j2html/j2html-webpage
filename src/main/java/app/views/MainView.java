package app.views;

import j2html.tags.*;
import static j2html.TagCreator.*;

public class MainView {

    public static String render(String title, String activeTab, DomContent... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                meta().withName("description").withContent("j2html - Fast and fluent Java HTML builder. Build type-safe HTML 5 with Java 8 expression!"),
                                title(title + " - Java HTML builder"),
                                link().withRel("icon").withHref("/img/favicon.png"),
                                link().withRel("stylesheet").withHref("http://fonts.googleapis.com/css?family=Lato:100,300,400,700"),
                                styleWithInlineFile_min("/public/css/prism.css"),
                                styleWithInlineFile_min("/public/css/main.css")
                        ),
                        body().with(
                                fileAsString("/html/googleTagManager.html"),
                                fileAsString("/html/githubBanner.html"),
                                header().with(
                                        nav().with(
                                                a("Home").withHref("/").withCondClass(activeTab.equals("index"), "active"),
                                                a("Download").withHref("/download.html").withCondClass(activeTab.equals("download"), "active"),
                                                a("Examples").withHref("/examples.html").withCondClass(activeTab.equals("examples"), "active"),
                                                a("News").withHref("/news.html").withCondClass(activeTab.equals("news"), "active")
                                        ),
                                        a().withHref("/").with(
                                                img().withSrc("/img/logo.png").withAlt("j2html logo")
                                        )
                                ),
                                main().with(
                                        tags //content from other template
                                ),
                                footer().with(
                                        text("This page was created using "),
                                        a("j2html").withHref("https://github.com/tipsy/j2html").withTarget("_blank"),
                                        text(" and "),
                                        a("Spark").withHref("http://sparkjava.com/").withTarget("_blank"),
                                        text(". Webpage source on "),
                                        a("Github").withHref("https://github.com/j2html/j2html-webpage").withTarget("_blank"),
                                        text("."),
                                        br(),
                                        p().withClass("lols").withText("A static page generator or a template engine would be better suited than a HTML builder for creating this page, but we had to do it.")
                                ),
                                scriptWithInlineFile("/public/js/prism.js")
                        )
                ).render();
    }

}

