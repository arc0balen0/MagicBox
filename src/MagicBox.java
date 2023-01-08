import java.util.Random;

public class MagicBox<T> {//класс MagicBox - является дженериком;

    T[] items;// инициализация переменной items;

    public MagicBox(int size) {//публичныый метод MagicBox;
        items = (T[]) new Object[size];

    }

    public boolean add(Object obj) {//добавление значений, чтобы это реализовать необходио пройтись по массиву;
        for (int i = 0; i < items.length; i++) {//отсчет от 0 и проходим весь цикл;
            if (items[i] == null) {//если items[i] == 0, тогда items[i] = (T) obj;
                items[i] = (T) obj;
                return true;//на экран будет выведено true;

            }
        }
        return false;// в другом случае будет выведено false;
    }

    public T pick() {//публичный дженерик pick;
        check();
        Random random = new Random();//инициализация переменной new Random;
        return items[random.nextInt(items.length)];//возвращается items - рандомное значение длины items;
    }

    private void check() {//проверка check;
        for (int i = 0; i < items.length; i++) {//счетчик проходит значение всего массивна;
            if (items[i] == null) {
                throw new RuntimeException(String.format("Массив не заполнен, осталось %d элемент(ов)", items.length - i));

            }
        }
    }
}