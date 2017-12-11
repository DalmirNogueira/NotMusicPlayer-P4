package xyz.dnglabs.notmusicplayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Detail2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        doAll();
    }

    private void doAll(){

        View setPlay2 = (ImageView) findViewById(R.id.playing);
        setPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(Detail2Activity.this, MainActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay3 = (ImageView) findViewById(R.id.list);
        setPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(Detail2Activity.this, ListActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay = (ImageButton) findViewById(R.id.playBt);
        setPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("MyPref", "Nirvana");
                editor.putString("MyPref2", "Smeels Like Teen Spirit");
                editor.putString("MyPref3", "Nevermind");
                editor.apply();

                Intent listInt = new Intent(Detail2Activity.this, MainActivity.class);
                startActivity(listInt);
            }
        });
    }
}
