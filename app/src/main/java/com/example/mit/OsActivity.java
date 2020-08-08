package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class OsActivity extends AppCompatActivity {
    PDFView os;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
        os=(PDFView) findViewById(R.id.os);
        os.fromAsset("os.pdf").load();
    }
}