package app;

import app.controllers.LoginController;
import app.utils.Path;
import static spark.Spark.get;
import static spark.Spark.post;

public class Routes {

    public static void setupRoutes() {

        get(Path.LOGIN, LoginController::serveLoginForm);
        post(Path.LOGIN, LoginController::handleLogin);

    }

}
