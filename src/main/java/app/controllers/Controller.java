package app.controllers;

import spark.ModelAndView;

public class Controller {
    protected static ModelAndView render(String viewName, Object model) {
        return new ModelAndView(model, viewName);
    }
}
