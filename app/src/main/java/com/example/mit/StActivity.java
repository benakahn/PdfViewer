package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class StActivity extends AppCompatActivity {
    PDFView st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);
        st=(PDFView) findViewById(R.id.st);
        st.fromAsset("st.pdf").load();
    }
}