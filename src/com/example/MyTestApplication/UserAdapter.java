package com.example.MyTestApplication;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
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
    private int newSelectedUserId = 0;

    UserAdapter(Context context){
        mContext = context;
    }

    public void setSelectedUser(int position){
        if (newSelectedUserId != position) {
            newSelectedUserId = position;
            notifyDataSetChanged();
        }
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

        //Отрисовывать выбранного пользователя другим цветом
        markSelectedUser(userRow, position);
        return userRow;
    }

    private void markSelectedUser(final View userRow, int position){
        if (position == newSelectedUserId){
        // Цвет и так можно получать: Color.parseColor("#FF0000");
            userRow.setBackgroundResource(R.drawable.new_state);
        }
        else
        // Это прозрачный бекграунд.
            userRow.setBackgroundColor(0x00000000);
    }


    //todo  это пока для эксперимента с анимацией
    private void animationForSelectedUser(final View userRow){
        ValueAnimator anim = ValueAnimator.ofInt(Color.parseColor("#000000"), Color.parseColor("#FF0000"));
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                userRow.setBackgroundColor((Integer) animation.getAnimatedValue());
            }
        });
        anim.setDuration(1000);
    }


}
