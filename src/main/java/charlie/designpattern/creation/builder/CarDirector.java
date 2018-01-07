package charlie.designpattern.creation.builder;

/**
 * Created by charlie on 07/01/2018.
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build() {
        carBuilder.buildBodyStyle();
        carBuilder.buildBreaks();
        carBuilder.buildEngine();
        carBuilder.buildFuelType();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildWindows();
    }
}
