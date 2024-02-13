public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilo = 98; //вес человека, кг
        double heightMetres = 1.87; //рост человека, м
        double index = service.calculate(weightKilo, heightMetres); // должно получиться 28
        System.out.println("Индекс массы тела " + (int) index);
    }
}
