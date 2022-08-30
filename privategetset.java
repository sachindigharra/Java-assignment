class employee{
    private String name;
 private int age;
 public int getAge() {
 return age;
 }
 public void setAge(int age) {
 this.age = age;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
}
public class privategetset {
    public static void main(String[] args) {
        employee harry = new employee();
         harry.setAge(17);
         harry.setName("sachin");
        String n=harry.getName();
        System.out.println(n);
        int id=harry.getAge();
        System.out.println(id);

        
    }
    
}
