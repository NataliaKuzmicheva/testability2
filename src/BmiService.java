public class BmiService {

    //ИМТ = масса / рост^2//

    public double calculate(int weightKilo, double heightMetres) {
        double bmi = weightKilo / (heightMetres * heightMetres);
        return bmi;

    }
}
