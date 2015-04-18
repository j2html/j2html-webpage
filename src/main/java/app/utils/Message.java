package app.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
    public static String get(String message) {
        ResourceBundle messages = ResourceBundle.getBundle("messages/messages", new Locale("en"));
        return messages.getString(message);
    }
}
