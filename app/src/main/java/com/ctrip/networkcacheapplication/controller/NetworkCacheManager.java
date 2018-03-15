package com.ctrip.networkcacheapplication.controller;

import com.ctrip.networkcacheapplication.callback.ICallback;
import com.ctrip.networkcacheapplication.processor.CacheProcessor;
import com.ctrip.networkcacheapplication.processor.IProcess;
import com.ctrip.networkcacheapplication.processor.NetworkProcessor;

import java.util.Map;

/**
 * @author Zhenhua on 2018/3/15.
 * @email zhshan@ctrip.com ^.^
 */

public class NetworkCacheManager implements IProcess {
    private static NetworkCacheManager instance;
    private Type mType;

    public static NetworkCacheManager getInstance(Type type) {
        if (instance == null) {
            instance = new NetworkCacheManager(type);
        }
        return instance;
    }

    public NetworkCacheManager(Type type) {
        mType = type;
    }

    @Override
    public void send(String url, Map<String, Object> params, ICallback callback) {
        switch (mType) {
            case net:
                mNetworkProcessor.send(url, params, callback);
                break;
            case cache:
                mCacheProcessor.send(url, params, callback);
                break;
            case both:
                mCacheProcessor.send(url, params, callback);
                mNetworkProcessor.send(url, params, callback);
                break;
        }
    }

    private CacheProcessor mCacheProcessor = new CacheProcessor();
    private NetworkProcessor mNetworkProcessor = new NetworkProcessor();
}