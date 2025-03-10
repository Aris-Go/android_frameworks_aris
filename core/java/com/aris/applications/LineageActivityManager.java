/**
 * Copyright (C) 2018 The LineageOS project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aris.applications;

import android.content.Context;

public class LineageActivityManager {
    private Context mContext;

    // Long screen related activity settings
    private LongScreen mLongScreen;

    public LineageActivityManager(Context context) {
        mContext = context;

        mLongScreen = new LongScreen(context);
    }

    public boolean shouldForceLongScreen(String packageName) {
        return mLongScreen.shouldForceLongScreen(packageName);
    }
}
