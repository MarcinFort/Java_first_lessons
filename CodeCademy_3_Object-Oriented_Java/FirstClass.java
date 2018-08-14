class Dog {

    // A class parameter

    int age;

    // This is a class constructor. The constructor allows us to make class
    // instances. We can also add additional information about the class. If you do
    // not define a constructor, one will be added by default, but it won't be
    // possible to add any information about the class:

    public Dog(int dogsAge) {
        age = dogsAge;
    }

    // A class method. 'Void' means that the method does not return anything

    public void bark() {
        System.out.println("Woof!");
    }

    public void run(int feet) {
        System.out.println("Your dog ran " + feet + " feet!");
    }

    // A class method which returns an integer

    public int getAge() {
        return age;
    }

    // This is the main method. Each Java class has a main method. When a Java
    // program is run, code in the main method is executed.

    public static void main(String[] args) {
        Dog spike = new Dog(5);
        System.out.println(spike);
        spike.bark();
        spike.run(6);
        int spikeAge = spike.getAge();
        System.out.println(spikeAge);
    }

}