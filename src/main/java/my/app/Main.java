package my.app;

import my.app.hello.Greeter;
import my.app.multiple.NumberGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Set;

@Named
@Singleton
public class Main {

    private final Greeter greeter;
    private final Set<NumberGenerator> generators;

    @Inject
    public Main(Greeter greeter, Set<NumberGenerator> generators) {
        this.greeter = greeter;
        this.generators = generators;
    }

    public void run() {
        System.out.println(greeter.greet("Mr Bean"));
        for (int i = 0; i < 10; i++) {
            for (NumberGenerator generator : generators) {
                System.out.println(generator.next());
            }
        }
    }

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/main.xml");
        Main app = context.getBean(Main.class);
        app.run();
    }
}
