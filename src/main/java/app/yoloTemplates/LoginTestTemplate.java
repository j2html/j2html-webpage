package app.yoloTemplates;

import app.utils.Message;
import app.utils.Path;

import static app.utils.GagawaWrapper.*;
import static app.yoloTemplates.partials.Partials.*;

public class LoginTestTemplate {

    public static String render() {
        return MainTemplate.render(
                Message.get("FORM_TEST"),
                h1().appendChild(text(Message.get("FORM_TEST"))),
                form().setMethod("post").appendChild(
                        emailInput(),
                        passwordInput(),
                        loginButton()
                )
        );
    }

}
