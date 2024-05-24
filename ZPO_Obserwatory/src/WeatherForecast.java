import java.util.ArrayList;

public class WeatherForecast implements SubjectPressure{
    private double previousPressure;
    private double currentPressure;
    ArrayList<ObserverPressure> observers;


    public WeatherForecast(double initialPressure) {
        this.previousPressure = initialPressure;
        this.currentPressure = initialPressure;
        this.observers = new ArrayList<ObserverPressure>();
    }

    public void updatePressure(double newpressure){
        previousPressure = currentPressure;
        currentPressure = newpressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverPressure o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverPressure o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(ObserverPressure o : observers){
            o.update(previousPressure, currentPressure);        }
    }

    public String predictWeather(){
        if (currentPressure > previousPressure) {
            return "Pogoda się polepsza.";
        } else if (currentPressure < previousPressure) {
            return "Pogoda się pogarsza.";
        } else {
            return "Pogoda pozostaje bez zmian.";
        }
    }
}
