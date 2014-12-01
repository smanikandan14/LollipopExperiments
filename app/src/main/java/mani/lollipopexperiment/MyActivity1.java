package mani.lollipopexperiment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by maniselvaraj on 29/11/14.
 */
public class MyActivity1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2);
        getWindow().setStatusBarColor(Color.BLUE);
    }
}
