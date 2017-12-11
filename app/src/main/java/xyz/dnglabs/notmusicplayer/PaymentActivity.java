package xyz.dnglabs.notmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        doAll();
    }

    private void doAll(){
        View setPlay2 = (ImageView) findViewById(R.id.playing);
        setPlay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(listInt);
            }
        });

        View setPlay3 = (ImageView) findViewById(R.id.list);
        setPlay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listInt = new Intent(PaymentActivity.this, ListActivity.class);
                startActivity(listInt);
            }
        });
    }
}
