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

    Image vogel, vogel2; //=new Image();
    int x=50;
    boolean flap=false;
    
    public Vogel () 
    
    {
       vogel=this.getToolkit().getImage(("vogel.jpg"));
              vogel2=this.getToolkit().getImage(("vogel2.jpg"));
       MediaTracker mt=new MediaTracker(this);
       mt.addImage(vogel, 1);     mt.addImage(vogel2, 2);
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
      this.repaint();
    }

    
    public void paint(Graphics g)
    {
        if (flap) g.drawImage(vogel, x, 0, this); else  g.drawImage(vogel2, x, 0, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
