/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import org.havi.ui.HComponent;
/**
 *
 * @author shahz
 */

public class Vogel extends Sprite {
    
    Image spaceship1, spaceship2, spaceship3, spaceship4, gameOver; //=new Image();


    int val=1;
public Vogel(String filename)
{
    super(filename);
    spaceship1=this.getToolkit().getImage(("spaceship1.png"));
              spaceship2=this.getToolkit().getImage(("spaceship2.png"));
                    spaceship3=this.getToolkit().getImage(("spaceship3.png"));
                            spaceship4=this.getToolkit().getImage(("spaceship4.png"));
                                    gameOver=this.getToolkit().getImage(("gameOver.png"));
       MediaTracker mt=new MediaTracker(this);
       mt.addImage(spaceship1, 1);     mt.addImage(spaceship2, 2);      mt.addImage(spaceship3, 3);     mt.addImage(spaceship4, 4);     mt.addImage(gameOver, 5);
       try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
         this.setBounds(x,y,spaceship1.getWidth(this),spaceship1.getHeight(this));
}
  public void leef() {
//      System.out.println("ag");
  //    x=x-1;
     
      val++;
      if(val == 4){
    
          val = 1;
      }
      x=30;
      y+=3;
      this.repaint();
      
        this.setBounds(x,y,spaceship1.getWidth(this),spaceship1.getHeight(this));
        
    }
      public void paint(Graphics g)
    {
        if (val == 1) g.drawImage(spaceship1, 0, 0, this);
        if (val == 2) g.drawImage(spaceship2, 0, 0, this);
        if (val == 3) g.drawImage(spaceship3, 0, 0, this);
        if (val == 4) g.drawImage(spaceship4, 0, 0, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
