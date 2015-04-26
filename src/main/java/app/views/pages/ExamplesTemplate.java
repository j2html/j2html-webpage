package app.views.pages;

import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class ExamplesTemplate {
    public static String render(){
        return MainTemplate.render(
                "Examples",
                "examples",
                h1("Examples"),
                h2("Basic usage"),
                h2("Partials and nested views")
        );
    }
}
