package com.example.hw12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       this.setContentView(R.layout.activity_main);

    }
    public void onButtonClickedFname(View v)
    {
        TextView Fname = this.findViewById(R.id.Fname);
        Fname.setText("Marcus");

    }
    public void onButtonClickedLname(View v) {

        TextView Lname = this.findViewById(R.id.Lname);
        Lname.setText("Herwig");
    }
    public void onButtonClickedReset(View m)
    {
        TextView Fname = this.findViewById(R.id.Fname);
        Fname.setText("First Name");
        TextView Lname = this.findViewById(R.id.Lname);
        Lname.setText("Last Name");
    }
}