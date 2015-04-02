package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class aboutrobotics extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutrobotics);


        TextView textview = (TextView) findViewById(R.id.textview);

        textview.setText("For many people it is a machine that imitates a human—like the androids in Star Wars, Terminator and Star Trek: The Next Generation. However much these robots capture our imagination, such robots still only inhabit Science Fiction. People still haven't been able to give a robot enough 'common sense' to reliably interact with a dynamic world. However, Rodney Brooks and his team at MIT Artificial Intelligence Lab are working on creating such humanoid robots.\n" +
                "\n" +
                "The type of robots that you will encounter most frequently are robots that do work that is too dangerous, boring, onerous, or just plain nasty. Most of the robots in the world are of this type. They can be found in auto, medical, manufacturing and space industries. In fact, there are over a million of these type of robots working for us today.\n" +
                "\n" +
                "Some robots like the Mars Rover Sojourner and the upcoming Mars Exploration Rover, or the underwater robot Caribou help us learn about places that are too dangerous for us to go. While other types of robots are just plain fun for kids of all ages. Popular toys such as Teckno, Polly or AIBO ERS-220 seem to hit the store shelves every year around Christmas time.\n" +
                "\n" +
                "And as much fun as robots are to play with, robots are even much more fun to build. In Being Digital, Nicholas Negroponte tells a wonderful story about an eight year old, pressed during a televised premier of MITMedia Lab's LEGO/Logo work at Hennigan School. A zealous anchor, looking for a cute sound bite, kept asking the child if he was having fun playing with LEGO/Logo. Clearly exasperated, but not wishing to offend, the child first tried to put her off. After her third attempt to get him to talk about fun, the child, sweating under the hot television lights, plaintively looked into the camera and answered, \"Yes it is fun, but it's hard fun.\"\n" +
                "\n" +
                "But what exactly is a robot?\n" +
                "\n" +
                "As strange as it might seem, there really is no standard definition for a robot. However, there are some essential characteristics that a robot must have and this might help you to decide what is and what is not a robot. It will also help you to decide what features you will need to build into a machine before it can count as a robot.\n" +
                "\n" +
                "A robot has these essential characteristics:\n" +
                "\n" +
                "Sensing First of all your robot would have to be able to sense its surroundings. It would do this in ways that are not unsimilar to the way that you sense your surroundings. Giving your robot sensors: light sensors (eyes), touch and pressure sensors (hands), chemical sensors (nose), hearing and sonar sensors (ears), and taste sensors (tongue) will give your robot awareness of its environment.\n" +
                "Movement A robot needs to be able to move around its environment. Whether rolling on wheels, walking on legs or propelling by thrusters a robot needs to be able to move. To count as a robot either the whole robot moves, like the Sojourner or just parts of the robot moves, like the Canada Arm.\n" +
                "Energy A robot needs to be able to power itself. A robot might be solar powered, electrically powered, battery powered. The way your robot gets its energy will depend on what your robot needs to do.\n" +
                "Intelligence A robot needs some kind of \"smarts.\" This is where programming enters the pictures. A programmer is the person who gives the robot its 'smarts.' The robot will have to have some way to receive the program so that it knows what it is to do.");


    }



}
