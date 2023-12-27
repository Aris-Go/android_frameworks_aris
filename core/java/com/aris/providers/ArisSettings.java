/**
 * Copyright (C) 2023 The LibreMobileOS Foundation
 * Copyright (C) 2024 ArisGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aris.providers;

import android.provider.Settings;
import android.util.Log;


/**
 * ArisSettings contains Aris specific preferences in System, Secure, and Global.
 */
public final class ArisSettings {
    private static final String TAG = "ArisSettings";

    /**
     * System settings, containing miscellaneous Aris system preferences. This table holds simple
     * name/value pairs. There are convenience functions for accessing individual settings entries.
     */
    public static final class System extends Settings.NameValueTable {
        // region System Settings

    }

    /**
     * Secure settings, containing miscellaneous Aris secure preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Secure extends Settings.NameValueTable {
        // region Secure Settings

    }

    /**
     * Global settings, containing miscellaneous Aris global preferences. This
     * table holds simple name/value pairs. There are convenience
     * functions for accessing individual settings entries.
     */
    public static final class Global extends Settings.NameValueTable {
        // region Global Settings

        /**
         * Restrict USB
         * 0 = Off, never
         * 1 = Only when the screen is locked
         * 2 = On, always
         *
         * @hide
         */
        public static final String TRUST_RESTRICT_USB = "trust_restrict_usb";

    }
}
