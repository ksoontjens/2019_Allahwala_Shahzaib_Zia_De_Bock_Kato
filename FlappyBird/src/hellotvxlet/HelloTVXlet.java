package hellotvxlet;

import java.util.Timer;
import javax.tv.xlet.*;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;


public class HelloTVXlet implements Xlet, UserEventListener {
          Vogel vg=new Vogel();
  

    public void initXlet(XletContext context) {
     TimerBron tb=new TimerBron();
     
     Timer t=new Timer();
     t.scheduleAtFixedRate(tb, 0, 10);
     Achtergrond ag=new Achtergrond();
     tb.registreer(ag);

     tb.registreer(vg);
     
     HScene scene=HSceneFactory.getInstance().getDefaultHScene();
     scene.add(ag);
          scene.add(vg);
          scene.popToFront(vg);
     scene.validate();
     scene.setVisible(true);
     UserEventRepository rep=new UserEventRepository("naam");
     rep.addAllArrowKeys();
     EventManager.getInstance().addUserEventListener(this, rep);
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void userEventReceived(UserEvent arg0) {
       if (arg0.getCode()==HRcEvent.VK_UP)
       {
          vg.y-=50;
       }
    }
}
