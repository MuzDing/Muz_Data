package com.example.muz.myapplication1;

/**
 * Created by muz on 17-9-20.
 */

public class User {
    private String num;
    private String password;
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean Jduge(){
        boolean bool=true;
        if(this.num.equals("admin")&&this.password.equals("admin")){

        }else{
            bool=false;
        }
        return bool;
    }
}
