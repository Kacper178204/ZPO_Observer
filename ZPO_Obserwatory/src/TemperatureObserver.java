import java.util.ArrayList;

public class TemperatureObserver implements ObserverTemperature{

    @Override
    public void update(ArrayList<Double> Temperatures) {
        double Min = Temperatures.get(0);
        double Max = Temperatures.get(0);
        double Mean = 0;
        for(int i = 0;i<Temperatures.size();i++)
        {

            if(Min > Temperatures.get(i)){
                Min = Temperatures.get(i);
            }
            if(Max < Temperatures.get(i)){
                Max = Temperatures.get(i);
            }
            Mean += Temperatures.get(i);

        }
        Mean /= Temperatures.size();
        System.out.println("Minimalna wartosc: "+ Min + " Maksymalna wartosc: "+ Max + ", srednia: "+ Mean);

    }
}
