package com.ctrip.networkcacheapplication.processor;

import com.ctrip.networkcacheapplication.callback.ICallback;

import java.util.Map;

/**
 * @author Zhenhua on 2018/3/15.
 * @email zhshan@ctrip.com ^.^
 */

public interface IProcess {
    void send(String url, Map<String, Object> params, ICallback callback);
}
