package app.views.partials;

import com.hp.gagawa.java.elements.Link;
import com.hp.gagawa.java.elements.Script;


public class StaticResources {

    public static Link mainCSS() {
        return new Link().setRel("stylesheet").setHref("/css/main.css");
    }

    public static Script jQuery() {
        return new Script("text/javascript").setSrc("/js/jquery-2.1.3.min.js");
    }

}
