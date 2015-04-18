package app.yoloTemplates.partials;

import app.utils.Message;
import com.hp.gagawa.java.elements.*;

public class Partials {

    public static Input emailInput() {
        Input input = new Input();
        input.setType("email");
        input.setName("email");
        input.setAttribute("placeholder", "Email");
        return input;
    }

    public static Input passwordInput() {
        Input input = new Input();
        input.setType("password");
        input.setName("password");
        input.setAttribute("placeholder", "Password");
        return input;
    }

    public static Button loginButton() {
        return submitButton(Message.get("LOGIN_BUTTON"));
    }

    public static Button submitButton(String text) {
        Button button = new Button();
        button.setType("submit");
        button.appendChild(new Text(text));
        return button;
    }

}
