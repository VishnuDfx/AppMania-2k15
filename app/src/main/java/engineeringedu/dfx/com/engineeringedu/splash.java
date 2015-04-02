package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread t = new Thread() {
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();

                }finally {
                    Intent open=new Intent(splash.this,MainActivity.class);
                    startActivity(open);
                }
            }
        };
        t.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}
