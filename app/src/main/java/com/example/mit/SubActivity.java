package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.bottom_navigation,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.nav_home:
                Intent i= new Intent(SubActivity.this,HomeActivity.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void next(View view){
        if(view.getId()==R.id.cnc){
            Intent i = new Intent(SubActivity.this,CncActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.fs){
            Intent i = new Intent(SubActivity.this,FsActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.st){
            Intent i = new Intent(SubActivity.this,StActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.os){
            Intent i = new Intent(SubActivity.this,OsActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.dwdm){
            Intent i = new Intent(SubActivity.this,DwdmActivity.class);
            startActivity(i);
        }
        if(view.getId()==R.id.py){
            Intent i = new Intent(SubActivity.this,PyActivity.class);
            startActivity(i);
        }
    }
}