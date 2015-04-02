package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class aboutcoding extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutcoding);

        TextView textview = (TextView) findViewById(R.id.textview);

        textview.setText("Computer programming is defined as telling a computer what to do through a special set of instructions which are then interpreted by the computer to perform some task(s). These instructions can be specified in one or more programming languages including Java, C, and C++.\n" +
                "\n" +
                "A computer goes through a set of steps whose purpose is to achieve something. These steps are instructed to the computer by computer programs. Essentialy, computer programming is the process by which these programs are designed and implemented.\n" +
                "\n" +
                "The advantages to learning computer programming include gaining new skills, being able to tell the computer what to do, and becoming better acquainted with computers. Computer programming is a challenging and rewarding discipline. Whatever you plan on building, the road ahead of you is an interesting one.\n" +
                "\n" +
                "The tutorials in this section included information on introductory computer programming topics such as what computer programming is, the advantages of learning the subject, common misconceptions about the subject, computer programming concepts, the different types of languages, what you need to write programs, and more.\n"+"The next step is to actually learn a computer programming language. Start with Java.\n" +
                "\n" +
                "Java is a language used to for web development as well as software development. Java can be used to interact with the user, create graphical programs, communicate with databases, and more. Learning Java will serve as a good introduction to software development.\n" +
                "\n" +
                "To begin learning Java, visit our Java tutorials.\n" +
                "\n" +
                "If you would like to continue with web development instead of computer programming, you can visit one of our many other sections including HTML tutorials, CSS tutorials, Javascript tutorials, VBScript tutorials or PHP tutorials.");








    }



}
