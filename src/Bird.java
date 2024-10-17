public class Bird {

    //attributes or [data] fields
    private String name;
    private int size;

    // constructors
    public Bird(String n, int s) {
        this.name = n;
        size = s;

    }
    public Bird(){  //default
        name = "Bob";
        size = 20;
    }
    public Bird(String n){      // name only
        name = n;
        size = 20;
    }
    public Bird(int s){     // size only
        name = "Bob";
        size = s;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }
    public void setName(String n) {
        name = n;
    }

    //public methods
    public void speak(){        // "doit method"
        System.out.println("Peep-Peep!");
    }
    public void move(){
        System.out.println("Fly!");
    }
    //return methods
    public int getAge(){
        return 8;
    }
    public double mult2nums(double a, double b){    // formal params
        return a*b;
    }

    public String toString(){
        return super.toString() +" Name: " + name + " Size: " + size + " Age: " + getAge();
    }
}
