package com.example.gallery2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Gridview extends AppCompatActivity {
    GridView houp;
    int houp_nation []={R.drawable.lao,R.drawable.cambodia,R.drawable.china
    ,R.drawable.france,R.drawable.japan,R.drawable.korea,R.drawable.myanmar
    ,R.drawable.thai,R.drawable.usa,R.drawable.viet,R.drawable.island,R.drawable.england};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_gridview2);
        houp = findViewById(R.id.grid_pic);
        nationAdapter myNationAdapter = new nationAdapter(getApplicationContext(),houp_nation);
        houp.setAdapter(myNationAdapter);

        houp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fullIntent =new Intent(getApplicationContext(),Fullview.class);
                fullIntent.putExtra("position",i);
                startActivity(fullIntent);
            }
        });
    }
}
