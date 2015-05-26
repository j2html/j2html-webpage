package app.views;

import j2html.tags.Tag;

import static app.views.atoms.StaticResources.*;
import static j2html.TagCreator.*;

public class MainView {

    public static String render(String title, String activeTab, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                meta().withName("description").withContent("j2html - Fast and fluent Java 8 HTML5 builder. Type-safe HTML generation for everyone!"),
                                title("j2html - " + title),
                                favicon(),
//                                css_main(),
                                css_prism(),
                                font_lato(),
                                style().with(css_main_inline())
                        ),
                        body().with(
                                tag("gtm").with(script_googleTagmanager()),
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
                                        text(".")
                                ),
                                banner_gitHub(),
                                script_prism()
                        )
                ).render();
    }

}

