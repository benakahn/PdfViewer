package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CncActivity extends AppCompatActivity {
    PDFView cnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnc);
        cnc=(PDFView) findViewById(R.id.cnc);
        cnc.fromAsset("cnc.pdf").load();
    }
}