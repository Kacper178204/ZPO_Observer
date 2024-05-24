import java.util.ArrayList;

public class WeatherStatistics implements SubjectTemperature {
    private double temperature;
    ArrayList<Double> Temperatures;
    ArrayList<ObserverTemperature> observers;

    public WeatherStatistics(double temperature){
        this.temperature = temperature;
        this.observers = new ArrayList<ObserverTemperature>();
        this.Temperatures = new ArrayList<Double>();
        this.Temperatures.add(this.temperature);
    }

    public void updateTemperature(double temperature){
        this.Temperatures.add(temperature);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverTemperature o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverTemperature o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(ObserverTemperature o : observers){
            o.update(this.Temperatures);
        }
    }
}

