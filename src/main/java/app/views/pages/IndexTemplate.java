package app.views.pages;

import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class IndexTemplate {
    public static String render(){
        return MainTemplate.render(
                "Fast and simple Java HTML Generator",
                "index",
                h1("Generate HTML easily using Java")
        );
    }
}