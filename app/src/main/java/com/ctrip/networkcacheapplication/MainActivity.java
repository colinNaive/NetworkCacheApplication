package com.ctrip.networkcacheapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ctrip.networkcacheapplication.callback.ICallback;
import com.ctrip.networkcacheapplication.controller.NetworkCacheManager;
import com.ctrip.networkcacheapplication.controller.Type;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhenhua on 2018/3/15.
 * @email zhshan@ctrip.com ^.^
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Map<String, Object> map = new HashMap<>();
        map.put("paramA", "A");
        map.put("parmaB", "B");
        
        NetworkCacheManager.getInstance(Type.both).send("www.baidu.com", map, new ICallback() {
            @Override
            public void onSuccess(@NotNull String result, boolean fromNetwork) {

            }

            @Override
            public void onFailure(@NotNull String e, boolean fromNetwork) {

            }
        });
    }
}
