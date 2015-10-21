package app.views.atoms;

import j2html.tags.Tag;

import static j2html.TagCreator.*;

public class CodeExamples {




    public static Tag codeSnippet(String language, String snippet) {
        return pre().with(
                code().withClass("language-"+language).withText(
                    snippet
                )
        );
    }


}
