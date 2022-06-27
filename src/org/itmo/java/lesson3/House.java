package org.itmo.java.lesson3;

public class House {
    private Integer floors;
    private Integer buildingYear;
    private String name;

    public void setInfo(Integer floors, Integer buildingYear, String name) {
        this.floors = floors;
        this.buildingYear = buildingYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", buildingYear=" + buildingYear +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getBuildingAge(Integer year) {
        return year - buildingYear;
    }
}
