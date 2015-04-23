package app;

import app.controllers.LoginController;
import app.controllers.SignupController;
import app.utils.Path;
import static spark.Spark.get;
import static spark.Spark.post;

public class Routes {

    public static void setupRoutes() {

        //login
        get(Path.LOGIN, LoginController::redirectToDefaultLogin);
        get(Path.QUERY_PARAMS + Path.LOGIN, LoginController::serveLoginForm);
        post(Path.QUERY_PARAMS + Path.LOGIN, LoginController::handleLoginForm);

        get(Path.SIGNUP, SignupController::redirectToDefaultSignup);
        get(Path.QUERY_PARAMS + Path.SIGNUP, SignupController::serveSignupForm);
        post(Path.QUERY_PARAMS + Path.SIGNUP, SignupController::handleSignupForm);



    }

}
