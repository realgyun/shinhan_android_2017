package com.shinhan.mobileacademy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"button click",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onButton1Clicked(View v){
        String name = editText.getText().toString();

        Intent intent = new Intent(this,MyService.class);
        intent.putExtra("command","shiw");
        intent.putExtra("name",name);
        startService(intent);

    }

    public void onButtonClicked2(View v){
        Toast.makeText(MainActivity.this,"22@",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("hhtp://m.shinhan.com"));
        startActivity(intent);
    }

    public void onButtonClicked3(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-4444-4444"));
        startActivity(intent);
    }

}
