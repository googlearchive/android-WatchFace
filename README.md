
Android WatchFace Sample
===================================

A simple sample that demonstrates watch faces and complications for Wear 2.0.

Introduction
------------

This sample demonstrates how to create watch faces for android wear and includes a phone app
and a wearable app. The wearable app has a variety of watch faces including analog, digital,
opengl, interactive, etc. It also includes a watch-side configuration example.
The phone app includes a phone-side configuration example.

The analog watch face demonstrates best practices for using complications in Wear 2.0. It also
includes a configuration Activity for configuring the watch face styles and complications. We
recommend you follow this UX pattern for your own watch faces.

Because watch face apps do not have a default Activity in their project, you will need to set your
Configurations to "Do not launch Activity" for both the Wear and Application modules. If you are
unsure how to do this, please review the "Run Starter project" section in the
[Google Watch Face Code Lab][1].

[1]: https://codelabs.developers.google.com/codelabs/watchface/index.html

Pre-requisites
--------------

- Android SDK 25
- Android Build Tools v25.0.3
- Android Support Repository

Screenshots
-------------

<img src="screenshots/analog-face.png" height="400" alt="Screenshot"/> <img src="screenshots/analog-watch-side-config-1.png" height="400" alt="Screenshot"/> <img src="screenshots/analog-watch-side-config-2.png" height="400" alt="Screenshot"/> <img src="screenshots/digital-face.png" height="400" alt="Screenshot"/> <img src="screenshots/digital-phone-side-config.png" height="400" alt="Screenshot"/> <img src="screenshots/digital-watch-side-config.png" height="400" alt="Screenshot"/> <img src="screenshots/interactive-face.png" height="400" alt="Screenshot"/> <img src="screenshots/tilt-face.png" height="400" alt="Screenshot"/> 

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

Copyright 2017 The Android Open Source Project, Inc.

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
