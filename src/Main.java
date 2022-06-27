public class Main {
    public static void main(String[] args) {

        BmiService sevice = new BmiService();

        float weightKg = 84;
        float heightM = 1.78F;
        float bmi = sevice.calculate(weightKg, heightM);

        System.out.println("Индекс массы тела равен: " + bmi);
    }

}