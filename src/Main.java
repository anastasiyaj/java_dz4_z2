public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 60;
        double growth = 1.6;
        double bmi = service.calculate(mass,growth);
        System.out.println("индекс массы тела = " + bmi);
    }
}