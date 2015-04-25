package app.views.login;

import app.utils.MessageGetter;
import app.utils.Path;
import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;
import static app.views.atoms.Inputs.*;

public class LoginFormTemplate {

    public static String render(MessageGetter msg, String brand) {
        return MainTemplate.render(
                brand,
                msg.get("LOGIN_FORM_TITLE"),
                h1(msg.get("LOGIN_FORM_TITLE")),
                form().withMethod("post").with(
                        emailInput(msg.get("PLACEHOLDER_EMAIL")),
                        enterPasswordInput(msg.get("PLACEHOLDER_PASSWORD")),
                        submitButton(msg.get("LOGIN_BUTTON"))
                ),
                a().withHref(Path.DEFAULT_QUERY_PARAMS+Path.SIGNUP).withText(msg.get("SIGNUP_FORM_TITLE"))
        );
    }

}
