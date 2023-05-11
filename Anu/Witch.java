public class Witch extends Enemy {

    Witch(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.name + " Terbang mengendarai sapu jagat");
    }    
}