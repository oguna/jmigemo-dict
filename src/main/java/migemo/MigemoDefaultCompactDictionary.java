package migemo;

import java.io.InputStream;

public final class MigemoDefaultCompactDictionary {
    public static InputStream getStream() {
        return MigemoDefaultCompactDictionary.class.getResourceAsStream("/migemo/migemo-compact-dict");
    }
}