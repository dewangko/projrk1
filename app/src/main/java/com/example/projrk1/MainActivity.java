package com.example.projrk1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.Text1p);
    }

    public void showToast(View view) {
        Toast.makeText(this, "hallo", Toast.LENGTH_SHORT).show();

    }

    public void countUp(View view) {
        count++;
        textView.setText(count+"");
    }
}