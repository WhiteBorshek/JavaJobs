package JavaJobs;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Subject {
    private List<Observer> observers;

    public JobAgency() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(arg);
        }
    }
}

