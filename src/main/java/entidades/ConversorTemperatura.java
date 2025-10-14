package entidades;

public class ConversorTemperatura {

    public float celAfahr(float celsius){
        float rest = celsius * 9/5;
        return rest + 32;
    }

    public float farhAcel(float fahrenheit){
        float rest = fahrenheit - 32;
        return rest * 5/9;
    }

}
