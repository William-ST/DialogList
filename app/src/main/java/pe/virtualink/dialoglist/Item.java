package pe.virtualink.dialoglist;

/**
 * Created by William_ST on 17/09/17.
 */

public class Item {

    private String code;
    private String name;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
