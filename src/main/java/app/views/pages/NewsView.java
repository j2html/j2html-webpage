package app.views.pages;

import app.views.MainView;

import static j2html.TagCreator.*;

public class NewsView {
    public static String render() {
        return MainView.render(
                "News",
                "news",
                section().withId("news").with(
                        h1("News").withClass("banner"),
                        h2("We're on Maven! (Late May 2015)"),
                        p().with(
                                text("We've finished the herculean task of releasing a plugin on Maven Central. Thanks to Nicholas Smith for his great "),
                                a("tutorial").withHref("http://nicholaspaulsmith.com/maven-sonatype-release/"),
                                text(".")
                        ),
                        h2("Hello j2html! (Mid May 2015)"),
                        p("After years in the making (okay, days), j2html is finally ready for launch! Check out the examples and be amazed.")
                )
        );
    }
}