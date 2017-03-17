package com.shinhan.linearlayoutexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickbtn(View v){
        Button button = (Button)findViewById(R.id.click);
        Intent intent = new Intent(this,SubActivity.class);
        startActivity(intent);
    }


}
