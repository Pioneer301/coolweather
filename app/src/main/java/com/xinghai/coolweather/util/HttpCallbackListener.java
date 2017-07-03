package com.xinghai.coolweather.util;


public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
