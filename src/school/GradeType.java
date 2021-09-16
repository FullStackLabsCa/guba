package school;




public enum GradeType {

    JK_GRADE("JK"),
    SK_GRADE("SK"),
    GRADE_1("1"),
    SECOND_GRADE("2"),
    THIRD_GRADE("3"),
    FOURTH_GRADE("4"),
    FIFTH_GRADE("5"),
    SIXTH_GRADE("6"),
    SEVENTH_GRADE("7"),
    EIGHTTH_GRADE("8"),
    NINTH_GRADE("9"),
    TENTH_GRADE("10"),
    ELEVENTH_GRADE("11"),
    TWELVETH_GRADE("12");



    private String gradeName;

    GradeType(String gradeName) {
        this.gradeName = gradeName;
    }
}