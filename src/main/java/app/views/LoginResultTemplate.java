package app.views;

import app.utils.Message;

import java.util.Locale;

import static app.utils.GagawaWrapper.*;

public class LoginResultTemplate {

    public static String render(String brand, Locale locale, String email, String password) {
        return MainTemplate.render(
                brand,
                Message.get("FORM_TEST", locale),
                h1().appendText(Message.get("FORM_TEST", locale)),
                h2().appendText(email),
                h2().appendText(password)
        );
    }

}
