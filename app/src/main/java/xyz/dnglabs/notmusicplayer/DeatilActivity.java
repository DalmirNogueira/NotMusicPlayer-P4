package xyz.dnglabs.notmusicplayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DeatilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil);
        doAll();
    }

    private void doAll(){

        View setPlay2 = (ImageView) findViewById(R.id.playing);
        setPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(DeatilActivity.this, MainActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay3 = (ImageView) findViewById(R.id.list);
        setPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(DeatilActivity.this, ListActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay = (ImageButton) findViewById(R.id.playBt);
        setPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("MyPref", "Pearl Jam");
                editor.putString("MyPref2", "Even Flow");
                editor.putString("MyPref3", "Ten");
                editor.apply();

                Intent listInt = new Intent(DeatilActivity.this, MainActivity.class);
                startActivity(listInt);
            }
        });
    }
}


