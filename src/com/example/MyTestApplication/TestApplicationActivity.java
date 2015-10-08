package com.example.MyTestApplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        userListView.setOnItemClickListener(selectUserOnItemClickListener);

        generatUserList();
    }

    AdapterView.OnItemClickListener selectUserOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            uAdaper.setSelectedUser(position);
        }
    };

    //todo: ��������
    private void generatUserList(){
        uAdaper.addUser(new User("����").setMoney(100F));
        uAdaper.addUser(new User("����").setMoney(50F));
        uAdaper.addUser(new User("����").setMoney(0F));
        uAdaper.addUser(new User("����").setMoney(300F));
        uAdaper.addUser(new User("����").setMoney(0F));
        uAdaper.addUser(new User("����").setMoney(20F));
//        uAdaper.addUser(new User("����").setMoney(40F));
    }


}
