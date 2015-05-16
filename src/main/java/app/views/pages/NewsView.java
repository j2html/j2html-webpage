package app.views.pages;

import app.views.MainView;

import static j2html.src.tags.TagCreator.*;

public class NewsView {
    public static String render() {
        return MainView.render(
                "News",
                "news",
                section().withId("news").with(
                        h1("News").withClass("banner"),
                        h2("Hello j2html!"),
                        p("After years in the making (okay, days), j2html is finally ready for launch! Check out the examples and be amazed.")
                )
        );
    }
}