package app.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageGetter {

    private Locale locale;

    public MessageGetter(Locale locale) {
        this.locale = locale;
    }

    public String get(String message){
        //always defaults to english if the locale is not recognized
        ResourceBundle messages = ResourceBundle.getBundle("messages/messages", this.locale);
        return messages.getString(message);
    }

}
