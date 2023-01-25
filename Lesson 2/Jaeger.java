public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;

        System.out.println("Модель - " + modelName + ", \n" +
                "Марка - " + mark + ", \n" +
                "Страна производитель - " + origin + ", \n" +
                "Высота робота - " + height + ", \n" +
                "Вес робота - " + weight);
    }

    public String getModelName(String modelName) {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark(String mark) {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin(String origin) {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight(float height) {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight(float weight) {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void attack() {
        System.out.println("Атакуем противника");
    }

    void runAway() {
        System.out.println("Бежим!");
    }

    void rest() {
        System.out.println("Отдыхаем");
    }
}
