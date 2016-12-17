package ufm;

/**
 * Created by Deepak on 15/12/2016.
 */

import processing.core.*;

public class MyPApplet extends PApplet{
    private PImage backgroundImg;
    private String loc = "C:\\Users\\deepa\\Documents\\GitHub\\data-structure-algo-Java\\src\\ufm\\celestial.jpg";

    public void setup() {
        size(400, 400);
        backgroundImg = loadImage(loc,"jpg");
    }

    public void draw(){
        backgroundImg.resize(0,height);
        image(backgroundImg,0,0);
        fill(255,209,0);
        ellipse(width/4,height/5,width/5,height/5);
    }

}
