package app.views.partials;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.button;
import static j2html.src.tags.TagCreator.input;

public class Inputs {

    public static Tag emailInput(String placeholder) {
        return input()
                .withType("email")
                .withId("email")
                .withName("email")
                .withPlaceholder(placeholder)
                .isRequired();
    }

    public static Tag passwordInput(String placeholder) {
        return input()
                .withType("password")
                .withId("password")
                .withName("password")
                .withPlaceholder(placeholder)
                .isRequired();
    }

    public static Tag submitButton(String text) {
        return button().withType("submit").withText(text);
    }

}
