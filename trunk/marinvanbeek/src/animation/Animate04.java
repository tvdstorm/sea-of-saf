import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Animate04 extends JFrame{
  Thread animate;
  ImageIcon images[] = {
  	new ImageIcon("../../resources/bison/start.png"),
  	new ImageIcon("../../resources/bison/punch_low.png"),
    new ImageIcon("../../resources/bison/punch_high.png")};
  JLabel label = new JLabel(images[0]);

  public Animate04(){

    getContentPane().add(label);
    
    getContentPane().addMouseListener(
      new MouseAdapter(){
        public void mouseEntered(MouseEvent e){
         
          animate = new Animate();
          animate.start();
        }

        public void mouseExited(MouseEvent e){
          
          animate.interrupt();
          
          while (animate.isAlive()){}
          animate = null;
          
          label.setIcon(images[0]);
          label.repaint();
        }
      }
    );
    

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    setSize(300,300);
    setVisible(true);

  }
  

  public static void main(String[] args){
    new Animate04();
  }
  

  
  class Animate extends Thread{

    public void run(){
      try{
      	
      	
      	
      	
        while(true){
          
          display(1,500);

          display(2,500);
          display(0,500);
        }
      }catch(Exception ex){
        if(ex instanceof InterruptedException){
          
          
        }else{
          System.out.println(ex);
          System.exit(1);
        }
      }
    }
    
    
    
    
    
    
    
    void display(int image,int delay) 
                    throws InterruptedException{
      
      label.setIcon(images[image]);
      label.repaint();
      
      
      
      if(Thread.currentThread().interrupted())
        throw(new InterruptedException());
      
      
      
      Thread.currentThread().sleep(delay);
    }
    
  }

}
