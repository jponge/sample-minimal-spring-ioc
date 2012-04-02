package my.app.multiple;

import javax.inject.Named;

@Named
public class SequenceNumberGenerator implements NumberGenerator {

    private int value = 0;
    
    public int next() {
        return value++;
    }
}
