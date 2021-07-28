package Streams;

public class CarrosAntigos  {
    private final String brandCar;
    private final int yearManufactured;

    CarrosAntigos(String brand, int year) {
        this.brandCar = brand;
        this.yearManufactured = year;
    }

    @Override
    public String toString() {
        return brandCar + " " + yearManufactured;
    }

    public int getYearManufactured () {
        return yearManufactured;
    }

    public String getBrandCar() {
        return brandCar;
    }


}
