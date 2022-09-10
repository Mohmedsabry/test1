package com.example.facebook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add;
    ListView list;
    Adptar adptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.Main_btn_Add);
        list = findViewById(R.id.Main_lv_List);
        ArrayList<Post>arr = new ArrayList<>();
         adptar = new Adptar(this,arr,R.layout.activity_main3);
        list.setAdapter(adptar);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),MainActivity2.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1)
        {

           adptar.setitem( (Post) data.getSerializableExtra("data"));
           adptar.notifyDataSetChanged();
        }
    }
}