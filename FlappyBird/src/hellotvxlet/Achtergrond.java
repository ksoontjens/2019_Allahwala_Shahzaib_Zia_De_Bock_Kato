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
public class Achtergrond extends Sprite implements Levend {

    Image achterg; //=new Image();
    int x=0;
    
    public Achtergrond (String filename) 
    
    {
      super(filename);
    }
    public void leef() {
  //    System.out.println("ag");
      x=x-1;
      if (x<-720) x=0;
      this.repaint();
    }

    
    public void paint(Graphics g)
    {
        g.drawImage(img, x, 0, this);
            g.drawImage(img, 720+x, 0, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
