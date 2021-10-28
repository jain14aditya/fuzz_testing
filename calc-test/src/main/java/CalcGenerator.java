import javafx.util.Pair;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static java.util.Calendar.*;

public class CalcGenerator extends Generator<String>{
    Pair<Integer, Integer> p;
    public CalcGenerator() {
//        super();
//        super();
        super(String.class);

    }
    @Override
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__) {
        // Initialize a calendar object

        // Randomly pick a day, month, and year
        int a = random.nextInt();
        int b = random.nextInt();

        return String.valueOf(a).concat(",").concat(String.valueOf(b));
    }
}
