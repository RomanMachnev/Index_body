public class Bmiservice {
    public double calculate(double height, double weight){
        double index = weight / (height * height);
        return index;

    }
}
