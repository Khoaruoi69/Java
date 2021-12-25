public class T2{
  public static void main(String[] args){
      Person2 a = new Person2();
      a.name = " jocker";
      a.height = 1.8f;
      a.age = 35;
     
      a.eat("Rice");
      int age = a.getAge();
System.out.println("His age: " + age);
}
}