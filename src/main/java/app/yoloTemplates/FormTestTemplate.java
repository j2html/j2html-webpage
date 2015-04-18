package app.yoloTemplates;

public class FormTestTemplate extends YoloTemplate {

    public static String render(String title, String output) {
        return MainTemplate.render(
                title,
                div().setId("injected-div").appendChild(
                        h1().appendChild(text(output))
                ),
                form("post").appendChild(
                        input().setType("text"),
                        input().setType("email"),
                        input().setType("password")
                )
        );
    }

}
