package com.example.community_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.community_world.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void welcome(View view) {
        EditText editText = findViewById(R.id.editText);
        String name = editText.getText().toString();
        Intent intent = new Intent(this,welcome_monsters.class);
        intent.putExtra(EXTRA_TEXT,name);
        startActivity(intent);
    }
}
