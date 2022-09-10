package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {
    EditText name,body,date,followers,following,post;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.Main2_et_name);
        body = findViewById(R.id.Main2_et_body);
        date = findViewById(R.id.Main2_et_date);
        followers = findViewById(R.id.Main2_et_followers);
        following = findViewById(R.id.Main2_et_following);
        post = findViewById(R.id.Main2_et_post);
        add = findViewById(R.id.Main2_btn_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Post p = new Post(name.getText().toString(),body.getText().toString(),
                        date.getText().toString(),Integer.parseInt(followers.getText().toString()),
                        Integer.parseInt(following.getText().toString()),Integer.parseInt(post.getText().toString()));
                Intent i = new Intent();
                i.putExtra("data",p);
                setResult(2,i);
                finish();
            }
        });
    }
}