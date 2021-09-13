# react-android

[![Adnroid CI with Gradle](https://github.com/beatjs/react-android/actions/workflows/android.yml/badge.svg?branch=main)](https://github.com/beatjs/react-android/actions/workflows/android.yml)

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


### publish lib to maven repo
1. create `local.properties` file to project root dir.
```properties
OSS_USERNAME={username}
OSS_PASSWORD={password}
OSS_REPOSITORY_URL={repo_url}
```

2. specify `GROUP_ID` , `VERSION_NAME` in `gradle.properties`

3. exec gradle cmd `gradle uploadArchives`