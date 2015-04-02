package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends Activity {
   Animation animation ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView coding = (ImageView) findViewById(R.id.coding);
        ImageView hacking = (ImageView) findViewById(R.id.hacking);
        ImageView photoshop = (ImageView) findViewById(R.id.photoshop);
        ImageView robotics = (ImageView) findViewById(R.id.robotics);

       animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
          coding.startAnimation(animation);
        hacking.startAnimation(animation);
        photoshop.startAnimation(animation);
        robotics.startAnimation(animation);

        coding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coding = new Intent(MainActivity.this,coding.class);
                MainActivity.this.startActivity(coding);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });

        robotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent robotics = new Intent(MainActivity.this,robotics.class);
                MainActivity.this.startActivity(robotics);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });


        photoshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent photoshop = new Intent(MainActivity.this,photoshop.class);
                MainActivity.this.startActivity(photoshop);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });

        hacking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hacking = new Intent(MainActivity.this,hacking.class);
                MainActivity.this.startActivity(hacking);
                overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
            }
        });
    }









}
