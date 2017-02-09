
Android WatchFace Sample
===================================

This sample demonstrates how to create watch faces for android wear and includes a phone app
and a wearable app. The wearable app has a variety of watch faces including analog, digital,
opengl, calendar, steps, interactive, etc. It also includes a watch-side configuration example.
The phone app includes a phone-side configuration example.

Because watch face apps do not have a default Activity in their project, you will need to set your
Configurations to "Do not launch Activity" for both the Wear and Application modules. If you are
unsure how to do this, please review the "Run Starter project" section in the
[Google Watch Face Code Lab][1].

For the Fit Distance related watch face, authentication IS a requirement to request distance from
Google Fit on Wear. Otherwise, distance will always come back as zero (or stay at whatever the
distance was prior to you de-authorizing the watch face).

To authenticate and communicate with Google Fit, you must create a project in the Google Developers
Console, activate the Fitness API, create an OAuth 2.0 client ID, and register the public
certificate from your signed APK. More details can be found [here][2].

If the user has not installed or setup the Google Fit app on their phone and their Wear device has
not configured the Google Fit Wear App, then you may get zero steps until one of the two is setup.
Please note, many Wear devices configure the Google Fit Wear App beforehand.

[1]: https://codelabs.developers.google.com/codelabs/watchface/index.html
[2]: https://developers.google.com/fit/android/get-started#step_3_enable_the_fitness_api

Pre-requisites
--------------

- Android SDK 25
- Android Build Tools v25.0.2
- Android Support Repository

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Support
-------

- Google+ Community: https://plus.google.com/communities/105153134372062985968
- Stack Overflow: http://stackoverflow.com/questions/tagged/android

If you've found an error in this sample, please file an issue:
https://github.com/googlesamples/android-WatchFace

Patches are encouraged, and may be submitted by forking this project and
submitting a pull request through GitHub. Please see CONTRIBUTING.md for more details.

License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
