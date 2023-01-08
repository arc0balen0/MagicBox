public class Main {

    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(6);//создание массива данных имеющий размер 6;

        stringMagicBox.add("1");
        stringMagicBox.add("2");
        stringMagicBox.add("6");
        stringMagicBox.add("9");
        stringMagicBox.add("35");
        stringMagicBox.add("98");

        String pick = stringMagicBox.pick();

        System.out.println(pick);// вывод метода pick

    }
}
