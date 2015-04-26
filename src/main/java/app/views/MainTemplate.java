package app.views;

import j2html.src.tags.Tag;

import static app.views.atoms.StaticResources.*;
import static j2html.src.tags.TagCreator.*;

public class MainTemplate {

    public static String render(String title, String bodyClass, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                title("j2html - " + title),
                                css_Main(),
                                font_Josefin()
                        ),
                        body().withClass(bodyClass).with(
                                header().with(
                                        nav().with(
                                                a("Home").withHref("/"),
                                                a("Download").withHref("/download"),
                                                a("Examples").withHref("/examples"),
                                                a("News").withHref("/news")
                                        )
                                ),
                                main().with(
                                        tags //content from other template
                                ),
                                footer(),
                                script_jQuery()
                        )
                ).render();
    }

}

