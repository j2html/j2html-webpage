package app;

import app.controllers.LoginController;
import app.utils.Path;

import static spark.Spark.*;

public class Routes {

    public static void main(String[] args) {
        Config.ConfigureApp();

        get(Path.LOGIN, LoginController::serveLoginForm);

        post(Path.LOGIN, LoginController::handleLogin);
    }



}