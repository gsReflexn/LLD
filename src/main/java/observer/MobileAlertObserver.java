package observer;

import observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String mobileNo;
    StocksObservable stocksObservable;

    public MobileAlertObserver(String mobileNo,StocksObservable stocksObservable){
        this.mobileNo=mobileNo;
        this.stocksObservable=stocksObservable;
    }
    @Override
    public void update() {
        System.out.println("Notification sent on mobileNo. "+ mobileNo);
    }
}
