package app.views.pages;

import app.views.MainTemplate;

import static j2html.src.tags.TagCreator.*;

public class DownloadTemplate {
    public static String render(){
        return MainTemplate.render(
                "Download",
                "download",
                h1("Download")
        );
    }
}
