package com.example.facebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adptar extends BaseAdapter {
    Context context;
    ArrayList <Post> data;
    int resources;
    public Adptar(Context context, ArrayList<Post> data, int resources) {
        this.context = context;
        this.data = data;
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Post getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void setitem(Post p){
        data.add(p);
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View test = view;
        if(test == null)
        {
            test = LayoutInflater.from(context).inflate(resources,null,false);
        }
        TextView name,date,body,followers,follwing,post;
        name = test.findViewById(R.id.Main3_tv_name);
        date = test.findViewById(R.id.Main3_tv_date);
        body = test.findViewById(R.id.Main3_tv_body);
        followers = test.findViewById(R.id.Main3_tv_nfollowers);
        follwing = test.findViewById(R.id.Main3_tv_nfollowing);
        post = test.findViewById(R.id.Main3_tv_npost);
        name.setText(data.get(i).getName());
        date.setText(data.get(i).getDate());
        body.setText(data.get(i).getBody());
        followers.setText(data.get(i).getFollowers()+"");
        follwing.setText(data.get(i).getFollowing()+"");
        post.setText(data.get(i).getPost()+"");
        return test;
    }
}
