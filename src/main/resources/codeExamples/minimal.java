import static j2html.TagCreator.*;

public class Main {
    public static void main(String[] args) {
        body(
            h1("Heading!").withClass("example"),
            img().withSrc("img/hello.png")
        ).render();
    }
}
