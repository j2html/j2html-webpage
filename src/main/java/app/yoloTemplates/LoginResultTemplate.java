package app.yoloTemplates;

import app.utils.Message;

import static app.utils.GagawaWrapper.*;

public class LoginResultTemplate {

    public static String render(String email, String password) {
        return MainTemplate.render(
                Message.get("FORM_TEST"),
                h1().appendChild(text(Message.get("FORM_TEST"))),
                h2().appendChild(text(email)),
                h2().appendChild(text(password))
        );
    }

}
