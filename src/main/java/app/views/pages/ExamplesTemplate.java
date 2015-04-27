package app.views.pages;

import app.views.MainTemplate;

import static app.views.pages.CodeSnippetsTemplate.*;
import static j2html.src.tags.TagCreator.*;

public class ExamplesTemplate {
    public static String render() {
        return MainTemplate.render(
                "Examples",
                section().withId("examples").with(
                        h1("Reclaim control over your HTML"),

                        h2("Basic example"),
                        p("Creating a basic webpage is very similar to HTML. This Java code:"),
                        basicExampleJava(),
                        p("Becomes this HTML:"),
                        basicExampleHTML(),

                        h2("Partials and nested views"),
                        p("j2html can do much more though. When you use traditional logic-less (read: dumb) templates, you lose two very important things: type safety and flexibility."),
                        p("While the loss of flexibility is understandable for some childish reason related to " +
                            "separating business logic from view logic (but, you're a grownup, aren't you? You're capable of making your own decisions?), " +
                            "the loss of type safety is unforgivable. It makes working with templates an unpredictable and untestable affair." +
                            "The following example will show you how to use j2html to create dynamic and type safe templates:")
                )
        );
    }
}
