package my.app.multiple;

import javax.inject.Named;
import java.util.Random;

@Named
public class RandomNumberGenerator implements NumberGenerator {

    private final Random random = new Random();

    public int next() {
        return random.nextInt();
    }
}
