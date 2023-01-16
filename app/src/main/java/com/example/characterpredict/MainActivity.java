package com.example.characterpredict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    String[] months;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview);
        months=new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthadap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,months);

        lv.setAdapter(monthadap);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int currentMonth;
        currentMonth = i;
        switch(currentMonth) {
            case 0:
                Toast.makeText(this,"People Born In January Are Bold And Alert", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "People Born In February Are Lucky And Loyal", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this,"People Born In March Are Naughty and Genius", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "People Born In April Are Caring And Strong", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "People Born In May Are Loving And Practical", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "People Born In June Are Romantic And Curious", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this,  "People Born In July Are Adventurous And Honest", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this, "People Born In August Are Active And HardWorking", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(this, "People Born In September Are Sensitive And Pretty", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(this, "People Born In October Are Stylish And Friendly", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                Toast.makeText(this, "People Born In November Are Nice And Creative", Toast.LENGTH_SHORT).show();
                break;
            case 11:
                Toast.makeText(this, "People Born In December Are Confident And Freedom loving", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}