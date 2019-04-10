package com.desisuci.activitylifesycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // deklarasi komponen
    Button btnClose, btnStartActivity, btnOpenIg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisialisasi komponen
        btnClose = (Button) findViewById(R.id.btn_close);
        btnOpenIg = (Button) findViewById(R.id.btn_open_ig);
        btnStartActivity = (Button) findViewById(R.id.btn_start_activity);

        btnClose.setOnClickListener(this);
        btnStartActivity.setOnClickListener(this);
        btnOpenIg.setOnClickListener(this);

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start_activity:
                // buka activity browser
                Intent petaniKode = new Intent(Intent.ACTION_VIEW);
                petaniKode.setData(Uri.parse("http://petanikode.com"));
                startActivity(petaniKode);
                break;
            case R.id.btn_open_ig:
                // buka instagram
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse("http://www.instagram.com"));
                startActivity(instagram);
                break;
            case R.id.btn_close:
                finish();
                break;
        }
    }
}
