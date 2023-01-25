public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark-1",
                "Russia", 85.34f, 2.412f);

        System.out.println("\nМодель - " + jaegerTwo.getModelName("Coyote Tango") + ", \n" +
                "Марка - " + jaegerTwo.getMark("Mark-1") + ", \n" +
                "Страна производитель - " + jaegerTwo.getOrigin("Japan") + ", \n" +
                "Высота робота - " + jaegerTwo.getHeight(85.34f) + ", \n" +
                "Вес робота - " + jaegerTwo.getWeight(2.312f) + '\n');

        jaegerOne.attack();
        jaegerOne.runAway();
        jaegerOne.rest();
        System.out.println();
        jaegerTwo.attack();
        jaegerTwo.runAway();
        jaegerTwo.rest();
    }
}
