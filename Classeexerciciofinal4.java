final class conversortemperatura{
    public double celsiusparafahrenhit(double temperatura){
        return (temperatura * 1.8) + 32;
    }
}
public class Classeexerciciofinal4 {
    public static void main(String[] args) {
        conversortemperatura cvt = new conversortemperatura();
        double celsius = 25;
        double farenheit = cvt.celsiusparafahrenhit(celsius);
        System.out.println(celsius + "°C equivalem a " + farenheit + "°F.");
    }
}
