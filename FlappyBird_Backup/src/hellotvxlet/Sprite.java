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
public abstract class Sprite extends HComponent implements Levend {


    int x=0;
     Image img;

    int y=0;
    
    public Sprite (String filename) 
    
     {
     img=this.getToolkit().getImage((filename));
      MediaTracker mt=new MediaTracker(this);
      mt.addImage(img, 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
  
        this.setBounds(x,y,img.getWidth(this),img.getHeight(this));
     }
  
    public void paint(Graphics g)
    {
         g.drawImage(img, 0, 0, this);
        
    } 
    

}
