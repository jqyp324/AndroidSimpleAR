AndroidSimpleAR
=======

Simple AR demo for Android. Parameters are optimized for Google Glass.

<img src="http://thorikawa.github.io/AndroidSimpleAR/img/ar_screenshot.png" />

## Requirement
* Android SDK <https://developer.android.com/sdk/>
* Android NDK <https://developer.android.com/tools/sdk/ndk/>
* OpenCV Android SDK <http://sourceforge.net/projects/opencvlibrary/files/opencv-android/>

## Get it started

* set up environment
```
### expample: export OPENCV_ANDROID_SDK_HOME=/Users/thorikawa/workspace/OpenCV-2.4.8-android-sdk/sdk/native/jni
$ export OPENCV_ANDROID_SDK_HOME=<PATH_TO_OPENCV_ANDROID_SDK>
```
* Build
```
$ cd <PROJECT_ROOT_DIRECTORY>
$ ndk-build
$ ant clean debug install
```
* Recognize marker
 * Use [this image](https://github.com/thorikawa/AndroidSimpleAR/blob/master/marker.png).

## License

[Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)


