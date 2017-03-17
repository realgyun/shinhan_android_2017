package com.shinhan.activityexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String eeee = intent.getStringExtra("String");

        EditText editText = (EditText)findViewById(R.id.text);
        editText.setText(eeee);
    }

    public void btnClick11(View view){
        Intent intent = new Intent();
        EditText editText = (EditText)findViewById(R.id.text);
        String result = editText.getText().toString();
        intent.putExtra("result",result);
        setResult(RESULT_OK,intent);
        finish();

    }
}
