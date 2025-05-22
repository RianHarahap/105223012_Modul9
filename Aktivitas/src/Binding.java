class Animal {
    static void suara() {
        System.out.println("suara hewan");
    }

    void makan () {
        System.out.println("makan");
    }
}

class Dog extends Animal {
    @Override
    void makan () {
        System.out.println("anjing daging");
    }
}

public class Binding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();
        a.makan();//static gaperlu buat object dari class animal

        a.makan();

        Animal b = new Dog();
        b.makan();
    }
}