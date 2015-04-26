package app.views.atoms;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.link;
import static j2html.src.tags.TagCreator.script;

public class StaticResources {

    public static Tag css_Main() {
        return link().withRel("stylesheet").withHref("/css/main.css");
    }

    public static Tag font_Josefin () {
        return link().withRel("stylesheet").withHref("http://fonts.googleapis.com/css?family=Josefin+Sans:100,300,400");
    }

    public static Tag script_jQuery() {
        return script().withSrc("/js/jquery-2.1.3.min.js");
    }

}
