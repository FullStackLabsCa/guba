package school;

public enum SchoolType {

    PRE_SCHOOL("PreSchool"),
    MIDDLE_SCHOOL("MiddleSchool"),
    ELEMENTARY_SCHOOL("ElementarySchool"),
    HIGH_SCHOOL("HighSchool");

    private String schoolName;

    SchoolType(String schoolName) {
        this.schoolName = schoolName;
    }
}