public class Animal {
    private static int animalCount = 0;
    private final int animalNumber;
    private String name;
    protected String description;

    public Animal(String name, String description) {
        this.animalNumber = ++animalCount;
        this.name = name;
        this.description = description;
    }

    public final void rename(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return String.format("Animal #%d: %s%nName: %s%nDescription: %s",
                animalNumber, getClass().getSimpleName(), name, description);
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}