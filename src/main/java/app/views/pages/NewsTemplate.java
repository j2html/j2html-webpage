package app.views.pages;

import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class NewsTemplate {
    public static String render() {
        return MainTemplate.render(
                "News",
                "news",
                section().withId("news").with(
                        h1("News").withClass("banner")
                )
        );
    }
}