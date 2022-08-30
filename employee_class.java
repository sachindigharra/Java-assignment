class employee{
    // create a method
    public int get_salary(int salary){
        return salary;
    }
    public String getName(String name){
        return name;
    }
  
   

}
public class employee_class {
    public static void main(String[] args) {
      employee human =new employee();
      String he=human.getName("premnivas sharma");
      System.out.println(he);


       int income=human.get_salary(100000);
       System.out.println(income);



      employee member=new employee();
      String bro= member.getName("kitta sharma");
      System.out.println(bro);


      int tankha=member .get_salary(60000);
      System.out.println(tankha);


        //display the attribute
        //System.out.println(harry.id);
        //System.out.println(harry.name);
        
    }
    
}
