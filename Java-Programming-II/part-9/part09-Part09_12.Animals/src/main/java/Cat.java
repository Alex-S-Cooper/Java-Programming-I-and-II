public class Cat extends Animal implements NoiseCapable {
    
    public Cat(String name) {
        super(name);
    }
    
    public Cat() {
        super("Cat");
    }
    
    public void purr() {
        System.out.println(super.name + " purrs");
    }
    
    public void makeNoise() {
        this.purr();
    }
}
