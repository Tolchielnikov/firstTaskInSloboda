package tests.tasks;

import org.junit.Test;
import tasks.Thimbles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by zOpa
 */
public class ThimblesTests {
    private static Thimbles thimble = new Thimbles();

    @Test
    public void testThimbles() throws IOException {
        //tests to register
        test(2, "A");
        test(2, "a");
        test(1, "aA");
        test(1, "Aa");

        test(1, "B");
        test(1, "b");
        test(1, "bB");
        test(1, "Bb");

        test(3, "C");
        test(3, "c");
        test(1, "cC");
        test(1, "Cc");


        //tests
        test(1, "");

        test(1, "AA");
        test(2, "AAA");

        test(1, "BB");
        test(1, "BBB");

        test(1, "CC");
        test(3, "CCC");

        test(1, "ABC");
        test(1, "CBA");
        test(1, "ABBCBC");
        test(3, "ABBCBCAbcca");

        //todo create mo tests
    }

    @Test
    public void testThimblesToExp() {
        testToException("asd");
        testToException("2222");
        testToException("aaa222");
        testToException("11aa222");
        testToException("CCasdasd");

        // Rus
        testToException("АААВВВССС");
    }

    private static void test(int numberThimble, String str) throws IOException {
        PrintWriter pw = new PrintWriter(new File("inputThimbles.txt"));
        pw.print(str);
        pw.close();
        assertEquals(numberThimble, thimble.run());
    }

    private static void testToException(String str) {
        try {
            PrintWriter pw = new PrintWriter(new File("inputThimbles.txt"));
            pw.print(str);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            try {
                thimble.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fail();
        } catch (IllegalArgumentException iae) {
            //correct
        }
    }
}
