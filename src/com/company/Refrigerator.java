package com.company;

public class Refrigerator extends Appliances {
    private int volumeRefCamera;
    private String energyClass;
    private int volumeFreezer;
    private String freshnessZone;



    public Refrigerator(int number, String brand, String model, String colour, String size, int price, int volumeRefCamera, String energyClass, int volumeFreezer, String freshnessZone) {
        super(number, brand, model, colour, size, price);
        this.volumeRefCamera = volumeRefCamera;
        this.energyClass = energyClass;
        this.volumeFreezer = volumeFreezer;
        this.freshnessZone = freshnessZone;
    }


    public int getVolumeRefCamera() {
        return volumeRefCamera;
    }

    public void setVolumeRefCamera(int volumeRefCamera) {
        this.volumeRefCamera = volumeRefCamera;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public int getVolumeFreezer() {
        return volumeFreezer;
    }

    public void setVolumeFreezer(int volumeFreezer) {
        this.volumeFreezer = volumeFreezer;
    }

    public String getFreshnessZone() {
        return freshnessZone;
    }

    public void setFreshnessZone(String freshnessZone) {
        this.freshnessZone = freshnessZone;
    }


    @Override
    public String toString () {
        return "\t" + getNumber() + ") " + "brand: " + getBrand() + " model: " + getModel() + " colour: " + getColour() + " size(ВxШxГ): " + getSize() + " price(грн): " + getPrice()  + " volumeRefCamera(л) " + volumeRefCamera +
                " energyClass " + energyClass +
                " volumeFreezer(л) " + volumeFreezer +
                " freshnessZone " + freshnessZone  + "\n";
            }

    }
