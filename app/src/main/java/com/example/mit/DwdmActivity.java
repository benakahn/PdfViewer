package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DwdmActivity extends AppCompatActivity {
    PDFView dwdm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwdm);
        dwdm=(PDFView) findViewById(R.id.dwdm);
        dwdm.fromAsset("dwdm.pdf").load();
    }
}