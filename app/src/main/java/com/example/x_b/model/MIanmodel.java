package com.example.x_b.model;

import com.example.x_b.Bean;
import com.example.x_b.ResultCallback;
import com.example.x_b.net.Apiservice;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MIanmodel {
    public void getdtaa(ResultCallback<Bean> beanResultCallback) {
        ResourceSubscriber<Bean> resourceSubscriber = new Retrofit.Builder()
                .baseUrl(Apiservice.Basurl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Apiservice.class)
                .getdta()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new ResourceSubscriber<Bean>() {
                    @Override
                    public void onNext(Bean bean) {
                        beanResultCallback.onsuccess(bean);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
