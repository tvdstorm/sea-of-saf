import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class marquet extends java.applet.Applet implements Runnable
{

String mesag ="Simple Animation";
Font mfont = new Font("TimesRoman",Font.BOLD, 36);
int Xposition = 600;

Image scrnBuf;
Graphics scrnG;

Thread runner;

public void init()
{
scrnBuf = createImage(600,50);
scrnG = scrnBuf.getGraphics();
}

public void start()
 {
  if (runner == null);
  {
    runner = new Thread(this);
    runner.start();
  }
 }

public void stop()
 {
  if (runner != null);
  {
    runner.stop();
    runner = null;

  }
 }

public void run()
{
  while(true)
  {
  repaint();
  try {Thread.sleep(30);}
  catch(InterruptedException e) { }
  }
}

public void update(Graphics g)
{
  paint(g);
}

public void paint(Graphics g)
{
  Color c = new Color(128,128,192);
  scrnG.setColor(c);
  scrnG.fillRect(0,0,600,50);
  scrnG.setColor(Color.red);
  scrnG.setFont(mfont);
  scrnG.drawString(mesag,Xposition,40);
  Xposition--;
  if (Xposition < -290)
    {
    Xposition = 600;
    }
  g.drawImage(scrnBuf, 0 , 0 , this);
}

}
