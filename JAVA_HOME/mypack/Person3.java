package mypack;

public class Person3{
              public String name;
              public float height;
              public int age;

              public Person3( String name, int age,float height){
                     this.name = name;
                     this.height = height;
                     this.age=age;
}
              public void eat(String foodName){
                     System.out.println(name + " is eating" + foodName);
}
              public int getAge() {
                     return age;
}
}
