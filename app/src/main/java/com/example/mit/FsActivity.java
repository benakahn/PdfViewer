package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FsActivity extends AppCompatActivity {
PDFView fs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fs);
        fs=(PDFView) findViewById(R.id.fs);
        fs.fromAsset("fs.pdf").load();
    }
}