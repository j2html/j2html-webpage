package app.views.atoms;

import j2html.src.tags.Tag;

import static j2html.src.tags.TagCreator.link;
import static j2html.src.tags.TagCreator.script;

public class StaticResources {

    public static Tag css_main() {
        return link().withRel("stylesheet").withHref("/css/main.css");
    }

    public static Tag css_prism() {
        return link().withRel("stylesheet").withHref("/css/prism.css");
    }

    public static Tag font_lato() {
        return link().withRel("stylesheet").withHref("http://fonts.googleapis.com/css?family=Lato:100,300,400,700");
    }

    public static Tag script_jquery() {
        return script().withSrc("/js/jquery-2.1.3.min.js");
    }

    public static Tag script_prism() {
        return script().withSrc("/js/prism.js");
    }

    public static Tag script_smoothState() {
        return script().withSrc("/js/jquery.smoothState.js");
    }

    public static Tag script_main() {
        return script().withSrc("/js/main.js");
    }

}
