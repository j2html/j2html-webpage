package app.views;

import com.hp.gagawa.java.FertileNode;
import com.hp.gagawa.java.elements.*;

import static app.utils.GagawaWrapper.*;
import static app.views.partials.StaticResources.*;

public class MainTemplate {

    public static String render(String brand, String title, FertileNode... contentNodes){
        Html html = new Html().appendChild(
                head().appendChild(
                        title().appendText(title),
                        mainCSS()
                ),
                body().appendChild(
                        div().setId("header").appendChild(
                                h1().appendText(brand)
                        ),
                        div().setId("main").appendChild(
                            contentNodes //content from other template
                        ),
                        div().setId("footer").appendText("Footing around"),
                        jQuery()
                )
        );
        return html.write();
    }

}

