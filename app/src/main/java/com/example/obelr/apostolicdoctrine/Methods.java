package com.example.obelr.apostolicdoctrine;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by Obel.R on 10/1/2017.
 */

public class Methods {

    //CONSTANTS
    public final int red =        0xffF44336;
    public final int pink =       0xffE91E63;
    public final int Purple =     0xff9C27B0;
    public final int DeepPurple = 0xff673AB7;
    public final int Indigo =     0xff3F51B5;
    public final int Blue =       0xff2196F3;
    public final int LightBlue =  0xff03A9F4;
    public final int Cyan =       0xff00BCD4;
    public final int Teal =       0xff009688;
    public final int Green =      0xff4CAF50;
    public final int LightGreen = 0xff8BC34A;
    public final int Lime =       0xffCDDC39;
    public final int Yellow =     0xffFFEB3B;
    public final int Amber =      0xffFFC107;
    public final int Orange =     0xffFF9800;
    public final int DeepOrange = 0xffFF5722;
    public final int Brown =      0xff795548;
    public final int Grey =       0xff9E9E9E;
    public final int BlueGray =   0xff607D8B;
    public final int Black =      0xff000000;
    public final int White =      0xffffffff;

    public void setColorTheme(){
        switch (constant.color){

            case red:
                constant.theme = R.style.AppTheme_red;
                break;
            case pink:
                constant.theme=R.style.AppTheme_pink;
                break;
            case DeepPurple:
                constant.theme=R.style.AppTheme_violet;
                break;
            case Blue:
                constant.theme=R.style.AppTheme_blue;
                break;
            case LightBlue:
                constant.theme=R.style.AppTheme_skybule;
                break;
            case Green:
                constant.theme=R.style.AppTheme_green;
                break;
            case Grey:
                constant.theme=R.style.AppTheme_grey;
                break;
            case Brown:
                constant.theme=R.style.AppTheme_brown;
                break;

            case Yellow:
                constant.theme=R.style.AppTheme_Yellow;
                break;

 /*           case Purple:
                constant.theme=R.style.AppTheme_P;
                break;

            case Indigo:
                constant.theme=R.style.AppTheme_Indigo;
                break;

            case Cyan:
                constant.theme=R.style.AppTheme_Cyan;
                break;

           case Teal:
                constant.theme=R.style.AppTheme_Teal;
                break;

            case Lime:
                constant.theme=R.style.AppTheme_Lime;
                break;

   */

            case Amber:
                constant.theme=R.style.AppTheme_Amber;
                break;

            case LightGreen:
                constant.theme=R.style.AppTheme_LightGreen;
                break;


            case Orange:
                constant.theme=R.style.AppTheme_Orange;
                break;

            case DeepOrange:
                constant.theme=R.style.AppTheme_DeepOrange;
                break;

            case BlueGray:
                constant.theme=R.style.AppTheme_BlueGray;
                break;

            case Black:
                constant.theme=R.style.AppTheme_Black;
                break;

            case White:
                constant.theme=R.style.AppTheme_White;
                break;

            default:
                constant.theme=R.style.AppTheme;
                Log.e("default THEME", "caught in the default theme");
                break;
        }

    }


}
