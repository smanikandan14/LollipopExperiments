package mani.lollipopexperiment;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageButton;

/**
 * Created by maniselvaraj on 1/12/14.
 */
public class RippleExampleActivity extends ActionBarActivity {

    ImageButton fabButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_example);

        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Ripple Examples");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fabButton = (ImageButton) findViewById(R.id.floatingButton1);
        setOutLineProvider();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setOutLineProvider() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            fabButton.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    int diameter = getResources().getDimensionPixelSize(R.dimen.fab_height);
                    outline.setOval(0,0,diameter,diameter);
                }
            });
            fabButton.setClipToOutline(true);
        }
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