package app.views;

import app.utils.MessageGetter;

import static j2html.src.tags.TagCreator.*;
import static app.views.partials.Inputs.*;

public class LoginTestTemplate {

    public static String render(MessageGetter msg, String brand) {
        return MainTemplate.render(
                brand,
                msg.get("FORM_TEST"),
                h1().withText(msg.get("FORM_TEST")),
                form().withMethod("post").with(
                        emailInput(msg.get("PLACEHOLDER_EMAIL")),
                        passwordInput(msg.get("PLACEHOLDER_PASSWORD")),
                        submitButton(msg.get("LOGIN_BUTTON"))
                )
        );
    }

}
