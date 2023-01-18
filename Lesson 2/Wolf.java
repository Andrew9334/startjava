public class Wolf {
    private char sex;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public String getNickname() {
        return nickname;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    
    void walk() {
        System.out.println("Идет");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void runAway() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    void hunt() {
        System.out.println("Охотится");
    }
}