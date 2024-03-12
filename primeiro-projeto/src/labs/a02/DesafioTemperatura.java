package labs.a02;

public class DesafioTemperatura {

    public static void main(String[] args) {

        double temperaturaCelsius = 30;

        double temperaturaFahrenheit = (int) ((temperaturaCelsius * 1.8) + 32);

        System.out.println(String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit.",
                temperaturaCelsius, temperaturaFahrenheit));

        int temperaturaFahrenheitInteira = (int) ((temperaturaCelsius * 1.8) + 32);
        
        System.out.println(String.format("A temperatura em Fahrenheit inteira é %dºF", temperaturaFahrenheitInteira));
    }
}
