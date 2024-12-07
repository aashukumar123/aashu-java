
class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int,String ){  
       System.out.println(this.id);
      System.out.println(this.name);    
    }  

    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4();  
     s1.id = 45;
    
    s1.name = "aashu";
    Student4 s2 = new Student4();
    s2.id = 46;
    s2.name = "aashu";
    //calling method to display the values of object  
    s1.Student4(id,name);
   }  
}  
