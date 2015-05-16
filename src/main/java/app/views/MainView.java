package app.views;

import j2html.src.tags.Tag;

import static app.views.atoms.StaticResources.*;
import static j2html.src.tags.TagCreator.*;

public class MainView {

    public static String render(String title, String activeTab, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                title("j2html - " + title),
                                favicon(),
                                css_main(),
                                css_prism(),
                                font_lato()
                        ),
                        body().with(
                                header().with(
                                        nav().with(
                                                a("Home").withHref("/").withCondClass(activeTab.equals("index"), "active"),
                                                a("Download").withHref("/download").withCondClass(activeTab.equals("download"), "active"),
                                                a("Examples").withHref("/examples").withCondClass(activeTab.equals("examples"), "active"),
                                                a("News").withHref("/news").withCondClass(activeTab.equals("news"), "active")
                                        ),
                                        a().withHref("/").with(
                                                img().withSrc("/img/logo.png")
                                        )
                                ),
                                main().with(
                                        tags //content from other template
                                ),
                                footer().with(
                                        text("This page was created using "),
                                        a("j2html").withHref("https://github.com/tipsy/j2html"),
                                        text(" and "),
                                        a("Spark").withHref("http://sparkjava.com/"),
                                        text(". Webpage source on "),
                                        a("Github").withHref("https://github.com/j2html/j2html-webpage"),
                                        text(".")
                                ),
                                banner_gitHub(),
                                script_prism(),
                                script_googleTagmanager()
                        )
                ).render();
    }

}

