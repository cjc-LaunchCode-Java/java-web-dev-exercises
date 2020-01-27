package exercises.technology;

public class Computer {
    private String ownerName;
    private String operatingSystem;
    private Boolean touchscreen;

    public Computer(String ownerName, String operatingSystem, Boolean touchscreen){
        this.ownerName = ownerName;
        this.operatingSystem = operatingSystem;
        this.touchscreen = touchscreen;
    }

    public String updateOperatingSystem(String newOperatingSystem){
        this.operatingSystem = newOperatingSystem;
        return ownerName + "'s new operating system is " + operatingSystem + ".";
    }
    public String updateOwner(String newOwner){
        this.ownerName = newOwner;
        return ownerName + " now owns this computer.";
    }
    public String boughtNewScreen (Boolean touchscreenStatus){
        this.touchscreen = touchscreenStatus;
        if(touchscreen){
            return ownerName + "'s new screen is a touchscreen.";
        } else {
            return ownerName + "'s new screen is NOT a touchscreen.";
        }
    }

    @Override
    public String toString(){
        if(touchscreen){
            return ownerName + "'s new operating system is " + operatingSystem + " and it is a touchscreen.";
        } else {
            return ownerName + "'s computer's operating system is " + operatingSystem + ", and it is NOT a touchscreen.";
        }
    }


    //getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Boolean getTouchscreen() {
        return touchscreen;
    }

    //setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setTouchscreen(Boolean touchscreen) {
        this.touchscreen = touchscreen;
    }
}
