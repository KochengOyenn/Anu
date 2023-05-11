public class Fighter extends Hero {

    Fighter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.print(this.name + " Bergerak dengan cepat");
    }
}
