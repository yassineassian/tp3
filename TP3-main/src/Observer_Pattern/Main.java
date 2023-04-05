package Observer_Pattern;

public class Main {
	
	public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        ObservateurNotifications observateur1 = new ObservateurNotifications();
        ObservateurNotifications observateur2 = new ObservateurNotifications();

        notificationManager.addObserver(observateur1);
        notificationManager.addObserver(observateur2);

        notificationManager.nouvelleNotification(new Notification("Première notification"));
        notificationManager.nouvelleNotification(new Notification("Deuxième notification"));

        System.out.println("Nombre de notifications : " + notificationManager.getNombreNotifications());
    }

}
