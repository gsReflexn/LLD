package observable;

import observer.NotificationAlertObserver;

import java.util.List;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber(List<NotificationAlertObserver> observerList);

    public void setStockCount(int stockCount);

    public int getStockCount();
}
