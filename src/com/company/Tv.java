package com.company;

public class Tv extends Appliances {
    private int screenDiagonal;
    private String screenResolution;
    private String smartPlatform;
    private String imageProcessor;



    public Tv(int number, String brand, String model, String colour, String size, int price, int screenDiagonal, String screenResolution, String smartPlatform, String imageProcessor) {
        super(number, brand, model, colour, size, price);
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
        this.smartPlatform = smartPlatform;
        this.imageProcessor = imageProcessor;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getSmartPlatform() {
        return smartPlatform;
    }

    public void setSmartPlatform(String smartPlatform) {
        this.smartPlatform = smartPlatform;
    }

    public String getImageProcessor() {
        return imageProcessor;
    }

    public void setImageProcessor(String imageProcessor) {
        this.imageProcessor = imageProcessor;
    }

    @Override
    public String toString() {
        return "\t" + getNumber() + ") " + "brand: " + getBrand() + " model: " + getModel() + " colour: " + getColour() + " size(ВxШxГ): " + getSize() + " price(грн): " + getPrice() +
                " screenDiagonal: " + screenDiagonal +
                " screenResolution: " + screenResolution +
                " smartPlatform: " + smartPlatform +
                " imageProcessor: " + imageProcessor + "\n";
    }
}
