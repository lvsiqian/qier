package com.example.x_b.net;

import com.example.x_b.Bean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface Apiservice {
    String Basurl="https://www.wanandroid.com/project/list/1/";
    @GET("json?cid=294")
    Flowable<Bean> getdta();
}
