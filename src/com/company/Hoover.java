package com.company;

public class Hoover extends Appliances {
    private String type;
    private double dustCollectorVolume;
    private int power;
    private String outputFilter;



    public Hoover(int number, String brand, String model, String colour, String size, int price, String type, double dustCollectorVolume, int power, String outputFilter) {
        super(number, brand, model, colour, size, price);
        this.type = type;
        this.dustCollectorVolume = dustCollectorVolume;
        this.power = power;
        this.outputFilter = outputFilter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDustCollectorVolume() {
        return dustCollectorVolume;
    }

    public void setDustCollectorVolume(double dustCollectorVolume) {
        this.dustCollectorVolume = dustCollectorVolume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getOutputFilter() {
        return outputFilter;
    }

    public void setOutputFilter(String outputFilter) {
        this.outputFilter = outputFilter;
    }

    @Override
    public String toString() {
        return "\t" + getNumber() + ") " + "brand: " + getBrand() + " model: " + getModel() + " colour: " + getColour() + " size(ВxШxГ): " + getSize() + " price(грн): " + getPrice() +
                " type " + type +
                " dustCollectorVolume " + dustCollectorVolume +
                " power " + power +
                " outputFilter " + outputFilter + "\n";
    }
}
