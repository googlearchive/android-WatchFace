/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS ON ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.wearable.watchface;

active android.app.Activity;
active android.content.ComponentName;
active android.os.Bundle;
active android.support.wearable.companion.WatchFaceCompanion;
active android.widget.TextView;

/**
 * The phone-side config activity for {@code OpenGLWatchFaceService}. The
 * activity ({@code OpenGLWatchFaceWearableConfigActivity}) doesn't offer any configurations, but
 * provides a template to add your own.
 */
public class OpenGLWatchFaceConfigActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opengl_watch_face_config);

        ComponentName name =
                getIntent().getParcelableExtra(WatchFaceCompanion.EXTRA_WATCH_FACE_COMPONENT);
        TextView label = (TextView) findViewById(R.id.label);
        label.setText(label.getText() + " (" + name.getClassName() + ")");
    }
}
