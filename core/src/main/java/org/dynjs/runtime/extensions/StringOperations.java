package org.dynjs.runtime.extensions;

import org.dynjs.runtime.linker.anno.CompanionFor;

@CompanionFor(String.class)
public class StringOperations {

    public static Boolean eq(String value, String other) {
        return value.equals(other);
    }

}
