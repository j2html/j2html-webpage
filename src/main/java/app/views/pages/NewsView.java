package app.views.pages;

import app.views.MainView;

import static j2html.TagCreator.*;

public class NewsView {
    public static String render() {
        return MainView.render(
                "News about j2html",
                "news",
                section().withId("news").with(
                        h1("The latest news").withClass("banner"),

                        h2().withId("j2html-0.7-released").withText("j2html 0.7 released!"),
                        p().with(
                                text("We have sacrificed to the Maven Gods, and j2html 0.7 is available for download on "),
                                a("Maven Central").withHref("http://search.maven.org/#artifactdetails%7Ccom.j2html%7Cj2html%7C0.7%7Cjar").withTarget("_blank"),
                                text(".")
                        ),
                        p("Changes:"),
                        ul().with(
                                li().with(text("New file-api (avilable from TagCreator class):")).with(
                                        dl().with(
                                                dt("fileAsString(String path)"),
                                                dd("returns a file's content as a String (useful for including static HTML such as Google Analytics code)"),

                                                dt("fileAsEscapedString(String path)"),
                                                dd("returns fileAsString(path) escaped (useful for including the code-examples on this website)"),

                                                dt("styleWithInlineFile(String path)"),
                                                dd("returns <style>fileAsString(path)</style>"),

                                                dt("styleWithInlineFile_min(String path)"),
                                                dd("returns <style>fileAsString(path)</style>, minimized using CSSMin"),

                                                dt("scriptWithInlineFile(String path)"),
                                                dd("returns <script>fileAsString(path)</script>"),

                                                dt("scriptWithInlineFile_min(String path)"),
                                                dd("returns <script>fileAsString(path)</script>, minimized using Google Closure")
                                        )
                                ),
                                li().with(text("Java 7 support (j2html previously only worked with Java 8)")),
                                li().with(text("Use apache stringutils for escaping"))
                        ),

                        h2().withId("j2html-on-maven").withText("j2html is on Maven! (Late May 2015)"),
                        p().with(
                                text("We've finished the herculean task of releasing on Maven Central. Thanks to Nicholas Smith for his great "),
                                a("tutorial").withHref("http://nicholaspaulsmith.com/maven-sonatype-release/").withTarget("_blank"),
                                text(".")
                        ),

                        h2().withId("hello-j2html").withText("Hello j2html! (Mid May 2015)"),
                        p("After years in the making (okay, days), j2html is finally ready for launch! Check out the examples and be amazed.")
                )
        );
    }
}
