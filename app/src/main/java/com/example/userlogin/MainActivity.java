package com.example.userlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.optionmenu, menu);
         return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, Menu1.class));
        } else if (item.getItemId() == R.id.menu2) {
            startActivity(new Intent(this, menu2.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, menu3.class));
        }
        return true;
    }
}
