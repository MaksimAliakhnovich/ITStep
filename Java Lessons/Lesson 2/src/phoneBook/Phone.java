package phoneBook;

/**
 * Created by Student on 20.12.2017.
 */
public class Phone {

    private boolean mobile;
    private String type;
    private String code;
    private String number;

    public Phone() {
    }

    public Phone(boolean mobile, String type, String code, String number) {
        this.mobile = mobile;
        this.type = type;
        this.code = code;
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String phoneType;
        if (mobile) {
            phoneType = "мобильный";
        } else {
            phoneType = "стационарный";
        }

        return "Телефон: " +
                phoneType + ", " +
                type + ", " +
                code + " " +
                number;
    }
}
