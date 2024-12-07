class Students{
    String name;
    String work;
    void display()
    {
        System.out.println("my goool");

    }
    void volt()
    {
        System.out.println(this.name);
        System.out.println(this.work);
    }
}
public class card {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "aashu";
        s1.work = "painter";
        s1.display();
        s1.volt();
    } 
    
}
