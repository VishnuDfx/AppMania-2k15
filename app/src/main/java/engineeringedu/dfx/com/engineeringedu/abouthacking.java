package engineeringedu.dfx.com.engineeringedu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class abouthacking extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abouthacking);


        TextView textview = (TextView) findViewById(R.id.textview);

        textview.setText("Cracker\n" +
                "\n" +
                "One who breaks security on a system. Coined ca. 1985 by hackers\n" +
                "in defense against journalistic misuse of hacker (q.v., sense 8). An\n" +
                "earlier attempt to establish ‘worm’ in this sense around 1981–82\n" +
                "on Usenet was largely a failure.\n" +
                "\n" +
                "Use of both these neologisms reflects a strong revulsion against\n" +
                "the theft and vandalism perpetrated by cracking rings. While it is\n" +
                "expected that any real hacker will have done some playful cracking\n" +
                "and knows many of the basic techniques, anyone past larval stage\n" +
                "is expected to have outgrown the desire to do so except for immediate,\n" +
                "benign, practical reasons (for example, if it’s necessary to get\n" +
                "around some security in order to get some work done).\n" +
                "Thus, there is far less overlap between hackerdom and crackerdom\n" +
                "than the mundane reader misled by sensationalistic journalism\n" +
                "might expect. Crackers tend to gather in small, tight-knit,\n" +
                "very secretive groups that have little overlap with the huge, open\n" +
                "poly-culture this lexicon describes; though crackers often like to\n" +
                "describe themselves as hackers, most true hackers consider them a\n" +
                "separate and lower form of life.\n" +
                "\n" +
                "It’s clear that the term cracker is absolutely meant to be derogatory. One\n" +
                "shouldn’t take the tone too seriously though, as The Jargon File is done with a\n" +
                "sense of humor, and the above is said with a smile. As we can see from the\n" +
                "above, illegal or perhaps immoral activity is viewed with disdain by the “true\n" +
                "hackers,” whomever they may be. It also makes reference to cracker being a\n" +
                "possible intermediate step to hacker, perhaps something to be overcome.\n" +
                "\n" +
                "Script Kiddie\n" +
                "\n" +
                "The term script kiddie has come into vogue in recent years. The term refers to\n" +
                "crackers who use scripts and programs written by others to perform their intrusions.\n" +
                "If one is labeled a “script kiddie,” then he or she is assumed to be incapable\n" +
                "of producing his or her own tools and exploits, and lacks proper\n" +
                "understanding of exactly how the tools he or she uses work. As will be apparent\n" +
                "by the end of this chapter, skill and knowledge (and secondarily, ethics) are the\n" +
                "essential ingredients to achieving status in the minds of hackers. By definition,\n" +
                "a script kiddie has no skills, no knowledge, and no ethics.");


    }



}
