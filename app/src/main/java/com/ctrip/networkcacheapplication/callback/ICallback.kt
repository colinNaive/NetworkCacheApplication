package com.ctrip.networkcacheapplication.callback

/**
 * @author Zhenhua on 2018/3/15.
 * @email zhshan@ctrip.com ^.^
 */
interface ICallback {
    fun onSuccess(result: String, fromNetwork: Boolean)
    fun onFailure(e: String, fromNetwork: Boolean)
}