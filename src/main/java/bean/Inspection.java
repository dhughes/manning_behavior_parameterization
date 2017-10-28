package bean;

import java.util.Date;

public class Inspection {
    private String camis;
    private String dba;
    private String boro;
    private String building;
    private String street;
    private String zipcode;
    private String phone;
    private String cuisineDescription;
    private Date inspectionDate;
    private String action;
    private String violationCode;
    private String violationDescription;
    private String criticalFlag;
    private int score;
    private String grade;
    private Date gradeDate;
    private Date recordDate;
    private String inspectionType;

    public String getCamis() {
        return camis;
    }

    public void setCamis(String camis) {
        this.camis = camis;
    }

    public String getDba() {
        return dba;
    }

    public void setDba(String dba) {
        this.dba = dba;
    }

    public String getBoro() {
        return boro;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCuisineDescription() {
        return cuisineDescription;
    }

    public void setCuisineDescription(String cuisineDescription) {
        this.cuisineDescription = cuisineDescription;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getViolationCode() {
        return violationCode;
    }

    public void setViolationCode(String violationCode) {
        this.violationCode = violationCode;
    }

    public String getViolationDescription() {
        return violationDescription;
    }

    public void setViolationDescription(String violationDescription) {
        this.violationDescription = violationDescription;
    }

    public String getCriticalFlag() {
        return criticalFlag;
    }

    public void setCriticalFlag(String criticalFlag) {
        this.criticalFlag = criticalFlag;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getGradeDate() {
        return gradeDate;
    }

    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    @Override
    public String toString() {
        return "Inspection{" +
                "camis='" + camis + '\'' +
                ", dba='" + dba + '\'' +
                ", boro='" + boro + '\'' +
                ", building='" + building + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", phone='" + phone + '\'' +
                ", cuisineDescription='" + cuisineDescription + '\'' +
                ", inspectionDate=" + inspectionDate +
                ", action='" + action + '\'' +
                ", violationCode='" + violationCode + '\'' +
                ", violationDescription='" + violationDescription + '\'' +
                ", criticalFlag='" + criticalFlag + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                ", gradeDate=" + gradeDate +
                ", recordDate=" + recordDate +
                ", inspectionType='" + inspectionType + '\'' +
                '}';
    }
}
