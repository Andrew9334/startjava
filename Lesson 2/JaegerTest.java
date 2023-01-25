public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", "Mark-1",
                "Russia", 85.34f, 2.412f);

        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Japan");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2.312f);

        System.out.print(jaegerTwo);

        System.out.println("\nМодель - " + jaegerOne.getModelName() + ", \n" +
                "Марка - " + jaegerOne.getMark() + ", \n" +
                "Страна производитель - " + jaegerOne.getOrigin() + ", \n" +
                "Высота робота - " + jaegerOne.getHeight() + ", \n" +
                "Вес робота - " + jaegerOne.getWeight() + '\n');

        jaegerOne.attack();
        jaegerOne.runAway();
        jaegerOne.rest();
        System.out.println();
        jaegerTwo.attack();
        jaegerTwo.runAway();
        jaegerTwo.rest();
    }
}
