package mani.lollipopexperiment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by maniselvaraj on 29/11/14.
 */
public class ToolBarDarkActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("ToolbarDark");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // You must be expecting setting title to toolbar will reflect the title on actionbar.
        // But it doesnot. Once you call setSupportActionBar(Toolbar), the Action Bar is then
        // responsible for handling the title, so you need to call
        // getSupportActionBar().setTitle(...) to set a custom title.
        // This will work if your theme had explicitly said NoActionBar.
        // Theme.AppCompat.Light.NoActionBar

        // toolBar.setTitle("ToolbarLight");

        ((TextView)findViewById(R.id.themeText)).setText("Theme.AppCompat");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}