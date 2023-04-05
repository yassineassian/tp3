package Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

public class ObservateurNotifications implements Observer{
	
	public ObservateurNotifications()
	{}
	
	@Override
    public void update(Observable observable, Object arg) {
        Notification notification = (Notification) arg;
        System.out.println("Nouvelle notification : " + notification.getContenu());
    }

}
