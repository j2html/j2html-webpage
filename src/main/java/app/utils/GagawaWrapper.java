package app.utils;

import com.hp.gagawa.java.elements.*;

public class GagawaWrapper {


    public static Html html(){
        return new Html();
    }

    public static Body body(){
        return new Body();
    }

    public static Head head(){
        return new Head();
    }

    public static Title title() {
        return new Title();
    }

    public static Div div(){
        return new Div();
    }

    public static Link link(){
        return new Link();
    }

    public static H1 h1(){
        return new H1();
    }

    public static H2 h2(){
        return new H2();
    }

    public static H3 h3(){
        return new H3();
    }

    public static Span span(){
        return new Span();
    }

    public static Text text(String text){
        return new Text(text);
    }

    public static Form form(){
        return new Form("#");
    }

    public static Input input(){
        return new Input();
    }

}
