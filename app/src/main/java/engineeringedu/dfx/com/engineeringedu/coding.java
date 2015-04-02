package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class coding extends Activity {
         Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding);

        ImageView about = (ImageView) findViewById(R.id.aboutcoding);
        ImageView  references= (ImageView) findViewById(R.id.references);
        ImageView videotuts = (ImageView) findViewById(R.id.videotuts);
        ImageView quiz = (ImageView) findViewById(R.id.quiz);

       Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
        about.startAnimation(animation);
        references.startAnimation(animation);
        videotuts.startAnimation(animation);
        quiz.startAnimation(animation);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoshopi = new Intent(coding.this, aboutcoding.class);
            coding.this.startActivity(photoshopi);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });


        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iq=new Intent(coding.this,quiz2.class);
                startActivity(iq);

            }
        });

        videotuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local = new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.youtube.com/results?search_query=derek+banas"));
                coding.this.startActivity(local);
            }
        });

        references.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("http://www.w3schools.com/"));
                coding.this.startActivity(local);

            }});













    }
    public void quiz(View view)
    {
        Intent iq=new Intent(coding.this,quiz2.class);
        startActivity(iq);
    }

}
