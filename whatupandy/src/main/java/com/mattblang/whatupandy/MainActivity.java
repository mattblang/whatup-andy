package com.mattblang.whatupandy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher);
        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.drawable.ic_launcher);


        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView message = (TextView)findViewById(R.id.message);
                message.setText("You picked button 1!!");
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView message = (TextView)findViewById(R.id.message);
                message.setText("You picked button 2... :-(");
            }
        });

        this.setTitle(R.string.hello_world);


    }

    @Override
    protected void onPause(){
        super.onPause();
        this.setTitle("Hey we resumed");
    }

}
