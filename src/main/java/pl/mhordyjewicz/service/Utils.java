package pl.mhordyjewicz.service;

import java.awt.*;
import java.util.Random;

public class Utils
{
    public static String randomColor()
    {
        Random generator = new Random();
        int r = generator.nextInt(256);
        int g = generator.nextInt(256);
        int b = generator.nextInt(256);

        Color c = new Color(r, g, b).darker();
        return String.format("#%06x", c.getRed() * c.getGreen() * c.getBlue());
    }
}
