package com.example.gallery2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class Listview extends Activity {
    ListView nation;
    int houp_nation []={R.drawable.lao,R.drawable.cambodia,R.drawable.china
            ,R.drawable.france,R.drawable.japan,R.drawable.korea,R.drawable.myanmar
            ,R.drawable.thai,R.drawable.usa,R.drawable.viet,R.drawable.island,R.drawable.england};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_listview);
        nation=findViewById(R.id.list_pic);
        nationAdapter MyAdapter=new nationAdapter(getApplicationContext(),houp_nation);
        nation.setAdapter(MyAdapter);

        nation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fullIntent =new Intent(getApplicationContext(),Fullview.class);
                fullIntent.putExtra("position",i);
                startActivity(fullIntent);
            }
        });
    }
}
