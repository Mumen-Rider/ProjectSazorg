package com.example.a94688.projectsazorg;

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
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridLayout gl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gl = (GridLayout)findViewById(R.id.Choices);

        // Get the widgets reference from XML layout
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        // Set text to display in TextView
        tv.setText("Click one of the coices!!");

        // Set a text color for TextView text
        tv.setTextColor(Color.parseColor("#6e7f80"));

        // Add newly created TextView to parent view group (RelativeLayout)
        rl.addView(tv);
    }


    public void choice1(View view){

        // Get the widgets reference from XML layout
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        // Set text to display in TextView
        tv.setText("Choice one was pressed...");

        // Set a text color for TextView text
        tv.setTextColor(Color.parseColor("#806e7f"));

        tv.setBackgroundColor(Color.parseColor("#ffeeee"));


        // Add newly created TextView to parent view group (RelativeLayout)
        rl.addView(tv);
    }

    public void choice2(View view){

        // Get the widgets reference from XML layout
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());

        // Create a LayoutParams for TextView
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView

        // Apply the layout parameters to TextView widget
        tv.setLayoutParams(lp);

        // Set text to display in TextView
        tv.setText("Choice two was pressed...");

        // Set a text color for TextView text
        tv.setTextColor(Color.parseColor("#7f806e"));

        tv.setBackgroundColor(Color.parseColor("#eeeeff"));



        //tv.setId(Integer.parseInt("choiceTwoText"));
        //^^broken ID setting test



        // Add newly created TextView to parent view group (RelativeLayout)
        rl.addView(tv);

        /*// Initializing a ShapeDrawable
        ShapeDrawable sd = new ShapeDrawable();

        // Specify the shape of ShapeDrawable
        sd.setShape(new RectShape());

        // Specify the border color of shape
        sd.getPaint().setColor(Color.RED);

        // Set the border width
        sd.getPaint().setStrokeWidth(10f);

        // Specify the style is a Stroke
        sd.getPaint().setStyle(Paint.Style.STROKE);

        sd.getPaint().s

        // Finally, add the drawable background to TextView
        tv.setBackground(sd);*/
    }
}
