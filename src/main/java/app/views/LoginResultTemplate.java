package app.views;

import app.utils.MessageGetter;

import static j2html.src.tags.TagCreator.*;

public class LoginResultTemplate {

    public static String render(MessageGetter msg, String brand, String email, String password) {
        return MainTemplate.render(
                brand,
                msg.get("FORM_TEST"),
                h1().withText(msg.get("FORM_TEST")),
                h2().withText(email),
                h2().withText(password)
        );
    }

}
