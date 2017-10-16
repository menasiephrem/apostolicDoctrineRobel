package com.example.obelr.apostolicdoctrine;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.turkialkhateeb.materialcolorpicker.ColorChooserDialog;
import com.turkialkhateeb.materialcolorpicker.ColorListener;

import java.lang.reflect.Method;

/**
 * Created by Obel.R on 10/1/2017.
 */

public class setting  extends AppCompatActivity{

    protected MyApplication app;
    Button button;
    Methods methods;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(constant.theme);
        setContentView(R.layout.setting);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_setting);
        toolbar.setTitle("Setting");
        toolbar.setBackgroundColor(constant.color);

        app = (MyApplication) getApplication();


        methods = new Methods();
        button = (Button) findViewById(R.id.button_color);


        colorize();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorChooserDialog dialog = new ColorChooserDialog(setting.this);
                dialog.setTitle("Select");
                dialog.setColorListener(new ColorListener() {

                    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
                    @Override
                    public void OnColorClick(View view, int color) {
                        colorize();
                        constant.color = color;

                        methods.setColorTheme();

                        Intent intent = new Intent(setting.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
        });
    }

     public boolean onOptionsItemSelected(MenuItem item){

            switch (item.getItemId()){
                case android.R.id.home:
                    onBackPressed();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }

                private void colorize(){
            ShapeDrawable d = new ShapeDrawable(new OvalShape());
            d.setBounds(58,58,58,58);
            d.getPaint().setStyle(Paint.Style.FILL);
            d.getPaint().setColor(constant.color);
            button.setBackground(d);

        }


    }

