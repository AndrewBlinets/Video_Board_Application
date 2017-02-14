package by.andrew.blinets.video_board;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Андрей on 10.02.2017.
 */

public class Registration_activity extends Activity {

   private static final int LAYOUT = R.layout.registation_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
    }
}
