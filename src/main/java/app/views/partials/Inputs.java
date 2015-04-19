package app.views.partials;

import com.hp.gagawa.java.elements.*;

public class Inputs {

    public static Input emailInput(String placeholder) {
        Input input = new Input();
        input.setType("email");
        input.setName("email");
        input.setAttribute("placeholder", placeholder);
        return input;
    }

    public static Input passwordInput(String placeholder) {
        Input input = new Input();
        input.setType("password");
        input.setName("password");
        input.setAttribute("placeholder", placeholder);
        return input;
    }

    public static Button submitButton(String text) {
        Button button = new Button();
        button.setType("submit");
        button.appendChild(new Text(text));
        return button;
    }

}
