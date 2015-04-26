package app.views.pages;

import app.views.MainTemplate;

public class NewsTemplate {
    public static String render(){
        return MainTemplate.render(
                "NewsTemplate"
        );
    }
}