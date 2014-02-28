package com.mattblang.whatupandy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher);
        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.drawable.ic_launcher);


        this.setTitle(R.string.hello_world);

    }
    @Override
    protected void onPause(){
        super.onPause();
        this.setTitle("Hey we resumed");
    }
}
