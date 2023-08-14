import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTestForConflict {

    @Test
    void newTest() {
        int i = 3;
        System.out.println("How do you find my test?");
        System.out.println("This test is amazing!");
        Assertions.assertTrue(i > 2);
    }
}
