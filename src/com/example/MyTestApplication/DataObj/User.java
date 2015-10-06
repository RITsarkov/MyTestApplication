package com.example.MyTestApplication.DataObj;

/**
 * Created by Roman on 06.10.2015.
 */
public class User {
    public User(String userName){
        this.userName = userName;
    }

    private final String userName;
    private Float money;

//    public static User getNewUser(String userName){
//        User user = new User();
//        user.userName = userName;
//        return user;
//    }

//------- geters & setters -------------------------------------------------------------
    public String getUserName() {
        return userName;
    }
    public Float getMoney() {
        return money;
    }

    public User setMoney(Float money) {
        this.money = money;
        return this;
    }
}
