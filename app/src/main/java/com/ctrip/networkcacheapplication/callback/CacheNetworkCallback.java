package com.ctrip.networkcacheapplication.callback;

import org.jetbrains.annotations.NotNull;

/**
 * @author Zhenhua on 2018/3/16.
 * @email zhshan@ctrip.com ^.^
 */

public abstract class CacheNetworkCallback implements ICallback {
    @Override
    public void onSuccessCall(@NotNull String result, boolean fromNetwork) {
        onSuccess(result, fromNetwork);
    }

    @Override
    public void onFailureCall(@NotNull String e, boolean fromNetwork) {
        onFailure(e, fromNetwork);
    }

    public abstract void onSuccess(@NotNull String result, boolean fromNetwork);

    public abstract void onFailure(@NotNull String e, boolean fromNetwork);
}
