public class Pet {
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet()
    {
        name = "unknown";
        age = 0;
        weight = 0;
        type = "unknown";
        breed = "unknown";

    }
    public Pet(String n, int a, double w,String t,String b)
    {
        name = n;
        age=a;
        weight=w;
        type=t;
        breed=b;
    }
    
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getType()
    {
        return type;
    }

    public String getBreed()
    {
        return breed;
    }
    
}
