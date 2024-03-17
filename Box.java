import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            float weight = 0;
            for (T fruit : fruits) {
                weight += fruit.getWeight();
            }
            return weight;
        }
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        if (this.getWeight() == otherBox.getWeight()) {
            return true;
        } else {
            return false;
        }

    }

    public void giveAwayFruitsTo(Box<T> otherBox) {
        if (this.fruits.equals(otherBox.fruits)) {
            System.out.println("вы взяли одну и ту же коробку");
            return;
        }
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear();
        System.out.println("Вы пересыпали фрукты из первой коробки во вторую");
    }
}
