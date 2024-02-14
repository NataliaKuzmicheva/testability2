public class BmiService {

    //ИМТ = масса / рост^2//

    public int calculate(int weightKilo, double heightMetres) {
        int bmi = (int) (weightKilo / (heightMetres * heightMetres));
        return bmi;

    }
}
