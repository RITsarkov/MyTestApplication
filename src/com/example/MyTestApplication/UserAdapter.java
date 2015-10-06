package com.example.MyTestApplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.MyTestApplication.DataObj.User;

import java.util.ArrayList;
import java.util.List;


public class UserAdapter extends BaseAdapter {
//public class UserAdapter extends ArrayAdapter {

    private final Context mContext;
    List<User> userList = new ArrayList<>();

    UserAdapter(Context context){
        mContext = context;
    }

    public void addUser(User user){
        userList.add(user);
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View userRow = convertView;
        User user = userList.get(position);
        if (userRow == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            userRow = inflater.inflate(R.layout.user, parent, false);
        }

        //set user name in view
        TextView userName  = (TextView) userRow.findViewById(R.id.user_name);
        userName.setText(user.getUserName());

        //set user money
        TextView userMoney  = (TextView) userRow.findViewById(R.id.user_money);
        userMoney.setText(user.getMoney().toString());

        return userRow;
    }
}
