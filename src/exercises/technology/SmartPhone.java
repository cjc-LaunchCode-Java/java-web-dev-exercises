package exercises.technology;

public class SmartPhone extends Computer {
    private Boolean protectiveCase;

    public SmartPhone(String ownerName, String operatingSystem, Boolean touchscreen, Boolean protectiveCase) {
        super(ownerName, operatingSystem, touchscreen);
        this.protectiveCase = protectiveCase;
    }

    public String putOnCase(Boolean newCase){
        this.protectiveCase = newCase;
        return "Protective case information has been updated.";
    }


    //Getter
    public Boolean getProtectiveCase() {
        return protectiveCase;
    }

    //Setter
    public void setProtectiveCase(Boolean protectiveCase) {
        this.protectiveCase = protectiveCase;
    }




}

