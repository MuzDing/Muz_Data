package com.example.ManagerBean;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.Bean.User;

/**
 * Created by muz on 17-10-11.
 */

public class UserManager {

    public boolean Jduge(Activity activity, User user){

        SharedPreferences sf;
        sf=activity.getSharedPreferences("res",Context.MODE_PRIVATE);
        String a=sf.getString("id","");
        String b=sf.getString("pwd","");

        boolean bool=true;
        if(a.equals(user.getNum()) && b.equals(user.getPassword())){

        }else{
            bool=false;
        }
        return bool;


    }
}
