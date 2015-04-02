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


public class photoshop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photoshop);




        ImageView about = (ImageView) findViewById(R.id.aboutphotoshop);
        ImageView  references= (ImageView) findViewById(R.id.referencesphotoshop);
        ImageView videotuts = (ImageView) findViewById(R.id.videotutsphotoshop);
        ImageView quiz = (ImageView) findViewById(R.id.quizphotoshop);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
        about.startAnimation(animation);
        references.startAnimation(animation);
        videotuts.startAnimation(animation);
        quiz.startAnimation(animation);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoshopi = new Intent(photoshop.this, aboutphotoshop.class);
                photoshop.this.startActivity(photoshopi);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });


        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iq=new Intent(photoshop.this,quizphotoshop.class);
                startActivity(iq);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });

        videotuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local = new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("https://www.youtube.com/results?search_query=photoshop+tutorial+playlist"));
                photoshop.this.startActivity(local);
            }
        });

        references.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent local=new Intent("android.intent.action.VIEW");
                local.setData(Uri.parse("http://www.photoshop.com/learn"));
                photoshop.this.startActivity(local);

            }});
    }
}
