package com.mattblang.whatupandy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    ArrayList<String> ingredients;
    ArrayAdapter<String> adapter;

    EditText nameEntry;
    //EditText cost;
    Button addButton;
    ListView listView;
    TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        message = (TextView)findViewById(R.id.message);
        addButton = (Button)findViewById(R.id.add);
        nameEntry = (EditText)findViewById(R.id.nameEntry);
        //cost = (EditText)findViewById(R.id.cost);

        addButton.setOnClickListener(this);

        ingredients = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                ingredients);
        listView.setAdapter(adapter);

        this.setTitle(R.string.hello_world);

    }

    //duh

    public void onClick(View view){
        addItems(nameEntry.getText().toString());

        // http://stackoverflow.com/a/1109108/1747491
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    protected void addItems(String item){

        if (item.length()>0){
            adapter.add(item);
            adapter.notifyDataSetChanged();
            nameEntry.setText("");
        }


    }


    @Override
    protected void onPause(){
        super.onPause();
        this.setTitle("Hey we resumed");
    }

}
