package org.example.designpatterns.behavioural.observer;

import org.example.designpatterns.behavioural.observer.observable.CricketLiveScoreObservable;
import org.example.designpatterns.behavioural.observer.observable.Observable;

public class Client {

    public static void main(String[] args) {

        Observable cricketLiveScoreObservable = new CricketLiveScoreObservable();
        cricketLiveScoreObservable.add(new MobileObserver(98757568, cricketLiveScoreObservable));
        cricketLiveScoreObservable.add(new TelivisionObserver(72282, cricketLiveScoreObservable));
        cricketLiveScoreObservable.setData(20);
    }
}
