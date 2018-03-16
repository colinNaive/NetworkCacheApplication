package com.ctrip.networkcacheapplication.callback

/**
 * @author Zhenhua on 2018/3/15.
 * @email zhshan@ctrip.com ^.^
 */
interface ICallback {
    fun onSuccessCall(result: String, fromNetwork: Boolean)
    fun onFailureCall(e: String, fromNetwork: Boolean)
}