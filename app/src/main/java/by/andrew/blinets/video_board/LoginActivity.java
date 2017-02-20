package by.andrew.blinets.video_board;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends Activity implements View.OnClickListener {

    private static final int LAYOUT = R.layout.activity_login;
    private static final int LAYOUT_NOT = R.layout.isnotonline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!isOnline())
            setContentView(LAYOUT_NOT);
        else
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

            case R.id.button_refresh:

                Intent i = new Intent( this , this.getClass() );
                finish();
                this.startActivity(i);
                break;

            default:
                break;
        }
    }

    public  boolean isOnline()
    {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager)
                getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null)
            return false;
        else
            return  true;
    }
}
