package app.views.partials;

import j2html.src.tags.ContainerTag;
import j2html.src.tags.EmptyTag;

import static j2html.src.tags.TagCreator.*;

public class StaticResources {

    public static EmptyTag mainCSS() {
        return link().withRel("stylesheet").withHref("/css/main.css");
    }

    public static ContainerTag script_jQuery() {
        return script().withSrc("/js/jquery-2.1.3.min.js");
    }

}
