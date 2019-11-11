package com.example.androidhw14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button phonebtn=(Button)findViewById(R.id.phone);
        phonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);//也可以   Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:0986347652")); 這樣的話就不用下面那行了
                intent.setData(Uri.parse("tel:0900064037"));
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });
    }
}
