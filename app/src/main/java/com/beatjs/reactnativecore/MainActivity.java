package com.beatjs.reactnativecore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.beatjs.react.Tools;
public class MainActivity extends AppCompatActivity {

//    private ReactRootView mReactRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("===========react-native-core-android" + Tools.NUMBER);
    }
}