package MyAPI;

import java.util.List;
import java.util.Map;

import model.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MyAPI {

    @GET("heroes")
    Call<List<User>> getUser();

    // 1. Using @object
    @POST("heroes")
    Call<Void> registerUser(@Body User user);

    // 2. Using @field
    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero(@Field("name") String name,@Field("desc") String desc);

    //3. Using @FieldMap
    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero2(@FieldMap Map<String,String> map);


}
