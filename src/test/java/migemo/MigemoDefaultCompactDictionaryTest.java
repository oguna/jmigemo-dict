package migemo;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;

public class MigemoDefaultCompactDictionaryTest {
    @Test
    public void test() {
        InputStream is = MigemoDefaultCompactDictionary.getStream();
        assertNotNull(is);
    }
}