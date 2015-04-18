package app.yoloTemplates;

import com.hp.gagawa.java.FertileNode;
import com.hp.gagawa.java.elements.*;

import static app.utils.GagawaWrapper.*;

public class MainTemplate {

    public static String render(String title, FertileNode... contentNodes){
        Html html = new Html().appendChild(
                head().appendChild(
                        title().appendChild(text(title)),
                        link().setRel("stylesheet").setHref("/css/main.css")

                ),
                body().appendChild(
                        div().setId("header"),
                        div().setId("main").appendChild(
                            contentNodes //content from other template
                        ),
                        div().setId("footer")
                )
        );
        return html.write();
    }

}

