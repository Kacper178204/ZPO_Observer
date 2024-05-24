public class PressureObserver implements ObserverPressure {

    @Override
    public void update(double previousPressure, double currentPressure) {
        if (currentPressure > previousPressure) {
            System.out.println("Pogoda się polepsza.");
        } else if (currentPressure < previousPressure) {
            System.out.println("Pogoda się pogarsza.");
        } else {
            System.out.println("Pogoda pozostaje bez zmian.");
        }

    }
}
