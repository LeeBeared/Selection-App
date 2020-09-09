package com.example.pokem.barrineau_exam3;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] app_topics = {"Persistent","Animation","Music"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.app_list, app_topics));
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch(position) {
            case 0:
                startActivity(new Intent(MainActivity.this, PersistentActivity.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, AnimationtActivity.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, MusicActivity.class));
                break;

        }

    }
}
