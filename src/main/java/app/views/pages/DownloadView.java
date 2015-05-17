package app.views.pages;

import app.views.MainView;

import static j2html.src.tags.TagCreator.*;

public class DownloadView {
    public static String render() {
        return MainView.render(
                "Download",
                "download",
                section().withId("download").with(
                        h1("Clone j2html on GitHub").withClass("banner"),
                        h2("Clone the repo on GitHub"),
                        p().with(
                                text("Please clone and/or fork the repo on "),
                                a("GitHub").withHref("https://github.com/tipsy/j2html").withTarget("_blank"),
                                text(", make changes, and create pull requests! We will go through pull requests every sunday, so don't be shy.")
                        ),
                        h2("What, no Maven?"),
                        p("We really wanted to put it on Maven Central, but it was just so much work... Maybe later!")
                )
        );
    }
}
