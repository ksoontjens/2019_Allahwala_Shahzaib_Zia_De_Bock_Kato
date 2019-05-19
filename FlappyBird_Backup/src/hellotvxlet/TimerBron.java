/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author shahz
 */
public class TimerBron extends TimerTask {

    ArrayList al=new ArrayList();
    boolean disabled=false;
    
    public void run() {
     //   System.out.println(".");
        if (!disabled)
        {
       for (int i=0;i<al.size();i++)
       {
           ((Levend)al.get(i)).leef();
       }
        }
    }
    
    public void registreer(Levend l)
    {
        al.add(l);
    }

        
    
}
