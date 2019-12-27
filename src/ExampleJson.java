import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class RPerson {
    private String name;
    private int age;
    private List<String> town = new ArrayList<>();

    public RPerson(String name, int age, List<String> town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public String toString() {
        return "RPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", town=" + town +
                '}';
    }
}

public class ExampleJson {

    public static void main(String[] args) {
        RPerson rPerson1 = new RPerson("Алексей", 37, Arrays.asList("Москва", "Дубаи"));
        System.out.println(rPerson1.toString());

        Gson gson = new Gson();
        String string = gson.toJson(rPerson1);
        System.out.println(string);

        RPerson rPerson2 = gson.fromJson(string, RPerson.class);
        System.out.println(rPerson2.toString());
    }
}
