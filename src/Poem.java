import java.io.FileWriter;
import java.io.IOException;
public class Poem {
    private String name;
    private String poet;
    public Poem() {
        name = "unknown";
        poet = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "name='" + name + '\'' +
                ", poet='" + poet + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Poem poem1 = new Poem();
        poem1.setName("Eating pancakes");
        poem1.setPoet("Savion Plater");

        Poem poem2 = new Poem();
        poem2.setName("Baking pancakes");
        poem2.setPoet("Savion Plater");

        Poem poem3 = new Poem();
        poem3.setName("Eat some bacon with some pancakes");
        poem3.setPoet("Savion Plater");

        Poem[] poems = { poem1, poem2, poem3 };

        try (FileWriter writer = new FileWriter("poems.txt")) {
            for (Poem poem : poems) {
                writer.write(poem.getName() + "\n");
                writer.write(poem.getPoet() + "\n");
                writer.write("\n");
            }
            System.out.println("Poem information has been written to 'poems.txt'.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
}