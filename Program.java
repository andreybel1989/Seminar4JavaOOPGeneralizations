public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * 
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
     * по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес
     * одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить
     * текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в
     * противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
     * другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
     * апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую
     * перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple1 = new Box<>();
        Box<Orange> boxOrange1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();

        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);
        boxApple1.addFruit(apple);

        boxApple2.addFruit(apple);
        boxApple2.addFruit(apple);
        boxApple2.addFruit(apple);
        boxApple2.addFruit(apple);

        boxOrange1.addFruit(orange);
        boxOrange1.addFruit(orange);
        boxOrange1.addFruit(orange);
        boxOrange1.addFruit(orange);
        

        System.out.println("Масса апельсина " + orange.getWeight());
        System.out.println("Масса яблока " + apple.getWeight());
        System.out.println("Масса первой коробки с яблоками " + boxApple1.getWeight());
        System.out.println("Масса второй коробки с яблоками " + boxApple2.getWeight());
        System.out.println("Масса первой коробки с апельсинами " + boxOrange1.getWeight());

        System.out.println("Масса коробок " + (boxApple1.compare(boxOrange1) ? "равна" : "различна"));

        boxApple1.giveAwayFruitsTo(boxApple2);

        System.out.println("Масса первой коробки с яблоками " + boxApple1.getWeight());
        System.out.println("Масса второй коробки с яблоками " + boxApple2.getWeight());
    }

}
