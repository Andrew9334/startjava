public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'f';
        wolf.nickname = "Mila";
        wolf.weight = 50;
        wolf.age = 10;
        wolf.color = "gray";

        System.out.println("Пол - " + wolf.sex + ",\n" + 
                "кличка - " + wolf.nickname + ",\n" + 
                "вес - " + wolf.weight + ",\n" +
                "возраст - " + wolf.age + ",\n" + 
                "окрас - " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.runAway();
        wolf.howl();
        wolf.hunt();
    }
}