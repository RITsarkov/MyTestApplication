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


    //todo: ��������
    private void generatUserList(){
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(100F));
    }


}
