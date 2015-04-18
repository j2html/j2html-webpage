package app.yoloTemplates;

import com.hp.gagawa.java.elements.*;

public class YoloTemplate {


    protected static Html html(){
        return new Html();
    }

    protected static Body body(){
        return new Body();
    }

    protected static Head head(){
        return new Head();
    }

    protected static Title title() {
        return new Title();
    }

    protected static Div div(){
        return new Div();
    }

    protected static Link link(){
        return new Link();
    }

    protected static H1 h1(){
        return new H1();
    }

    protected static H2 h2(){
        return new H2();
    }

    protected static H3 h3(){
        return new H3();
    }

    protected static Span span(){
        return new Span();
    }

    protected static Text text(String text){
        return new Text(text);
    }

    protected static Form form(String action){
        return new Form(action);
    }

    protected static Input input(){
        return new Input();
    }

}
