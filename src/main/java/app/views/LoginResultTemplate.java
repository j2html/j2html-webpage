package app.views;

import app.utils.MessageGetter;

import static app.utils.GagawaWrapper.*;

public class LoginResultTemplate {

    public static String render(MessageGetter msg, String brand, String email, String password) {
        return MainTemplate.render(
                brand,
                msg.get("FORM_TEST"),
                h1().appendText(msg.get("FORM_TEST")),
                h2().appendText(email),
                h2().appendText(password)
        );
    }

}
