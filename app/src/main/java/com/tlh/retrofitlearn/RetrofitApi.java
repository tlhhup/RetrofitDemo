package com.tlh.retrofitlearn;

import java.io.File;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by hup on 2016/6/1.
 */
public interface RetrofitApi {

    @GET("/users/{user}/repos")
    List<Repo> listRepos(@Path("user") String user);//带返回值为同步方法 @Paht-->取请求路径中user的值作为参数

    @POST("/users/new")
    void createUser(@Body User user, Callback<User> cb);

    @FormUrlEncoded
    @POST("/user/edit")
    User updateUser(@Field("first_name") String first, @Field("last_name") String last);//@FormUrlEncoded修饰表单域，每个表单域子件key-value采用@Field修饰，@field表示key,实参表示value

    @Multipart
    @PUT("/user/photo")
    User updateUser(@Part("photo") File photo, @Part("description") String description);

    @Headers("Cache-Control: max-age=640000")
    @GET("/user/list")
    List<User> userList();

    @GET("/") @ResponseConvertorFactory.Xml
    Call<User> exampleXml();

}
