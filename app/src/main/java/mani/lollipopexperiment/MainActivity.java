package mani.lollipopexperiment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by maniselvaraj on 29/11/14.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView demoListView = (ListView) findViewById(R.id.demoListView);

        String[] demoItems = getResources().getStringArray(R.array.demo_items);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, demoItems);
        demoListView.setAdapter(arrayAdapter);
        demoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                handleListViewClick(position);
            }
        });

    }

    private void handleListViewClick(int position) {

        switch(position) {
            case 0:
                startActivity(new Intent(MainActivity.this, ToolBarLightActivity.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, ToolBarLightDarkActivity.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, ToolBarDarkActivity.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, MyActivity.class));
                break;
        }
    }
}