package xyz.dnglabs.notmusicplayer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doaALL();
    }

    private void doaALL(){
        SharedPreferences pref = getSharedPreferences("MyPref", MODE_PRIVATE);
        String setArtist = pref.getString("MyPref", "");
        String setSong = pref.getString("MyPref2", "");
        String setAlbum = pref.getString("MyPref3", "");
        TextView result1 = (TextView) findViewById(R.id.artistView);
        result1.setText(setArtist);
        TextView result2 = (TextView) findViewById(R.id.songView);
        result2.setText(setSong);
        ImageView coverAlbum = (ImageView) findViewById(R.id.imageView);
        String artist1 = "Ten";
        String artist2 = "Nevermind";
        if(setAlbum.equals(artist1))
            coverAlbum.setImageResource(R.drawable.album1);
        else if(setAlbum.equals(artist2))
            coverAlbum.setImageResource(R.drawable.album2);
        else
            coverAlbum.setImageResource(0);

        pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("MyPref", "");
        editor.putString("MyPref2", "");
        editor.putString("MyPref3", "");
        editor.apply();

        View library = (Button) findViewById(R.id.gotolibrary);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(MainActivity.this, ListActivity.class);
                startActivity(listInt);
            }
        });
    }

}
