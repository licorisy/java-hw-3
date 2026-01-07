public class BmiService {
    public double calculate(double height, double weight) {
        double result = weight / (height * height);
        int trueResult = (int) result;
        return trueResult;
    }
}
