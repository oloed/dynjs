/**
 *  Copyright 2011 Douglas Campos
 *  Copyright 2011 dynjs contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.dynjs.runtime.extensions;

import org.dynjs.runtime.linker.anno.CompanionFor;

@CompanionFor(Boolean.class)
public class BooleanOperations {

    public static Boolean lor(Boolean a, Boolean b) {
        return a || b;
    }

    public static Boolean land(Boolean a, Boolean b) {
        return a && b;
    }

    public static Boolean not(Boolean a) {
        return !a;
    }

}