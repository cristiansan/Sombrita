package app.sombrita;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by cnc on 20/02/2015.
 */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    new Handler().postDelayed(new Runnable() {

        // Using handler with postDelayed called runnable run method

        @Override
        public void run() {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);

            // close this activity
            finish();
        }
    }, 2*1000); // wait for x seconds

}

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}