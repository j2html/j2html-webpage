TagCreator.class // Static utility class for creating all tags
import static j2html.TagCreator.*; // Use static star import


TagCreator.iff(boolean condition, T ifValue) // If-expression for use in method calls
div().withClasses("menu-element", iff(isActive, "active"))


TagCreator.iffElse(boolean condition, T ifValue, T elseValue) // If/else-expression for use in method calls
div().withClasses("menu-element", iffElse(isActive, "active", "not-active"))


Tag.class // Is extended by ContainerTag (ex <div></div> and EmptyTag (ex <br>)
Tag.attr(String attribute, String value) // Set an attribute on the tag
Tag.withXyz(String value) // Calls attr with predefined attribute (ex .withId, .withClass, etc.)