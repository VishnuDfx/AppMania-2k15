package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class aboutphotoshop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutphotoshop);



        TextView textview = (TextView) findViewById(R.id.textview);

        textview.setText("Photoshop is a popular image changing software package. It is widely used by photographers for photo editing (fixing colors, reducing noise, adding effects, fixing brightness/contrast) and by graphic designers and Web designers to create and change images for web pages. Version Photoshop CS6 was launched on April 23 2012.\n" +
                "\n" +
                "Photoshop works on computer systems like Windows and Mac. The software is made by the company Adobe. A simpler version named Photoshop Elements is made for home users who do not want to buy the more powerful, more expensive full version. Photoshop Express, a free version, is even more limited.\n"+"Photoshop is unlike other common software interfaces which emulate virtual typewriters or graphing paper. Photoshop creates an artist's virtual studio/darkroom. When you open the program you see a toolbox on the left with tools you will use to manipulate your images, and on the right, a white square which is your \"canvas\" or work area. The gray area surrounding the canvas is not part of your image, but only defines its edges.");


    }



}
