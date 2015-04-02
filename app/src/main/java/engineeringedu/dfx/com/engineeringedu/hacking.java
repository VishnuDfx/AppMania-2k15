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


public class hacking extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hacking);


        ImageView about = (ImageView) findViewById(R.id.abouthacking);
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
                Intent photoshopi = new Intent(hacking.this, abouthacking.class);
                hacking.this.startActivity(photoshopi);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });


        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iq=new Intent(hacking.this,quizhacking.class);
                startActivity(iq);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });

        videotuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local = new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.youtube.com/playlist?list=PL4A78B3CA258B1E81"));
                hacking.this.startActivity(local);
            }
        });

        references.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("http://learnhacking.in/"));
                hacking.this.startActivity(local);

            }});























    }



}
