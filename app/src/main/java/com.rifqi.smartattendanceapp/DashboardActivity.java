package com.rifqi.smartattendanceapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DashboardActivity extends AppCompatActivity {

    Button btnMasuk, btnKeluar;
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Log.d("Lifecycle", "DashboardActivity - onCreate");

        btnMasuk = findViewById(R.id.btnMasuk);
        btnKeluar = findViewById(R.id.btnKeluar);
        tvStatus = findViewById(R.id.tvStatus);

        btnMasuk.setOnClickListener(v -> {
            String waktu = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
            tvStatus.setText("Absen Masuk: " + waktu);
        });

        btnKeluar.setOnClickListener(v -> {
            String waktu = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
            tvStatus.setText("Absen Keluar: " + waktu);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "DashboardActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "DashboardActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "DashboardActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "DashboardActivity - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "DashboardActivity - onDestroy");
    }
}
