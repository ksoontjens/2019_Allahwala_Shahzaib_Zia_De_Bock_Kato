/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author shahz
 */

public class Paal extends Sprite {
   

     
         public Paal (String filename) 
    {
        super(filename);
    }
 public void leef() {
    //  System.out.println("paal");
  //    x=x-1;

      x--; //=3;
      this.repaint();
 
        this.setBounds(x,y,img.getWidth(this),img.getHeight(this));
    }

}
