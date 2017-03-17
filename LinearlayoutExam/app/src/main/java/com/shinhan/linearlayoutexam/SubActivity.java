package com.shinhan.linearlayoutexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void onClickbtn1(View v){

        ImageView imageView1 = (ImageView)findViewById(R.id.img1);
        ImageView imageView2 = (ImageView)findViewById(R.id.img2);

        if(v.getId() == R.id.imgbtn1){
            imageView1.setBackgroundResource(R.drawable.shinhan);
        }
        if(v.getId() == R.id.imgbtn2){
            imageView2.setImageResource(R.drawable.shinhan);
        }
    }
}
