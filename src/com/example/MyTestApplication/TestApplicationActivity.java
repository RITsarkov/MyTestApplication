package com.example.MyTestApplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.MyTestApplication.DataObj.User;

public class TestApplicationActivity extends Activity {

    UserAdapter uAdaper;
    ListView userListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        uAdaper = new UserAdapter(getApplicationContext());

        userListView = (ListView) findViewById(R.id.user_list);

        userListView.setAdapter(uAdaper);
        generatUserList();
    }


    //todo: заглушка
    private void generatUserList(){
        uAdaper.addUser(new User("Вася").setMoney(100F));
        uAdaper.addUser(new User("Петя").setMoney(100F));
        uAdaper.addUser(new User("Катя").setMoney(100F));
        uAdaper.addUser(new User("Маша").setMoney(100F));
        uAdaper.addUser(new User("Толя").setMoney(100F));
        uAdaper.addUser(new User("Рома").setMoney(100F));
        uAdaper.addUser(new User("Олег").setMoney(100F));
    }


}
