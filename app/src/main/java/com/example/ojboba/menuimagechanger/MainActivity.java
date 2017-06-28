package com.example.ojboba.menuimagechanger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean maybe = true;
    View mainView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainView = findViewById(R.id.activity_main);
        text = (TextView)findViewById(R.id.textColor);
        mainView.setBackgroundResource(R.color.colorPrimaryDark);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuImage:
                if (maybe == true ){
                    Toast.makeText(this, "U CHiCKEN?", Toast.LENGTH_SHORT).show();
                    item.setIcon(R.drawable.chicken);
                    mainView.setBackgroundResource(R.color.colorAccent);
                    text.setBackgroundResource(R.color.colorAccent);
                    maybe = false;
                } else{
                    Toast.makeText(this, "OINK OINK", Toast.LENGTH_SHORT).show();
                    item.setIcon(R.drawable.pig);
                    mainView.setBackgroundResource(R.color.colorPrimary);
                    text.setBackgroundResource(R.color.colorPrimary);
                    maybe = true;
                }

                return true;
        }
        return true;
    }

}
