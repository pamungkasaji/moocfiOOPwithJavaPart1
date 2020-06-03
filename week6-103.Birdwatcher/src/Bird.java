/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Bird {

    private String name;
    private String latinName;
    private int observedCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observedCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservedCount() {
        return observedCount;
    }

    public void addObserved() {
        observedCount++;
    }
}
