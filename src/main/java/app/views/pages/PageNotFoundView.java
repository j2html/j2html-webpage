package app.views.pages;

import app.views.MainView;

import static j2html.TagCreator.*;

public class PageNotFoundView {
    public static String render() {
        return MainView.render(
                "Page not found",
                "Page not found",
                section().withId("not-found").with(
                        h2("Use the menu to get back on track!"),
                        p("Error code 404").withClass("error-code")
                )
        );
    }
}
