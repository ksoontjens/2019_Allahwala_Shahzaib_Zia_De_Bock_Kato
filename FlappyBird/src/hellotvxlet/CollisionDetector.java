/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.ArrayList;

/**
 *
 * @author shahz
 */
public class CollisionDetector implements Levend {

      ArrayList al=new ArrayList();
      Vogel v;
      
    public CollisionDetector(Vogel vp)
    {
        v=vp;
    }
    public void leef() {
     //   System.out.println(".");
       for (int i=0;i<al.size();i++)
       {
           Paal p=((Paal)al.get(i));
           if (p.getBounds().intersects(v.getBounds()))
           {
               System.out.println("COLLISION!!!");
           }
           
       }
    }
    
    public void add(Paal l)
    {
        al.add(l);
    }


}
