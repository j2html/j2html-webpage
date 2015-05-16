package app.views.pages;

import app.views.MainView;

import static j2html.src.tags.TagCreator.*;

public class DownloadView {
    public static String render() {
        return MainView.render(
                "Download",
                "download",
                section().withId("download").with(
                        h1("Clone j2html on GitHub, or grab the jar").withClass("banner"),
                        h2("Clone the repo on GitHub"),
                        p().with(
                                text("If you clone the repo on"),
                                a("GitHub").withHref("https://github.com/tipsy/j2html").withTarget("_blank"),
                                text("there's a higher chance you'll make changes and create pull requests. Do it!")
                        ),
                        h2("Download the jar"),
                        p().with(
                                text("If you just want to use j2html, "),
                                a("here").withHref("").withTarget("_blank"),
                                text("'s a jar."),
                                br(),
                                text("We really wanted to put it on Maven Central, but it was just so much work... Sorry about that, maybe later.")
                        )
                )
        );
    }
}
