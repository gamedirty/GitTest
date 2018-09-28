package com.sovnem.mfw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mJson = "{\"id\":\"1111\",\"gaga\":\"1111\",\"mdd\":{\"mddId\":\"mddId\",\"mddName\":\"mddName\"}}";
        People people1 = new Gson().fromJson(mJson,People.class);
        Log.i("zhjh","什么挖："+people1.toString()+","+(people1.mdd instanceof People.Mdd));

        People people = new People();
        people.setId("1111");
        People.Mdd mdd = new People.Mdd();
        mdd.mddId = "mddId";
        mdd.mddName  ="mddName";
        people.setMdd(mdd);
        String json = new Gson().toJson(people);
        Log.i("zhjh","啦啦啦："+ json);
    }

}
