public interface SubjectTemperature {
    public void registerObserver(ObserverTemperature o);
    public void removeObserver(ObserverTemperature o);
    public void notifyObservers();
}
