package app.views.login;

import app.utils.MessageGetter;
import app.utils.Path;
import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class LoginResultTemplate {

    public static String render(MessageGetter msg, String brand, String email, String password) {
        return MainTemplate.render(
                brand,
                msg.get("LOGIN_FORM_TITLE"),
                h1().withText(msg.get("LOGIN_FORM_TITLE")),
                h2().withText(email),
                h2().withText(password),
                a().withHref(Path.DEFAULT_QUERY_PARAMS+Path.SIGNUP).withText(msg.get("SIGNUP_FORM_TITLE"))
        );
    }

}
