package by.andrew.blinets.video_board;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity implements View.OnClickListener {

    private static final int LAYOUT = R.layout.activity_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
    }

    @Override
    public void onClick(View v) {
        //file.writeFile( "ScanActivity   onClick");
        switch (v.getId()) {
            case R.id.button_enter:

                Intent Intent_enteractivity = new Intent(this, Activity_main.class);
                this.startActivity(Intent_enteractivity);

                break;

            case R.id.textview_registration:

                Intent Intent_registrationactivity = new Intent(this, Registration_activity.class);
                this.startActivity(Intent_registrationactivity);

                break;

            default:
                break;
        }
    }
}
