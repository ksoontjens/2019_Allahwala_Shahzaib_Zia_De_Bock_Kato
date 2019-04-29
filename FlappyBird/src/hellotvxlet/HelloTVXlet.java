package hellotvxlet;

import java.util.Timer;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;


public class HelloTVXlet implements Xlet {

  

    public void initXlet(XletContext context) {
     TimerBron tb=new TimerBron();
     
     Timer t=new Timer();
     t.scheduleAtFixedRate(tb, 0, 10);
     Achtergrond ag=new Achtergrond();
     tb.registreer(ag);
          Vogel vg=new Vogel();
     tb.registreer(vg);
     
     HScene scene=HSceneFactory.getInstance().getDefaultHScene();
     scene.add(ag);
          scene.add(vg);
          scene.popToFront(vg);
     scene.validate();
     scene.setVisible(true);
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
}
