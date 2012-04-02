package my.app.hello;

import javax.inject.Named;

@Named
public class DefaultGreeter implements Greeter {

    public String greet(String who) {
        return "Hello " + who;
    }
}
