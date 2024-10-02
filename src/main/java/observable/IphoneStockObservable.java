package observable;

import observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver observer) {
      notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscriber(List<NotificationAlertObserver> observerList) {
        for(NotificationAlertObserver obj:observerList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newAddedStockCount) {
        if(stockCount==0 && newAddedStockCount>0){
            //if newAddedStockCount is greater then 0 then only send the notification
            notifySubscriber(notificationAlertObserverList);
        }
        stockCount=newAddedStockCount;
    }

    @Override
    public int getStockCount() {
       return stockCount;
    }
}
