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
public class Achtergrond extends HComponent implements Levend {

    Image achterg; //=new Image();
    int x=0;
    
    public Achtergrond () 
    
    {
       achterg=this.getToolkit().getImage(("achtergrond.jpg"));
       MediaTracker mt=new MediaTracker(this);
       mt.addImage(achterg, 1);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       this.setBounds(0,0,720,576);
    }
    public void leef() {
      System.out.println("ag");
      x=x-1;
      this.repaint();
    }

    
    public void paint(Graphics g)
    {
        g.drawImage(achterg, x, 0, this);
     //  g.drawLine(x+100, x, x+100, x);
    }
}
