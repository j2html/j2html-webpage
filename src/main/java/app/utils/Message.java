package app.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Message {

    public static String get(String message, Locale locale) {
        ResourceBundle messages = ResourceBundle.getBundle("messages/messages", locale);
        return messages.getString(message);
    }

}
