package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ColourPickerActivity extends AppCompatActivity {
    TextView gfgTextView;


    Button mSetColorButton, mPickColorButton;
    View mColorPreview;

    int mDefaultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_picker);
        gfgTextView = findViewById(R.id.gfg_heading);
        mPickColorButton = findViewById(R.id.pick_color_button);
        mSetColorButton = findViewById(R.id.set_color_button);
        mColorPreview = findViewById(R.id.preview_selected_color);
        mDefaultColor = 0;
        mPickColorButton.setOnClickListener(
                new View.OnClickListener() {
                    class Builder {
                        public Builder(ColourPickerActivity colourPickerActivity) {
                        }

                        public Object initialColor(int red) {
                            return null;
                        }
                    }

                    @Override
                    public void onClick(final View v) {
//                        new Builder(ColourPickerActivity.this).initialColor(Color.RED)
//                                .enableBrightness(true).enableAlpha(true).okTitle("Choose").cancelTitle("Cancel")
//                                .showIndicator(true).showValue(true).build()
//                                .show(v, new ColourPickerActivity.ColorPickerObserver() {
//                                    @Override
//                                    public void
//                                    onColorPicked(int color) {
//                                        mDefaultColor = color;
//                                        mColorPreview.setBackgroundColor(mDefaultColor);
//                                    }
//                                });
                    }
                });


        mSetColorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gfgTextView.setTextColor(mDefaultColor);
                    }
                });
    }
}