package app.views;

import j2html.tags.DomContent;

import static j2html.TagCreator.a;
import static j2html.TagCreator.body;
import static j2html.TagCreator.br;
import static j2html.TagCreator.div;
import static j2html.TagCreator.document;
import static j2html.TagCreator.fileAsString;
import static j2html.TagCreator.footer;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.header;
import static j2html.TagCreator.html;
import static j2html.TagCreator.img;
import static j2html.TagCreator.li;
import static j2html.TagCreator.link;
import static j2html.TagCreator.main;
import static j2html.TagCreator.meta;
import static j2html.TagCreator.nav;
import static j2html.TagCreator.p;
import static j2html.TagCreator.scriptWithInlineFile;
import static j2html.TagCreator.span;
import static j2html.TagCreator.styleWithInlineFile_min;
import static j2html.TagCreator.text;
import static j2html.TagCreator.title;
import static j2html.TagCreator.ul;

public class MainView {

    public static String render(String title, String heading, DomContent... tags) {
        return document().render() +
                html().with(
                        head().with(
                                meta().withCharset("UTF-8"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1"),
                                meta().withName("description").withContent("j2html - Fast and fluent Java HTML builder. Build type-safe HTML 5 with Java 8 expression!"),
                                title(title + " - Java HTML builder"),
                                link().withRel("icon").withHref("/img/favicon.png"),
                                link().withRel("stylesheet").withHref("https://fonts.googleapis.com/css?family=Lato:100,300,400,700"),
                                link().withRel("preload").withSrc("/img/pattern.png"),
                                styleWithInlineFile_min("/public/css/prism.css"),
                                styleWithInlineFile_min("/public/css/main.css")
                        ),
                        body().with(
                                fileAsString("/html/googleTagManager.html"),
                                fileAsString("/html/githubBanner.html"),
                                header().withClass("top-header").with(
                                        nav().withClass("width-limit").with(
                                                a().withId("logo").withHref("/").with(
                                                        span().with(img().withSrc("/img/logo_teal.png").withAlt("j2html logo"), text("j2html"))
                                                ),
                                                ul().with(
                                                        li().with(a("Home").withHref("/")),
                                                        li().with(a("Download").withHref("/download.html")),
                                                        li().with(a("Examples").withHref("/examples.html")),
                                                        li().with(a("News").withHref("/news.html"))
                                                ),
                                                div().withId("github-stars").with(
                                                        fileAsString("/html/githubStars.html")
                                                )
                                        )

                                ),
                                header().withClass("sub-header").withClass("banner").with(
                                        h1(heading).withClass("width-limit")
                                ),
                                main().withClass("width-limit").with(
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

