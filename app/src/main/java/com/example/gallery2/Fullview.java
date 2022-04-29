package com.example.gallery2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

public class Fullview extends Activity {
    ImageView full_img;
    int houp_nation []={R.drawable.lao,R.drawable.cambodia,R.drawable.china
            ,R.drawable.france,R.drawable.japan,R.drawable.korea,R.drawable.myanmar
            ,R.drawable.thai,R.drawable.usa,R.drawable.viet,R.drawable.island,R.drawable.england};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fullview);
        full_img=findViewById(R.id.naotion_full);
        nationAdapter MyAdapter = new nationAdapter(getApplicationContext(),houp_nation);
        Intent MyFull =getIntent();
        int position=MyFull.getExtras().getInt("position");
        full_img.setImageResource(MyAdapter.nation[position]);

    }
}
