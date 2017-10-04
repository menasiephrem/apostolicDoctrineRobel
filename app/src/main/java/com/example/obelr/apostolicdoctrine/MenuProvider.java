package com.example.obelr.apostolicdoctrine;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Obel.R on 9/30/2017.
 */

public class MenuProvider {

    public List<menus> readmenu() {
        return Arrays.asList(
                new menus("GOD, Who is God"),
                new menus("CREATION, What is Creation"),
                new menus("BIBLE, What is Bible"),
                new menus("half moon, boy and girl in love, wolf"),
                new menus("drumstick, rib, game controller"),
                new menus("bride, boy, pow, pow"),
                new menus("cat, boot")
        );
    }
}
