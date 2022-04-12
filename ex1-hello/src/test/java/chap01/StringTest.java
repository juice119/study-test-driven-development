package chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    void helloMessageTest() {
        String str = "hello";
        assertEquals(str, "hello");
    }
}
