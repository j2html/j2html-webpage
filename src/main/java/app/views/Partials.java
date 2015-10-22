package app.views;

import j2html.tags.*;
import static j2html.TagCreator.*;

public class Partials {
    public static Tag codeSnippet(String language, Text snippet) {
        return pre().with(
                code().withClass("language-"+language).with(
                        snippet
                )
        );
    }
}
