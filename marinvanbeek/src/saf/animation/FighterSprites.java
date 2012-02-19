package saf.animation;

import saf.data.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.ImageIcon;

public class FighterSprites
{
    public static final String RESOURCE_LOCATION = "resources/";
    public static final String IMG_EXTENSION = ".png";
    public static final List<String> IMG_NAMES = Collections.unmodifiableList(
            Arrays.asList("start.png",
                          "punch_low.png",
                          "punch_high.png",
                          "kick_low.png",
                          "kick_high.png",
                          "block_low.png",
                          "block_high.png",
                          "death.png")
    );

    private Dictionary<String, ImageIcon> imageDictionary = 
            new Hashtable<String, ImageIcon>(8);

    public FighterSprites(String fighterName)
    {
        ImageIcon imageIcon;
        String spritesLocation = RESOURCE_LOCATION + fighterName + "/";

        for (String imageName : IMG_NAMES)
        {
            imageIcon = new ImageIcon(spritesLocation + imageName);

            imageDictionary.put(stripExtension(imageName), imageIcon);
        }
    }

    public FighterSprites(String fighterName, boolean flipped)
    {
        this(flipped ? fighterName + "/flipped" : fighterName);
    }

    private static String stripExtension(String fileName)
    {
        int extensionIndex = fileName.lastIndexOf(IMG_EXTENSION);

        return new String(fileName.substring(0, extensionIndex));
    }

    public ImageIcon getActionImage(saf.data.Action action)
    {
        return getImageByName(action.getAttack().getName());
    }

    public ImageIcon getImageByName(String name)
    {
        return imageDictionary.get(name);
    }
}

