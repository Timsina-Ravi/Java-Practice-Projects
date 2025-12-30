class Details{
   public int age;
   public String name;
   public String grade;

}







public class Student {
    public static void main(String[] args){
        Details details = new Details();
        details.age = 20;
        details.name = "Ravi";
        details.grade = "12";
        System.out.println("Age: " + details.age + " Name: " + details.name + " Grade: " + details.grade);
    }



}
