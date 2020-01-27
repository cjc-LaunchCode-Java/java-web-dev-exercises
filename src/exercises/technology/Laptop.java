package exercises.technology;

public class Laptop extends Computer {
    private Double memory;

    public Laptop(String ownerName, String operatingSystem, Boolean touchscreen, Double memory){
        super(ownerName,operatingSystem,touchscreen);
        this.memory = memory;
    }


    //getter
    public Double getMemory() {
        return memory;
    }

    //setter
    public void setMemory(Double memory) {
        this.memory = memory;
    }


    public String addMemory(Double memory){
        this.memory += memory;
        return "Memory has been upgraded to " + memory + ".";
    }
}
