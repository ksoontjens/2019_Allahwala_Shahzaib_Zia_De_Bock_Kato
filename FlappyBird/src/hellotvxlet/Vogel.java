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
public class Vogel extends HComponent implements Levend {

    Image spaceship1, spaceship2, spaceship3, spaceship4; //=new Image();
    int x=50;
    boolean flap=false;
    int val=1;
    int y=230;
    
    public Vogel () 
    
    {
       spaceship1=this.getToolkit().getImage(("spaceship1.png"));
              spaceship2=this.getToolkit().getImage(("spaceship2.png"));
                    spaceship3=this.getToolkit().getImage(("spaceship3.png"));
                            spaceship4=this.getToolkit().getImage(("spaceship4.png"));
       MediaTracker mt=new MediaTracker(this);
       mt.addImage(spaceship1, 1);     mt.addImage(spaceship2, 2);      mt.addImage(spaceship3, 3);     mt.addImage(spaceship4, 4);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       this.setBounds(0,0,720,576);
    }
    public void leef() {
      System.out.println("ag");
  //    x=x-1;
      flap=!flap;
      val++;
      if(val == 4){
    
          val = 1;
      }
      y+=3;
      this.repaint();
    }

    
    public void paint(Graphics g)
    {
        if (val == 1) g.drawImage(spaceship1, x, y, this);
        if (val == 2) g.drawImage(spaceship2, x, y, this);
        if (val == 3) g.drawImage(spaceship3, x, y, this);
        if (val == 4) g.drawImage(spaceship4, x, y, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
