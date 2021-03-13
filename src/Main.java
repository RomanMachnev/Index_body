        public class Main {
        public static void main(String[] args) {
            Bmiservice service = new Bmiservice();
            double height = 1.85;
            double weight = 94;
            double index = service.calculate(height, weight);
            System.out.println(" индекс массы тела" + "=" + index);
        }
    }


