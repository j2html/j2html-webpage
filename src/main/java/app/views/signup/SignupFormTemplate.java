package app.views.signup;

import app.utils.MessageGetter;
import app.utils.Path;
import app.views.MainTemplate;

import static app.views.atoms.Inputs.*;
import static j2html.src.tags.TagCreator.*;

public class SignupFormTemplate {

    public static String render(MessageGetter msg, String brand) {
        return MainTemplate.render(
                brand,
                msg.get("SIGNUP_FORM_TITLE"),
                h1().withText(msg.get("SIGNUP_FORM_TITLE")),
                form().withMethod("post").with(
                        emailInput(msg.get("PLACEHOLDER_EMAIL")),
                        choosePasswordInput(msg.get("PLACEHOLDER_CHOOSE_PASSWORD")),
                        repeatPasswordInput(msg.get("PLACEHOLDER_REPEAT_PASSWORD")),
                        submitButton(msg.get("SIGNUP_BUTTON"))
                ),
                a().withHref(Path.DEFAULT_QUERY_PARAMS+Path.LOGIN).withText(msg.get("LOGIN_FORM_TITLE"))
        );
    }

}
