import mypack.Person3;
public class T3{
  public static void main(String[] args){
      Person3 a = new Person3("jocker",21,1.65f);
  
      a.eat("Rice");
      int age = a.getAge();
System.out.println("His age: " + age);
}
}