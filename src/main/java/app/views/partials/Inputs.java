package app.views.partials;


import j2html.src.tags.ContainerTag;
import j2html.src.tags.EmptyTag;

import static j2html.src.tags.TagCreator.*;

public class Inputs {

    public static EmptyTag emailInput(String placeholder) {
        return input()
                .withType("email")
                .withId("email")
                .withName("email")
                .withPlaceholder(placeholder)
                .isRequired();
    }

    public static EmptyTag passwordInput(String placeholder) {
        return input()
                .withType("password")
                .withId("password")
                .withName("password")
                .withPlaceholder(placeholder)
                .isRequired();
    }

    public static ContainerTag submitButton(String text) {
        return button().withType("submit").withText(text);
    }

}
