package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList listLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idListView);

        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Lập Trình Java"));
        listLanguage.add(new Language(2, "Lập Trình Android"));
        listLanguage.add(new Language(3, "Lập Trình JavaFX"));

        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_list_view, listLanguage);
        listView.setAdapter(adapter);
    }
}