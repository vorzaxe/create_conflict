import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTestForConflict {

    @Test
    void newTest() {
        int i = 3;
        int b = 8;
        System.out.println("This test is amazing!");
        Assertions.assertTrue(i > b);
    }
}
