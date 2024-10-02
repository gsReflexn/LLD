import observable.IphoneStockObservable;
import observable.StocksObservable;
import observer.EmailAlertObserver;
import observer.MobileAlertObserver;
import observer.NotificationAlertObserver;


public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("gopi@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("gurmeet@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("801666", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(0);
    }
}
