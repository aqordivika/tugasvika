package com.example.vika.tugasvika;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String no_telp = "088812312388";
    String email = "aqordivika@yahoo.co.id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Email(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","aqordivika@yahoo.co.id", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Judul Email");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    public void Alamat(View view) {
        Uri uri = Uri.parse("https://maps.google.com/?q=-6.9810849,110.4083342");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void Telepon(View view) {
        Intent intentIndirect = new Intent(Intent.ACTION_DIAL);
        intentIndirect.setData(Uri.parse("tel:" +no_telp));
        startActivity(intentIndirect);
    }
}
