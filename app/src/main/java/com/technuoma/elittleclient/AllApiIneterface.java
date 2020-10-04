package com.technuoma.elittleclient;


import com.technuoma.elittleclient.loginPOJO.loginBean;
import com.technuoma.elittleclient.orderDetailsPOJO.orderDetailsBean;
import com.technuoma.elittleclient.orders1POJO.orders1Bean;
import com.technuoma.elittleclient.ordersPOJO.ordersBean;

import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface AllApiIneterface {

    @Multipart
    @POST("elittleplanet/api/login2.php")
    Call<loginBean> login(
            @Part("username") String username,
            @Part("password") String password,
            @Part("token") String token
    );

    @Multipart
    @POST("elittleplanet/api/getOrders1.php")
    Call<orders1Bean> getOrders1(
            @Part("sid") String sid,
            @Part("date") String date
    );

    @Multipart
    @POST("elittleplanet/api/getOrders2.php")
    Call<orders1Bean> getOrders2(
            @Part("sid") String sid,
            @Part("date") String date
    );

    @Multipart
    @POST("elittleplanet/api/getOrders3.php")
    Call<ordersBean> getOrders(
            @Part("date") String date
    );

    @Multipart
    @POST("elittleplanet/api/getOrders4.php")
    Call<ordersBean> getOrders4(
            @Part("date") String date
    );

    @Multipart
    @POST("elittleplanet/api/getOrderDetails.php")
    Call<orderDetailsBean> getOrderDetails(
            @Part("order_id") String order_id
    );

    //@GET("elittleplanet/api/getHome.php")
    //Call<homeBean> getHome();

    /*@Multipart
    @POST("elittleplanet/api/getSubCat1.php")
    Call<subCat1Bean> getSubCat1(
            @Part("cat") String cat
    );

    @Multipart
    @POST("elittleplanet/api/getSubCat2.php")
    Call<subCat1Bean> getSubCat2(
            @Part("subcat1") String cat
    );

    @Multipart
    @POST("elittleplanet/api/getProducts.php")
    Call<productsBean> getProducts(
            @Part("subcat2") String cat
    );

    @Multipart
    @POST("elittleplanet/api/getProductById.php")
    Call<singleProductBean> getProductById(
            @Part("id") String cat
    );

    @Multipart
    @POST("elittleplanet/api/search.php")
    Call<searchBean> search(
            @Part("query") String query
    );

    @Multipart
    @POST("elittleplanet/api/login.php")
    Call<loginBean> login(
            @Part("phone") String phone,
            @Part("token") String token
    );

    @Multipart
    @POST("elittleplanet/api/verify.php")
    Call<loginBean> verify(
            @Part("phone") String phone,
            @Part("otp") String otp
    );

    @Multipart
    @POST("elittleplanet/api/addCart.php")
    Call<singleProductBean> addCart(
            @Part("user_id") String user_id,
            @Part("product_id") String product_id,
            @Part("quantity") String quantity,
            @Part("unit_price") String unit_price
    );

    @Multipart
    @POST("elittleplanet/api/updateCart.php")
    Call<singleProductBean> updateCart(
            @Part("id") String id,
            @Part("quantity") String quantity,
            @Part("unit_price") String unit_price
    );

    @Multipart
    @POST("elittleplanet/api/deleteCart.php")
    Call<singleProductBean> deleteCart(
            @Part("id") String id
    );

    @Multipart
    @POST("elittleplanet/api/clearCart.php")
    Call<singleProductBean> clearCart(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("elittleplanet/api/getOrderDetails.php")
    Call<orderDetailsBean> getOrderDetails(
            @Part("order_id") String order_id
    );

    @Multipart
    @POST("elittleplanet/api/getCart.php")
    Call<cartBean> getCart(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("elittleplanet/api/getOrders.php")
    Call<ordersBean> getOrders(
            @Part("user_id") String user_id
    );

    @Multipart
    @POST("elittleplanet/api/buyVouchers.php")
    Call<checkoutBean> buyVouchers(
            @Part("user_id") String user_id,
            @Part("amount") String amount,
            @Part("txn") String txn,
            @Part("name") String name,
            @Part("address") String address,
            @Part("pay_mode") String pay_mode,
            @Part("slot") String slot
    );*/
}
