package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // todo 添加api
    @FormUrlEncoded
    @POST("user/register")
    Call<UserResponse> register(@Field("username") String u,
                                @Field("password") String p,
                                @Field("repassword") String rep);
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword

}
