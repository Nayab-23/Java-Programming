public class Dog {
    int weightinPounds ;

    public void setWeightinPounds(int weightinPounds) {
        this.weightinPounds = weightinPounds;
    }

    // CONSTRUCTOR
    public Dog(int weightinPounds) {
        this.weightinPounds = weightinPounds ;
    }
    public void makeNoise(){
        System.out.println("Bark");

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(52) ;
        Dog dog2 = new Dog(48);
        dog1.makeNoise();
        dog2.makeNoise();

    }
}
