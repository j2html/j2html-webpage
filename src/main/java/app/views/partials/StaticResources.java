package app.views.partials;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.link;
import static j2html.src.tags.TagCreator.script;

public class StaticResources {

    public static Tag mainCSS() {
        return link().withRel("stylesheet").withHref("/css/main.css");
    }

    public static Tag script_jQuery() {
        return script().withSrc("/js/jquery-2.1.3.min.js");
    }

}
