package charlie.designpattern.creation.builder;

import org.junit.Test;

/**
 * Created by charlie on 07/01/2018.
 */
public class TestBuilderPattern {

    @Test
    public void testMethod() {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.build();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SprotsCarBuilder();
        carDirector = new CarDirector(carBuilder);
        carDirector.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
