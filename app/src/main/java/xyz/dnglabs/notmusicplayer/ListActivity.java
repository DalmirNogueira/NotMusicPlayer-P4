package xyz.dnglabs.notmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        doALL();
    }


    private void doALL () {

        View setPlay2 = (ImageView) findViewById(R.id.playing);
        setPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(ListActivity.this, MainActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay3 = (ImageView) findViewById(R.id.list);
        setPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(ListActivity.this, MainActivity.class);
                startActivity(listInt);
            }
        });

        View choice1 = (RelativeLayout) findViewById(R.id.option1);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(ListActivity.this, DeatilActivity.class);
                startActivity(listInt);
            }
        });

        View choice2 = (RelativeLayout) findViewById(R.id.option2);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                Intent listInt2 = new Intent(ListActivity.this, Detail2Activity.class);
                startActivity(listInt2);
            }
        });

        View choice3 = (RelativeLayout) findViewById(R.id.option3);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt3 = new Intent(ListActivity.this, PaymentActivity.class);
                startActivity(listInt3);
            }
        });

    }
}
