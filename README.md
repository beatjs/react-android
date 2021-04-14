# react-android

Step 1. Add the JitPack repository to your build file
```groovy
allprojects {
    repositories {
        ...
	maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.beatjs:react-android:0.63.4.+'
}
```
