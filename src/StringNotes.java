import static java.lang.System.out;

public class StringNotes {

    public static void main(String[] args){

        //Strings -- immutable
        // no modifier methods
        String name = "Mr. Black";
//        name = "Alex";
        String teacher = new String("Mr. Black");
        String school = new String("All Saints");

        out.println(teacher.charAt(1));

        out.println(name.length());
        out.println(school.substring(5));
        out.println(school.substring(2,7));

        out.println(name.indexOf("Block"));
        out.println(school.indexOf("l"));
        out.println(school.lastIndexOf("l"));

        //comparisons
        out.println(teacher == school); //bad
        out.println(teacher == name);   //bad
        out.println(school == "All Saints");    //bad

        out.println(name.equals(teacher));
        out.println(school.equals(name));
        out.println("All Saints".equals(school));

        out.println(name.compareTo( school));//out of order -- positive val
        out.println(school.compareTo( name));//in order -- negative val
        teacher = "Mr. Black's Cat";
        out.println(name.compareTo(teacher));
        out.println(teacher.compareTo(name));

        // concatenation
        out.println(school + " School");

        // parsing numeric strings to numeric values
        String strNum = "123";
        String strNum2 = "456";
        int num1 = Integer.parseInt(strNum);
        int num2 = Integer.parseInt(strNum2);
        out.println( strNum + strNum2);
        out.println( num1 + num2);
        double val1 = Double.parseDouble(strNum);
        String ans = "yes";
        boolean answer = Boolean.parseBoolean(ans);
        String bob = "" + num1;

        out.println(school.toUpperCase())   ;
        out.println(school.replaceAll("l","abc"));


    }
}
