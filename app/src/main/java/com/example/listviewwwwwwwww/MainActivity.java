package com.example.listviewwwwwwwww;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewwwwwwwww.R;

public class MainActivity extends AppCompatActivity {
    String[] city = {"اراک", "شیراز", "تهران", "اصفهان", "کرمان"};
    String []tel = new String[]{"086","025","021","031","061"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.listviewwwwwwwww.R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, city);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0)
                {
                    Toast.makeText(MainActivity.this, "086", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}