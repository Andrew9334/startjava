public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark-1",
                "Russia", 85.34f, 2.412f);

        String modelName = jaegerTwo.getModelName("Coyote Tango");
        String mark = jaegerTwo.getMark("Mark-1");
        String origin = jaegerTwo.getOrigin("Japan");
        float height = jaegerTwo.getHeight(85.34f);
        float weight = jaegerTwo.getWeight(2.312f);

        System.out.println("\nМодель - " + modelName + ", \n" +
                "Марка - " + mark + ", \n" +
                "Страна производитель - " + origin + ", \n" +
                "Высота робота - " + height + ", \n" +
                "Вес робота - " + weight + '\n');

        jaegerOne.attack();
        jaegerOne.runAway();
        jaegerOne.rest();
        System.out.println();
        jaegerTwo.attack();
        jaegerTwo.runAway();
        jaegerTwo.rest();
    }
}
