package com.example.obelr.apostolicdoctrine;

/**
 * Created by Obel.R on 10/1/2017.
 */

public class Methods {

    public void setColorTheme(){
        switch (constant.color){

            case 0xffF44336:
                constant.theme=R.style.AppTheme_red;
                break;
            case 0xffE91E63:
            constant.theme=R.style.AppTheme_pink;
            break;
            case 0xff673AB7:
            constant.theme=R.style.AppTheme_violet;
            break;
            case 0xff2F51B5:
            constant.theme=R.style.AppTheme_blue;
            break;
            case 0xff03A9F4:
            constant.theme=R.style.AppTheme_skybule;
            break;
            case 0xff4CAF50:
                constant.theme=R.style.AppTheme_green;
                break;
            case 0xffFF9800:
                constant.theme=R.style.AppTheme;
                break;
            case 0xff9E9E9E:
                constant.theme=R.style.AppTheme_grey;
                break;
            case 0xff795548:
                constant.theme=R.style.AppTheme_brown;
                break;

            default:
                constant.theme=R.style.AppTheme;
                break;
        }

    }


}
