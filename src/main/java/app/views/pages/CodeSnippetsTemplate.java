package app.views.pages;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.*;

public class CodeSnippetsTemplate {

    /** this file is actually a really good example of where j2html sucks
     * well, would suck, if it wasn't for intellij's auto-formatting <3
     * anyway, j2html is -not- intended for this kind of use,
     * but you know ... gotta dogfood
     *
     * if you ever find yourself in a situation where you're doing this with
     * j2html, please use a database to store properly formatted content
     */

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
                        ")"
        );
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
                        "<html>"
        );
    }

    public static Tag partialExampleJava() {
        return codeSnippet("java",
                "public static Tag enterPasswordInput(String placeholder){\n" +
                        "    return passwordInput(\"enterPassword\", placeholder);\n" +
                        "}\n" +
                        "\n" +
                        "public static Tag choosePasswordInput(String placeholder){\n" +
                        "    return passwordInput(\"choosePassword\", placeholder);\n" +
                        "}\n" +
                        "\n" +
                        "public static Tag repeatPasswordInput(String placeholder){\n" +
                        "    return passwordInput(\"repeatPassword\", placeholder);\n" +
                        "}\n" +
                        "\n" +
                        "public static Tag passwordInput(String identifier, String placeholder) {\n" +
                        "    return input()\n" +
                        "            .withType(\"password\")\n" +
                        "            .withId(identifier)\n" +
                        "            .withName(identifier)\n" +
                        "            .withPlaceholder(placeholder)\n" +
                        "            .isRequired();\n" +
                        "}\n" +
                        "\n" +
                        "public static Tag emailInput(String placeholder) {\n" +
                        "    return input()\n" +
                        "            .withType(\"email\")\n" +
                        "            .withId(\"email\")\n" +
                        "            .withName(\"email\")\n" +
                        "            .withPlaceholder(placeholder)\n" +
                        "            .isRequired();\n" +
                        "}\n" +
                        "\n" +
                        "public static Tag submitButton(String text) {\n" +
                        "    return button().withType(\"submit\").withText(text);\n" +
                        "}"
        );
    }

    public static Tag partialExampleHTML() {
        return codeSnippet("markup",
                "<input \n" +
                        "    type=\"password\" \n" +
                        "    id=\"choosePassword\" \n" +
                        "    name=\"choosePassword\" \n" +
                        "    placeholder=\"Enter password\" \n" +
                        "    required\n" +
                        "    >\n" +
                        "    \n" +
                        "<input \n" +
                        "    type=\"password\" \n" +
                        "    id=\"choosePassword\" \n" +
                        "    name=\"choosePassword\" \n" +
                        "    placeholder=\"Choose password\" \n" +
                        "    required\n" +
                        "    >\n" +
                        "    \n" +
                        "<input \n" +
                        "    type=\"password\" \n" +
                        "    id=\"repeatPassword\" \n" +
                        "    name=\"repeatPassword\" \n" +
                        "    placeholder=\"Repeat password\" \n" +
                        "    required\n" +
                        "    >\n" +
                        "    \n" +
                        "<input \n" +
                        "    type=\"email\" \n" +
                        "    id=\"email\" \n" +
                        "    name=\"email\" \n" +
                        "    placeholder=\"Email\" \n" +
                        "    required\n" +
                        "    >\n" +
                        "    \n" +
                        "<button type=\"submit\">Text</button>"
        );
    }

    public static Tag viewExampleJava() {
        return codeSnippet("java",
                "h1(\"Please sign up\"),\n" +
                        "form().withMethod(\"post\").with(\n" +
                        "        emailInput(\"Email address\"),\n" +
                        "        choosePasswordInput(\"Choose Password\"),\n" +
                        "        repeatPasswordInput(\"Repeat Password\"),\n" +
                        "        submitButton(\"Sign up\")\n" +
                        ")"
        );
    }

    public static Tag viewExampleHTML() {
        return codeSnippet("markup",
                "<h1>Please sign up</h1>\n" +
                        "<form method=\"post\">\n" +
                        "    <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Email address\" required>\n" +
                        "    <input type=\"password\" id=\"choosePassword\" name=\"choosePassword\" placeholder=\"Choose password\" required>\n" +
                        "    <input type=\"password\" id=\"repeatPassword\" name=\"repeatPassword\" placeholder=\"Repeat password\" required>\n" +
                        "    <button type=\"submit\">Sign up</button>\n" +
                        "</form>"
        );
    }

    public static Tag otherTemplatesExample() {
        return codeSnippet("java",
                "#include(\"/path/to/header\")\n" +
                        "#setTitle(\"Signup page\")\n" +
                        "<h1>Please sign up</h1>\n" +
                        "<form>\n" +
                        "    ...\n" +
                        "</form>\n" +
                        "#include(\"/path/to/footer\")"
        );
    }

    public static Tag mainExampleJava() {
        return codeSnippet("java",
                "public class MainTemplate {\n" +
                        "    public static String render(String pageTitle, Tag... tags) {\n" +
                        "        return html().with(\n" +
                        "                head().with(\n" +
                        "                    title(pageTitle)\n" +
                        "                ),\n" +
                        "                body().with(\n" +
                        "                    header().with(\n" +
                        "                       ...\n" +
                        "                    ),\n" +
                        "                    main().with(\n" +
                        "                        tags //content from our form\n" +
                        "                    ),\n" +
                        "                    footer().with(\n" +
                        "                        ...\n" +
                        "                    )\n" +
                        "                )\n" +
                        "        ).render();\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "MainTemplate.render(\n" +
                        "        \"Signup page\",\n" +
                        "        h1(\"Please sign up\"),\n" +
                        "        form().withMethod(\"post\").with(\n" +
                        "                emailInput(\"Email address\"),\n" +
                        "                choosePasswordInput(\"Choose Password\"),\n" +
                        "                repeatPasswordInput(\"Repeat Password\"),\n" +
                        "                submitButton(\"Sign up\")\n" +
                        "        )\n" +
                        ");\n"
        );
    }

    public static Tag mainExampleHTML() {
        return codeSnippet("markup",
                "<html>\n" +
                        "   <head>\n" +
                        "      <title>Signup page</title>\n" +
                        "   </head>\n" +
                        "   <body>\n" +
                        "      <header>\n" +
                        "         ...\n" +
                        "      </header>\n" +
                        "      <main>\n" +
                        "        <h1>Please sign up</h1>\n" +
                        "        <form method=\"post\">\n" +
                        "            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Email address\" required>\n" +
                        "            <input type=\"password\" id=\"choosePassword\" name=\"choosePassword\" placeholder=\"Choose password\" required>\n" +
                        "            <input type=\"password\" id=\"repeatPassword\" name=\"repeatPassword\" placeholder=\"Repeat password\" required>\n" +
                        "            <button type=\"submit\">Sign up</button>\n" +
                        "        </form>\n" +
                        "      </main>\n" +
                        "      <footer>\n" +
                        "        ...\n" +
                        "      </footer>\n" +
                        "   </body>\n" +
                        "</html>"
        );
    }

    public static Tag codeSnippet(String language, String snippet){
        return pre().with(
                code().withClass("language-"+language).withText(
                    snippet
                )
        );
    }


}
