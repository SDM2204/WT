class faculty 
 {
     int id;
     String name;
     String gender;
    public static String college = "KIIT";

    public faculty(int id, String name, String gender) 
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    int getId() 
    {
        return id;
    }

     String getName()
    {
        return name;
    }

     String getGender() 
{
        return gender;
    }
    public static void setCollege(String newCollege) 
    {
        college = newCollege;
    }

    public static String getCollege() 
    {
        return college;
    }

    public static void main(String[] args) 
    {
        // Change the name of the college to "KIIT-SCE"
        faculty.setCollege("KIIT-SCE");

        // Create and initialize three objects
        faculty faculty1 = new faculty(1, "John", "Male");
        faculty faculty2 = new faculty(2, "Sarah", "Female");
        faculty faculty3 = new faculty(3, "Mike", "Male");

        // Print the values of three objects
        System.out.println("College: " + faculty.getCollege());
        System.out.println("faculty 1 - ID: " + faculty1.getId() + ", Name: " + faculty1.getName() + ", Gender: " + faculty1.getGender());
        System.out.println("faculty 2 - ID: " + faculty2.getId() + ", Name: " + faculty2.getName() + ", Gender: " + faculty2.getGender());
        System.out.println("faculty 3 - ID: " + faculty3.getId() + ", Name: " + faculty3.getName() + ", Gender: " + faculty3.getGender());
      }
}     