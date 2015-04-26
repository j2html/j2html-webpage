package app.views;

import j2html.src.tags.Tag;

import static app.views.atoms.StaticResources.mainCSS;
import static app.views.atoms.StaticResources.script_jQuery;
import static j2html.src.tags.TagCreator.*;

public class MainTemplate {

    public static String render(String title, Tag... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                title(title),
                                mainCSS()
                        ),
                        body().with(
                                header().with(
                                        nav().with(
                                                li().with(a("Home").withHref("/")),
                                                li().with(a("Download").withHref("/download")),
                                                li().with(a("Examples").withHref("/examples")),
                                                li().with(a("News").withHref("/news"))
                                        )
                                ),
                                main().with(
                                        div().with(
                                                tags //content from other template
                                        )
                                ),
                                footer(),
                                script_jQuery()
                        )
                ).render();
    }

}

