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
        userListView = (ListView) findViewById(R.id.user_list);

        uAdaper = new UserAdapter(getApplicationContext());
        userListView.setAdapter(uAdaper);
        generatUserList();
    }

    //todo: заглушка
    private void generatUserList(){
        uAdaper.addUser(new User("Вася").setMoney(100F));
        uAdaper.addUser(new User("Петя").setMoney(50F));
        uAdaper.addUser(new User("Катя").setMoney(0F));
        uAdaper.addUser(new User("Маша").setMoney(300F));
        uAdaper.addUser(new User("Толя").setMoney(0F));
        uAdaper.addUser(new User("Рома").setMoney(20F));
//        uAdaper.addUser(new User("Олег").setMoney(40F));
    }


}
