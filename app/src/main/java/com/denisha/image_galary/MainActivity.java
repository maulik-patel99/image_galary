package com.denisha.image_galary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.MultiDex;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView image1,image2,image3;
ImageView dimage1,dimage2,dimage3;

Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.first);
        image2=findViewById(R.id.second);
        image3=findViewById(R.id.third);
        //initi();
      //  dialog=new Dialog(getApplicationContext(),R.style.DialogTheme1);
        //dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //dialog.setContentView(R.layout.dialog);
        //dialog.setCancelable(true);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         //       dialog.show();
             //   dimage1=dialog.findViewById(R.id.image1);
                Intent i=new Intent(getApplicationContext(),first.class);
                startActivity(i);
               // Toast.makeText(getApplicationContext(),"sssss",Toast.LENGTH_LONG).show();
              //  dimage1.setImageResource(R.drawable.ac);

            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),second.class);
                startActivity(i);

            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),third.class);
                startActivity(i);

            }
        });

    }

    private void initi() {
    image1=findViewById(R.id.first);
    image1=findViewById(R.id.second);
    image1=findViewById(R.id.third);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        MultiDex.install(getApplicationContext());
    }
}
