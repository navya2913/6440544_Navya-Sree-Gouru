public class student {
    private int id;
    private String name;
    private int age;

    // Constructors
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student(int id, String name, int age) {
        this(name, age);
        this.id = id;
    }

    // Getters
    public int getId() { 
        return id; 
    }
    public String getName() {
         return name; 
        }
    public int getAge() { 
        return age; 
    }

    // Setters
    public void setId(int id) {
         this.id = id; 
        }
    public void setName(String name) { 
        this.name = name;
     }
    public void setAge(int age) {
         this.age = age;
         }
}
