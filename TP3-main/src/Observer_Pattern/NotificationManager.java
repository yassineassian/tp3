package Observer_Pattern;

import java.util.Observable;

public class NotificationManager extends Observable{
	
	private int nombreNotifications = 0;

    public void nouvelleNotification(Notification notification) {
        nombreNotifications++;
        setChanged();
        notifyObservers(notification);
    }

    public int getNombreNotifications() {
        return nombreNotifications;
    }

}
