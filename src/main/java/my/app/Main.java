package my.app;

import my.app.hello.Greeter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class Main {

    private final Greeter greeter;

    @Inject
    public Main(Greeter greeter) {
        this.greeter = greeter;
    }
    
    public void run() {
        System.out.println(greeter.greet("Mr Bean"));
    }
    
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/main.xml");
        Main app = context.getBean(Main.class);
        app.run();
    }
}
