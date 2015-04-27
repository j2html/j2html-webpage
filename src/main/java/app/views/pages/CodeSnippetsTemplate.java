package app.views.pages;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.*;

public class CodeSnippetsTemplate {

    //thank god/jetbrains for intellij's auto-formatting

    public static Tag basicExampleJava(){
        return codeSnippet("java",
                "html().with(\n" +
                        "    head().with(\n" +
                        "        title(\"Title\"),\n" +
                        "        link().withRel(\"stylesheet\").withHref(\"/css/main.css\")\n" +
                        "    ),\n" +
                        "    body().with(\n" +
                        "        main().with(\n" +
                        "            h1(\"Heading!\")\n" +
                        "        )\n" +
                        "    )\n" +
                        ")");
    }

    public static Tag basicExampleHTML() {
        return codeSnippet("markup",
                "<html>\n" +
                        "    <head>\n" +
                        "        <title>Title</title>\n" +
                        "        <link rel=\"stylesheet\" href=\"/css/main.css\">\n" +
                        "    </head>\n" +
                        "    <body>\n" +
                        "        <main>\n" +
                        "            <h1>Heading!</h1>\n" +
                        "        </main>\n" +
                        "    </body>\n" +
                        "<html>");
    }






    public static Tag codeSnippet(String language, String snippet){
        return pre().with(
                code().withClass("language-"+language).withText(
                    snippet
                )
        );
    }


}
