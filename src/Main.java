public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //shortcuts
        int x = 5;

        x += 10;    // x = x + 10;
        System.out.println(x);

        x++;    // adds 1 to x
        System.out.println(++x);

        System.out.println(x);

        x += x++ + ++x; //don't do this!
        System.out.println(x);


        //instantiate
        Bird tweety = new Bird();
        tweety.speak(); //call the speak method
        tweety.speak();
        tweety.speak();
        tweety.move();
        Bird woody = new Bird("woody",5);
        woody.speak();

        tweety.speak();
        System.out.println(tweety.getAge());
        System.out.println(woody.getName());
        System.out.println(woody.mult2nums(5,10));  //actual params

        MyLibrary.printHeading();

        //String.format()
        double ans = MyLibrary.mult2nums(5,10);
        System.out.println("the amount you owe is " +String.format("%.2f",ans));//f = floats/doubles
                            // d = integers
                            // s = strings
        System.out.println(String.format("%6d",125));
        System.out.println(String.format("%-6d",125) + "more stuff");
        System.out.println(String.format("%06d",125));

        String output = ""+tweety;
        System.out.println(output);

    }
}