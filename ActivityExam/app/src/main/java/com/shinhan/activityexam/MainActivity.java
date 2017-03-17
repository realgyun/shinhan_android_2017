package com.shinhan.activityexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.btn);

    }

    public void btnclick(View v){

        EditText editText = (EditText)findViewById(R.id.text);
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("String",editText.getText().toString());
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode != 0 ){
            if(resultCode == RESULT_OK){ //subActivity가 죽었으면..
                String result = data.getStringExtra("result");
                Toast.makeText(this,result,Toast.LENGTH_LONG).show();
            }
        }
    }
}
