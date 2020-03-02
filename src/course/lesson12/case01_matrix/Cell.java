package course.lesson12.case01_matrix;

public class Cell {

    private String type;

    public static final String typeFlat = "flat";
    public static final String typeTree = "tree";
    public static final String typeFlag = "flag";


    public Cell() {
        this(typeFlat);
    }

    public Cell(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
