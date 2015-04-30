package app.views.pages;

import app.views.MainTemplate;

import static app.views.pages.CodeSnippetsTemplate.*;
import static j2html.src.tags.TagCreator.*;

public class ExamplesTemplate {
    public static String render() {
        return MainTemplate.render(
                "Examples",
                section().withId("examples").with(
                        h1("Reclaim control over your HTML"),
                        h2("Basic example"),
                        p("Creating a basic webpage is very similar to HTML. This Java code:"),
                        basicExampleJava(),
                        p("Becomes this HTML:"),
                        basicExampleHTML(),
                        h2("Partials and nested views"),
                        p("j2html can do much more than create simple static HTML though. When you use traditional " +
                                "logic-less (read: dumb) templates, you lose two very important things: type safety and flexibility."),
                        p("While the loss of flexibility is almost understandable due to concerns about " +
                            "separating business logic from view logic, the loss of type safety is a major concern, and " +
                            "it makes working with templates an unpredictable and untestable affair. The following example will show you " +
                            "how to use j2html to create dynamic and type safe templates. Let's start with defining some input fields:"),
                        partialExampleJava(),
                        p("The equivalent HTML would be:"),
                        partialExampleHTML(),
                        p("You can then use these partials, for example in a registration form:"),
                        viewExampleJava(),
                        p("Pretty clean, right? The rendered HTML is more verbose:"),
                        viewExampleHTML(),
                        p().with(
                                text("Imagine if you wanted labels in addition. The Java snippet would look almost identical: You could create a partial called"),
                                em(" passwordAndLabel() "),
                                text("and nothing but the method name would change. The result HTML however, would be twice or thrice as big, depending on whether " +
                                     "or not you wrapped the input and label in another tag.")
                        ),
                        p().with(
                          text("Once you've set up partials like this, you can call them from wherever, which greatly reduces potential errors. " +
                                  "But this is not much different from macros in some of the more advanced template languages (except it's type safe). What else can j2html do? " +
                                  "Let's say we want to include this form in our webpage. We want a header above and a footer below. Most templating languages make you do this: ")
                        ),
                        otherTemplatesExample(),
                        p("which is a pain to work with. You have no idea what the header and footer expects, and you have no way to affect how they treat your content. " +
                                "You can easily break the site by forgetting to close divs, or by forgetting to include either the header or the footer in one of your views. " +
                                "In j2html you can specify the context in which a view is rendered, and supply the rendering method with type safe parameters! " +
                                "If we want to insert our form in a header/footer frame, we simply create a MainTemplate and make it take our view as an argument:"),
                        mainExampleJava(),
                        p("Which will result in the rendered HTML here:"),
                        mainExampleHTML(),
                        p("We would now get a compilation error if we forgot to include a title, and there is 0 chance of forgetting either header or footer, mistyping paths" +
                                ", forgetting to close divs, or anything else.")

                )
        );
    }
}
