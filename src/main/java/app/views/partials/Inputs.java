package app.views.partials;

import com.hp.gagawa.java.elements.*;

public class Inputs {

    public static Input emailInput(String placeholder) {
        Input input = new Input()
                .setType("email")
                .setId("email")
                .setName("email");
        input.setAttribute("placeholder", placeholder);
        input.setAttribute("required", "true");
        return input;
    }

    public static Input passwordInput(String placeholder) {
        Input input = new Input()
                .setType("password")
                .setId("password")
                .setName("password");
        input.setAttribute("placeholder", placeholder);
        input.setAttribute("required", "true");
        return input;
    }

    public static Button submitButton(String text) {
        return new Button()
                .setType("submit")
                .appendText(text);
    }

}
