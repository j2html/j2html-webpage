package app.views.pages;

import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class DownloadTemplate {
    public static String render() {
        return MainTemplate.render(
                "Download",
                "download",
                section().withId("download").with(
                        h1("Clone j2html on GitHub, or grab the jar").withClass("banner"),
                        p("Something something sorry about no maven yet")
                )
        );
    }
}
