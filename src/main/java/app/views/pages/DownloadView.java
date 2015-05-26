package app.views.pages;

import app.views.MainView;

import static app.views.atoms.CodeExamples.codeSnippet;
import static j2html.TagCreator.*;

public class DownloadView {
    public static String render() {
        return MainView.render(
                "Download",
                "download",
                section().withId("download").with(
                        h1("Maven and GitHub").withClass("banner"),
                        h2("Maven dependency"),
                        p("Add the following dependency to your POM:"),
                        codeSnippet("markup",
                                "<dependency>\n" +
                                "    <groupId>com.j2html</groupId>\n" +
                                "    <artifactId>j2html</artifactId>\n" +
                                "    <version>0.5.0</version>\n" +
                                "</dependency>"),
                        h2("Clone the repo on GitHub"),
                        p().with(
                                text("Please clone and/or fork the repo on "),
                                a("GitHub").withHref("https://github.com/tipsy/j2html").withTarget("_blank"),
                                text(", make changes, and create pull requests! We will go through pull requests every sunday, so don't be shy.")
                        )

                )
        );
    }
}
