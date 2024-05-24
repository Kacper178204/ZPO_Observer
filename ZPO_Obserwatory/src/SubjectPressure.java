public interface SubjectPressure {
        public void registerObserver(ObserverPressure o);
        public void removeObserver(ObserverPressure o);
        public void notifyObservers();

}
