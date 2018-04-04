package com.example.a94688.projectsazorg;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Button choice1;
    Button choice2;
    GridLayout gl;
    int x=0;
    int y =0;

    ArrayList<String> IDs = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gl = (GridLayout)findViewById(R.id.Choices);

        //View decorView = getWindow().getDecorView();
        // Hide the status bar.
        //int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        //decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        //ActionBar actionBar = getActionBar();
        //actionBar.hide();
        createBlankTextview("");
        createBlankTextview("");
        createTextview("You have just woken up in a forest all alone. What is your first action?");
    }


    public void choice1(View view){

        x++;

        createTextview("Choice one was pressed " + x + " times...");
        final ScrollView sv = (ScrollView)findViewById(R.id.sv);
        sv.post(new Runnable() {
            public void run() {
                sv.fullScroll(sv.FOCUS_DOWN);
            }
        });    }

    public void choice2(View view){

        y++;

        createTextview("Choice two was pressed " + y + " times...");
        final ScrollView sv = (ScrollView)findViewById(R.id.sv);
        sv.post(new Runnable() {
            public void run() {
                sv.fullScroll(sv.FOCUS_DOWN);
            }
        });    }


    public void animateTextViews() {




    }

    public void createBlankTextview(String s){

        // Get the widgets reference from XML layout
        LinearLayout rl = (LinearLayout) findViewById(R.id.ll);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        //tv.setId(findViewById(id));

        tv.setGravity(Gravity.CENTER);

        tv.setPadding(5,5,5,5);

        tv.setHeight(150);

        // Set text to display in TextView
        tv.setText(s);

        rl.addView(tv);

    }

    public void createTextview(String s){

        // Get the widgets reference from XML layout
        LinearLayout rl = (LinearLayout) findViewById(R.id.ll);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        //tv.setId(findViewById(id));

        tv.setGravity(Gravity.CENTER);

        tv.setPadding(5,5,5,5);

        tv.setHeight(150);

        // Set text to display in TextView
        tv.setText(s);

        // Set a text color for TextView text
        tv.setTextColor(Color.parseColor("#6e7f80"));

        tv.setId(R.id.startingText);

        ShapeDrawable sd = new ShapeDrawable();

        // Specify the shape of ShapeDrawable
        sd.setShape(new RectShape());

        // Specify the border color of shape
        sd.getPaint().setColor(Color.BLACK);

        // Set the border width
        sd.getPaint().setStrokeWidth(10f);

        // Specify the style is a Stroke
        sd.getPaint().setStyle(Paint.Style.STROKE);

        // Finally, add the drawable background to TextView
        tv.setBackground(sd);

        // Add newly created TextView to parent view group (RelativeLayout)
        rl.addView(tv);

    }
}
