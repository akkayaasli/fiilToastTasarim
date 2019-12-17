package com.example.fiiltoasttasarim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    custom_toast toast,toast2,toast3;

    Context context=this;
    Context context2=this;
    Context context3=this;

    Button btnCustom,btnCustom2,btnCustom3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCustom=findViewById(R.id.btnCustom);
        btnCustom2=findViewById(R.id.btnCustom2);
        btnCustom3=findViewById(R.id.btnCustom3);

        btnCustom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                toast=new custom_toast(context);
                toast.Show(custom_toast.right,"SAĞ TARAF");

            }
        });
        btnCustom2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                toast2=new custom_toast(context2);
                toast2.Show(custom_toast.left,"SOL TARAF");
            }
        });

        btnCustom3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                toast3=new custom_toast(context3);
                toast3.Show(custom_toast.up,"YUKARI YÖN");
            }
        });


        //Toast.makeText(this,"Bu Bir Deneme...",Toast.LENGTH_SHORT).show();


        //CustomToast Tasarımı
        //custom_toast.xml den kullanacağız..

      /*  LayoutInflater customToast=LayoutInflater.from(this);
        View customToastLayout=customToast.inflate(R.layout.custom_toast,null);*///herhangi bir view grubu olmadığı için ikinci parametre null atadık.

        //custom toast içindeki image nesnesini yüklemek için
       /* ImageView image=customToastLayout.findViewById(R.id.image);//burada AMAÇ doğrudan ayrıca oluşturduğumuz layout içinde git ve orada bu imageview i ara diyoruz.
        image.setImageResource(R.mipmap.ic_launcher);*///setImageResource komutu ile buna resim atayabiliyoruz.*


        //textView kullanımı için
        /*TextView text=customToastLayout.findViewById(R.id.text);
        text.setText("Directions");*/

        //CustomToast mesajını hazırlayalım
       /* Toast custom_toast=new Toast(this);
        custom_toast.setGravity(Gravity.CENTER_VERTICAL,0,0);//CUSTOM TOAST ı bu şekilde istediğimiz yerde oluşturabiliriz.
        custom_toast.setDuration(custom_toast.LENGTH_LONG);//custom toast ın ekranda kalma süresi.
        custom_toast.setView(customToastLayout);//bu mesaj ın göstermek istediği layout bu olacak.
        custom_toast.show();*/

    }

}
