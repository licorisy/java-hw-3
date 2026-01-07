public class main2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double bodyMassIndex = service.calculate(height, weight); // должно получиться 500
        System.out.println(bodyMassIndex);
    }
}
