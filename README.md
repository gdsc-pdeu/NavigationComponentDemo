# NavigationComponentDemo

this app is developed to learn navigation components.

## Application Working
![app gif](https://user-images.githubusercontent.com/69664213/145993071-83b2d237-cf09-49bc-a0e4-77ee459a62ca.gif)

## steps to follow:

1. In the app-level build.gradle file, add the following to the dependencies group.

```
dependencies {
implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
}
```
2. For SafeArgs,In the top-level build.gradle file, in buildscript > dependencies, add the following classpath.

```
classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
```
and
In the app-level build.gradle file, within plugins at the top, add androidx.navigation.safeargs.kotlin.
```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
    id 'androidx.navigation.safeargs.kotlin'
}
```
3. In this project we have used view binding. So inorder to enable the ViewBinding feature in Android Studio 4.0 and above.Invoke the following code snippet inside the android{} body of the gradle file.
```
buildFeatures {
       viewBinding = true
}
```
