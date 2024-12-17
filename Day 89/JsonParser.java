import com.google.gson.Gson;

class User {
    private String name;
    private int age;
    private String city;

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
}

public class JsonParser {
    public static void main(String[] args) {
        String jsonString = 
            "{ \"name\": \"John Doe\", \"age\": 25, \"city\": \"New York\" }";

        System.out.println("JSON Input:");
        System.out.println(jsonString);

        Gson gson = new Gson();
        User user = gson.fromJson(jsonString, User.class);

        System.out.println("\nParsed Data:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("City: " + user.getCity());
    }
}
