/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

/**
 *
 * @author shahz
 */

public class Paal extends Sprite {
    
    Image paal;

     
         public Paal (String filename, boolean boven) 
    {
        super(filename);
        paal=this.getToolkit().getImage(("paal.png"));
        MediaTracker mt=new MediaTracker(this);
        mt.addImage(paal, 1);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        x=720;
        if (boven)  y=(int) (Math.random() * 150)-150; 
        else
            y=(int) (Math.random() * 100 + 100 + 288);
  
            
    }
 public void leef() {
    //  System.out.println("paal");
  //    x=x-1;

      x--; //=3;
      this.repaint();
 
        this.setBounds(x,y,img.getWidth(this),img.getHeight(this));
    }
 
 public void paint(Graphics g)
    {
        g.drawImage(paal, 0, 0, this);
        
     //  g.drawLine(x+100, x, x+100, x);
    }

}
