package app.views;

import app.utils.Message;

import java.util.Locale;

import static app.utils.GagawaWrapper.*;
import static app.views.partials.Inputs.*;

public class LoginTestTemplate {

    public static String render(String brand, Locale locale) {
        //TODO: better message handling
        return MainTemplate.render(
                brand,
                Message.get("FORM_TEST", locale),
                h1().appendText(Message.get("FORM_TEST", locale)),
                form().setMethod("post").appendChild(
                        emailInput(Message.get("PLACEHOLDER_EMAIL", locale)),
                        passwordInput(Message.get("PLACEHOLDER_PASSWORD", locale)),
                        submitButton(Message.get("LOGIN_BUTTON", locale))
                )
        );
    }

}
