package app.views;

import app.utils.MessageGetter;

import static app.utils.GagawaWrapper.*;
import static app.views.partials.Inputs.*;

public class LoginTestTemplate {

    public static String render(MessageGetter msg, String brand) {
        return MainTemplate.render(
                brand,
                msg.get("FORM_TEST"),
                h1().appendText(msg.get("FORM_TEST")),
                form().setMethod("post").appendChild(
                        emailInput(msg.get("PLACEHOLDER_EMAIL")),
                        passwordInput(msg.get("PLACEHOLDER_PASSWORD")),
                        submitButton(msg.get("LOGIN_BUTTON"))
                )
        );
    }

}
