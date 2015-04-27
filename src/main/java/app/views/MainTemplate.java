package app.views;

import j2html.src.tags.Tag;

import static app.views.atoms.StaticResources.*;
import static j2html.src.tags.TagCreator.*;

public class MainTemplate {

    public static String render(String title, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                title("j2html - " + title),
                                css_main(),
                                css_prism(),
                                font_lato()
                        ),
                        body().with(
                                header().with(
                                        nav().with(
                                                a("Home").withHref("/"),
                                                a("Download").withHref("/download"),
                                                a("Examples").withHref("/examples"),
                                                a("News").withHref("/news")
                                        )
                                ),
                                main().withId("smooth-stated").with(
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
                                script_jquery(),
                                script_prism(),
                                script_smoothState(),
                                script_main()
                        )
                ).render();
    }

}

