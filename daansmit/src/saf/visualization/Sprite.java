package saf.visualization;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Sprite
{
    private final boolean mirrored;
    private final JLabel label;

    public Sprite(String path, boolean mirrored)
    {
        this.mirrored = mirrored;
        label = new JLabel();
        setImage(path);
        label.setBounds(0, 0, label.getIcon().getIconWidth(), label.getIcon().getIconHeight());
    }

    public Sprite(String path)
    {
        this(path, false);
    }

    public JLabel getLabel() { return label; }

    public void setImage(String path)
    {
        ImageIcon image;
        if (mirrored)
        {
            image = new MirrorImageIcon(path);
        }
        else
        {
            image = new ImageIcon(path);
        }
        label.setIcon(image);
        label.repaint();
    }

    public void setPosition(int x, int y)
    {
        label.setLocation(x, y);
        // label.setBounds(x,y,32,64);
    }
}
