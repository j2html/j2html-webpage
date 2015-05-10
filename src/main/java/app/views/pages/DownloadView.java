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
                        p("Something something"),
                        h2("Download the jar"),
                        p("Something something")
                )
        );
    }
}
