package com.tlh.retrofitlearn;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hup on 2016/6/1.
 */
public interface RetrofitApi {

    @GET("info/show/{id}")
    Call<News> getNewsDetail(@Path("id") int id);//定义了请求的一种模式

}
