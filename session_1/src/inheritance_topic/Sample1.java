package inheritance_topic;

//Heriarchial inheritance

//Parent
class Animal{
    int age;
    String name;

    void animal_Details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

//child class --dog, cat, brid
class Dog extends Animal{
    String breed;
    void dogDetails(){
        System.out.println("Breed: "+breed);
    }
}
class Cat extends Animal{
    String color;
    void catDetails(){
        System.out.println("Cat color: "+color);
    }
}
class Birds extends Animal{
    int wingspan;
    void birdDetails(){
        System.out.println("WingSpan: "+wingspan);
    }
}
public class Sample1 {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.breed="Labrador";
        d.name="tufy";
        d.age=2;
        d.animal_Details();
        d.dogDetails();

        Cat c=new Cat();
        c.color="white";
        c.name="tommy";
        c.age=2;
        c.animal_Details();
        c.catDetails();
    }
}
