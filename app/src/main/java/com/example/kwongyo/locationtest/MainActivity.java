package com.example.kwongyo.locationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.latituteField)
    TextView latituteField;
    @Bind(R.id.longitudeField)
    TextView longitudeField;

    private GpsInfo gps;



    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
    @OnClick(R.id.btn)
    public void click(View v) {
        gps = new GpsInfo(MainActivity.this);
        // GPS 사용유무 가져오기
        if (gps.isGetLocation()) {

            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();

            latituteField.setText(String.valueOf(latitude));
            longitudeField.setText(String.valueOf(longitude));

            Toast.makeText(
                    getApplicationContext(),
                    "당신의 위치 - \n위도: " + latitude + "\n경도: " + longitude,
                    Toast.LENGTH_LONG).show();
        } else {
            // GPS 를 사용할수 없으므로
            gps.showSettingsAlert();
        }

    }

}
