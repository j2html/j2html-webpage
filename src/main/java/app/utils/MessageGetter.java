package app.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageGetter {

    private Locale locale;

    public MessageGetter(Locale locale) {
        this.locale = locale;
    }

    public String get(String message){
        ResourceBundle messages = ResourceBundle.getBundle("messages/messages", this.locale);
        return messages.getString(message);
    }

}
