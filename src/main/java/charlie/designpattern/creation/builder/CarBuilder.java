package charlie.designpattern.creation.builder;

/**
 * Created by charlie on 07/01/2018.
 */
public interface CarBuilder {
    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
    Car getCar();
}
