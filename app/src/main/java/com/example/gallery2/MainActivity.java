package com.example.gallery2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button grid,list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=findViewById(R.id.bt_grid);
        list=findViewById(R.id.bt_list);

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GrideIntent=new Intent(getApplicationContext(),Gridview.class);
                startActivity(GrideIntent);
            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListIntent=new Intent(getApplicationContext(),Listview.class);
                startActivity(ListIntent);
            }
        });
    }
}