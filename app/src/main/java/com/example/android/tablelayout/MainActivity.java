package com.example.android.tablelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiate a button
        Button loginButton = (Button) findViewById(R.id.loginBtn);
        // perform click event on the button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Table layoutView from salah elsayed", Toast.LENGTH_LONG).show();  // display a toast message
            }
        });



    }
    private void testUpLoad(){
        int i = 1 + 1;
    }

}
