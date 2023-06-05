package Pack1;

public class OfficeFile {
    private  String description;
    private String fileType;
    private String classification;

    public String getDescription(){
        return description;
    }
    public void setType(String type){
        fileType = type;
    }
    public String getClassification(){
        return classification;
    }
    private void updateClassification(String updatedClassification){
        classification = updatedClassification;
    }
}
