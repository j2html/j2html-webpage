package app.views.pages;

import app.views.*;
import static app.views.Partials.codeSnippet;
import static j2html.TagCreator.*;

public class ExamplesView {
    public static String render() {
        return MainView.render(
                "Examples of how to use j2html",
                "examples",
                section().withId("examples").with(
                        h1("Reclaim control over your HTML").withClass("banner"),


                        h2().withId("basic-example").withText("Basic example"),
                        p("Creating a basic webpage in j2html is pretty similar to HTML. This Java code:"),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/basic.java")),
                        p("Becomes this HTML:"),
                        codeSnippet("markup", fileAsEscapedString("/codeExamples/basic.html")),
                        p().with(
                                text(
                                    "It's literally impossible to forget to close a div, mistype an attribute name, or forget an attribute quote! " +
                                    "Remember to include the Java wrapping code though, j2html is not a template language, all files are .java. " +
                                    "To see how the wrapping code could look, check out the "
                                ),
                                a("getting started example").withHref("/"),
                                text(".")
                        ),


                        h2().withId("partials").withText("Partials"),
                        p("You can create partials for elements you use a lot:"),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/partial.java")),
                        p("The equivalent HTML would be:"),
                        codeSnippet("markup", fileAsEscapedString("/codeExamples/partial.html")),
                        p("You can then use these partials, for example in a registration form:"),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/view.java")),
                        p("Pretty clean, right? The rendered HTML is more verbose:"),
                        codeSnippet("markup", fileAsEscapedString("/codeExamples/view.html")),
                        p().with(
                                text("Imagine if you wanted labels in addition. The Java snippet would look almost identical: You could create a partial called"),
                                em(" passwordAndLabel() "),
                                text(
                                    "and nothing but the method name would change. The resulting HTML however, would be twice or thrice as big, " +
                                    "depending on whether or not you wrapped the input and label in another tag."
                                )
                        ),


                        h2().withId("loops").withText("Loops"),
                        p("Thanks to Java 8's lambda syntax, you can use loops (streams) inside your HTML-builder:"),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/forLoopLambda.java")),
                        p("You can also extract a method. This would allow you to use regular for-loop syntax (although the example uses streams because they're much cooler):"),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/forLoop.java")),
                        p(
                            "Since this is pure Java, all the Employee methods (getName, getImgPath, getTitle) are available to you, " +
                            "and you get autocomplete suggestions and compile time errors."
                        ),
                        p("Given three random employees, both the above approaches would give the same HTML:"),
                        codeSnippet("markup", fileAsEscapedString("/codeExamples/forLoop.html")),


                        h2().withId("dynamic-views").withText("Dynamic views"),
                        p(
                            "Once you've set up partials, you can call them from wherever, which greatly reduces potential errors. " +
                            "Let's say we want to include the form from the partials-example in our webpage. " +
                            "We want a header above and a footer below. A lot of templating languages make you do this: "
                        ),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/otherTemplates.vm")),
                        p(
                            "This is a pain to work with. You have no idea what the header and footer expects, and you have no way to affect how they treat your content. " +
                            "You can easily break the site by forgetting to close divs, or by forgetting to include either the header or the footer in one of your views. " +
                            "In j2html you can specify the context in which a view is rendered, and supply the rendering method with type safe parameters! " +
                            "If we want to insert our form in a header/footer frame, we simply create a MainView and make it take our view as an argument:"
                        ),
                        codeSnippet("java", fileAsEscapedString("/codeExamples/main.java")),
                        p("Which will result in the rendered HTML:"),
                        codeSnippet("markup", fileAsEscapedString("/codeExamples/main.html")),
                        p(
                            "We would now get a compilation error if we forgot to include a title, and there is 0 chance of forgetting either header or footer, mistyping paths" +
                            ", forgetting to close divs, or anything else."
                        )

                )
        );
    }
}
