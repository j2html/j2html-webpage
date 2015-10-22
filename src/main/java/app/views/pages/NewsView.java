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

                        h2("j2html 0.7 released!"),
                        p("We are proud to announce the release of j2html 0.7."),
                        p("Changes:"),
                        ul().with(
                                li().with(text("Java 7 support (previously only worked with Java 8)")),
                                li().with(text("Methods for getting CSS/JS inline and minified")),
                                li().with(text("Methods for getting a file as escaped/unescape text (easily include static HTML such as Google Analytics code)")),
                                li().with(text("Use apache stringutils for escaping"))
                        ),

                        h2("j2html is on Maven! (Late May 2015)"),
                        p().with(
                                text("We've finished the herculean task of releasing on Maven Central. Thanks to Nicholas Smith for his great "),
                                a("tutorial").withHref("http://nicholaspaulsmith.com/maven-sonatype-release/").withTarget("_blank"),
                                text(".")
                        ),

                        h2("Hello j2html! (Mid May 2015)"),
                        p("After years in the making (okay, days), j2html is finally ready for launch! Check out the examples and be amazed.")
                )
        );
    }
}
