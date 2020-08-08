package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PyActivity extends AppCompatActivity {
    PDFView py;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_py);
        py=(PDFView) findViewById(R.id.py);
        py.fromAsset("py.pdf").load();
    }
}