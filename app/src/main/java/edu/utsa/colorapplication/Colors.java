package edu.utsa.colorapplication;

import java.util.ArrayList;
import java.util.Random;

public class Colors {
    ArrayList<String> colorChoices;
    int num;
    Random rand;

    public Colors() {
        initializeColors();
        rand = new Random();
        num = rand.nextInt(colorChoices.size());
    }

    public void initializeColors(){
        colorChoices = new ArrayList<String>();
        colorChoices.add("BLUE");
        colorChoices.add("BLACK");
        colorChoices.add("RED");
        colorChoices.add("YELLOW");
        colorChoices.add("GREEN");
        colorChoices.add("MAGENTA");
    }

    public int newRandumNum() {
        int temp;
        temp = rand.nextInt(colorChoices.size());
        return temp;
    }

    public String getRandomColor() {
        num = newRandumNum();
        String s = "";

        s += colorChoices.get(num);

        return s;
    }
}
