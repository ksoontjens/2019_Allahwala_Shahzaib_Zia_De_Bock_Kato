/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import org.havi.ui.HComponent;
import org.havi.ui.HStaticText;

/**
 *
 * @author shahz
 */
public class Achtergrond extends Sprite implements Levend {

    Image achterg; //=new Image();
    int x=0;
    int points;
    int prevPoints;
    int highPoints;

    
    public Achtergrond (String filename) 
    
    {
      super(filename);
      
    }
    public void leef() {
  //    System.out.println("ag");
      x=x-1;
      if (x<-720) x=0;
      this.repaint();
      if (achterg==null) return;
      this.setBounds(x,y,achterg.getWidth(this),achterg.getHeight(this));
      
    
    }

    
    public void paint(Graphics g)
    {
        g.drawImage(img, x, 0, this);
            g.drawImage(img, 720+x, 0, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
