package sef.finalActivity;

public class Students {

    private String schoolName;

    public Students(){
    }

    public Students(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String introduce(){
        return "I am studying in university " + schoolName;
    }
}
