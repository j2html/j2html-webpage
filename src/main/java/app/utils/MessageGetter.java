package app.utils;

import java.util.ResourceBundle;

public class MessageGetter {

    public static String get(String message){
        ResourceBundle messages = ResourceBundle.getBundle("messages/messages");
        return messages.getString(message);
    }

}
