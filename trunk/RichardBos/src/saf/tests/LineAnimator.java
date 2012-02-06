package saf.tests;

import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class LineAnimator {

    public static void main(String[] args) {
        final int w = 640;
        final int h = 480;
        final RenderingHints hints = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
            );
        hints.put(
            RenderingHints.KEY_ALPHA_INTERPOLATION,
            RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY
            );
        final BufferedImage bi = new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);
        final JLabel l = new JLabel(new ImageIcon(bi));
       
        
        final Font font = new Font("Arial", Font.BOLD, 30);
        ActionListener al = new ActionListener() {

            int count = 0;
            long lastTime;
            String fps = "";

            public void actionPerformed(ActionEvent ae) {
                count++;
                Graphics2D g = bi.createGraphics();
                g.setRenderingHints(hints);

                g.clearRect(0,0,w,h);
                
                if ( System.currentTimeMillis()-lastTime>1000 ) {
                    lastTime = System.currentTimeMillis();
                    fps = count + " FPS";
                    count = 0;
                }
                g.setColor(Color.YELLOW);
                g.setFont(font);
                g.drawString(fps,10,30);

                l.repaint();
                g.dispose();
            }
        };
        Timer timer = new Timer(1,al);
        timer.start();

        JOptionPane.showMessageDialog(null, l);
        System.exit(0);
    }
}

/*class BouncingLine {
    private final Color color;
    private static final BasicStroke stroke = new BasicStroke(4);
    private static final Random random = new Random();
    Line2D line;
    int w;
    int h;
    int x1;
    int y1;
    int x2;
    int y2;

    BouncingLine(int w, int h) {
        line = new Line2D.Double(random.nextInt(w),random.nextInt(h),random.nextInt(w),random.nextInt(h));
        this.w = w;
        this.h = h;
        this.color = new Color(
            128+random.nextInt(127),
            128+random.nextInt(127),
            128+random.nextInt(127),
            85
            );
        x1 = (random.nextBoolean() ? 1 : -1);
        y1 = (random.nextBoolean() ? 1 : -1);
        x2 = -x1;
        y2 = -y1;
    }

    public void move() {
        int tx1 = 0;
        if (line.getX1()+x1>0 && line.getX1()+x1<w) {
            tx1 = (int)line.getX1()+x1;
        } else {
            x1 = -x1;
            tx1 = (int)line.getX1()+x1;
        }
        int ty1 = 0;
        if (line.getY1()+y1>0 && line.getY1()+y1<h) {
            ty1 = (int)line.getY1()+y1;
        } else {
            y1 = -y1;
            ty1 = (int)line.getY1()+y1;
        }
        int tx2 = 0;
        if (line.getX2()+x2>0 && line.getX2()+x2<w) {
            tx2 = (int)line.getX2()+x2;
        } else {
            x2 = -x2;
            tx2 = (int)line.getX2()+x2;
        }
        int ty2 = 0;
        if (line.getY2()+y2>0 && line.getY2()+y2<h) {
            ty2 = (int)line.getY2()+y2;
        } else {
            y2 = -y2;
            ty2 = (int)line.getY2()+y2;
        }
        line.setLine(tx1,ty1,tx2,ty2);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(color);
        g2.setStroke(stroke);
        //line.set
        g2.draw(line);
    }
}
*/