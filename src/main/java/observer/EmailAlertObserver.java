package observer;

import observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    StocksObservable stocksObservable;
    String emailId;
    public EmailAlertObserver(String emailId,StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable; //this is required to get an Update from observable concrete class.
                                                 // the update is there in observable whther iphone is available or not so
                                                // an injection of the observable interface is required. we achieved it using constructor injection here.
    }
    @Override
    public void update() {
       sendEmail(emailId,"Product is in stock.Hurry up "+ stocksObservable.getStockCount()+ "Only available !!");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("Email sent to user: "+ emailId);
    }
}
