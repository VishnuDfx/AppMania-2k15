package engineeringedu.dfx.com.engineeringedu;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


public class quizphotoshop extends ActionBarActivity {
    private Button btnSubmitQuiz;
    int score,ans1,ans2, ans3,ans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizphotoshop);


















        RadioGroup champ=(RadioGroup)findViewById(R.id.answer1);
        champ.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer1A:
                        ans1 =1;
                        break;
                    case R.id.answer1B:
                        ans1 =2;
                        //score++;
                        break;
                    case R.id.answer1C:
                        ans1 =3;
                        break;
                }
            }
        });
        RadioGroup gBall=(RadioGroup)findViewById(R.id.answer2);
        gBall.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer2A:
                        ans2 = 1;
                        break;
                    case R.id.answer2B:
                        ans2 = 2;
                        break;
                    case R.id.answer2C:
                        ans2 = 3;
                        break;
                }
            }
        });
        RadioGroup gBoot = (RadioGroup)findViewById(R.id.answer3);
        gBoot.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer3A:
                        ans3 = 1;
                        break;
                    case R.id.answer3B:
                        ans3 = 2;
                        break;
                    case R.id.answer3C:
                        ans3 =3;
                        break;
                }
            }
        });









        gBoot = (RadioGroup)findViewById(R.id.answer4);
        gBoot.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer4A:
                        ans4 = 1;
                        break;
                    case R.id.answer4B:
                        ans4 = 2;
                        break;
                    case R.id.answer4C:
                        ans4 =3;
                        break;
                }
            }
        });

















        btnSubmitQuiz = (Button) findViewById(R.id.submit);
        btnSubmitQuiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                score =0;
                // TODO Auto-generated method stub
                if(ans1 == 1)
                    score++;
                if(ans2 == 2)
                    score++;
                if(ans3 == 2)
                    score++;
                if(ans4==2)
                    score++;
                Toast.makeText(quizphotoshop.this, "Your score is:" + score + " out of 4", Toast.LENGTH_LONG).show();
            }
        });

    }

}