public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal("Слон", "большой слон");
        Animal zebra = new Animal("Зебра", "живет в Африке");
        Fish catFish = new Fish("Сом", "рыба");

        System.out.println(elephant);
        System.out.println(zebra);
        System.out.println(catFish);
        System.out.println(catFish.toString());
        elephant.rename("Глория");
        System.out.println(elephant);

    }
}