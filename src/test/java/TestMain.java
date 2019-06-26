import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test() {
        assertEquals( 8, Main.longestSubstring("preface","singularity"));

    }

    @Test
    public void test1() {
        assertEquals( 5, Main.longestSubstring(" 8684Hh", "7575H--8---"));
    }

    @Test
    public void test2() {
        assertEquals( 3, Main.longestSubstring("looking", "zoology"));
    }

    @Test
    public void test3() {
        assertEquals( 4, Main.longestSubstring("&&&&&&&&&&&&&&$$$$$$$$$$$$GGGG", "$$$$$$$$$G$$$$$hamo&&&&&&&&&&&&&&&&&&&"));
    }

    @Test
    public void test4() {
        assertEquals( 6, Main.longestSubstring("abcd`efgh';lij1|234@578[90klmnopqrstsrqponmlk", "tsrq6\u000789p[`onmlkvutlsrqp12;345onm|lk'jihgfedcba0uvwxyz@"));
    }

//    @Test
//    public void test5() {
//        assertEquals( 6, Main.longestSubstring("abcd`efgh';lij1|234@578[90klmnopqrstsrqponmlk", "tsrq6\u000789p[`onmlkvutlsrqp12;345onm|lk'jihgfedcba0uvwxyz@"));
//    }
//
//    06032016


}
