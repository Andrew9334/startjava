public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setNickname("Buddy");
        wolf.setWeight(50);
        wolf.setAge(7);
        wolf.setColor("Gray");

        char sex = wolf.getSex();
        String nickname = wolf.getNickname();
        int weight = wolf.getWeight();
        int age = wolf.getAge();
        String color = wolf.getColor();

        System.out.println("Пол - " + sex + ", \n" +
                "кличка - " + nickname + ", \n" +
                "вес - " + weight + ", \n" +
                "возраст - " + age + ", \n" +
                "окрас - " + color);
    }
}