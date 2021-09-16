package school;

public class UtilityClass {

    public static SchoolType determineSchoolBasedOnGrade(GradeType grade) throws GradeNotCorrectException {
        switch (grade) {
            case JK_GRADE:
            case SK_GRADE:
                return SchoolType.PRE_SCHOOL;
            case GRADE_1:
            case SECOND_GRADE:
            case THIRD_GRADE:
            case FOURTH_GRADE:
            case FIFTH_GRADE:
                return SchoolType.ELEMENTARY_SCHOOL;
            case SIXTH_GRADE:
            case SEVENTH_GRADE:
            case EIGHTTH_GRADE:
                return SchoolType.MIDDLE_SCHOOL;
            case NINTH_GRADE:
            case TENTH_GRADE:
            case ELEVENTH_GRADE:
            case TWELVETH_GRADE:
                return SchoolType.HIGH_SCHOOL;
            default:
                throw new GradeNotCorrectException();
        }
    }

    public static GradeType determineGradeBasedOnAge(int age) throws AgeNotCorrectException {
        System.out.println("determining grade done");
        switch (age) {
            case 4:
                return GradeType.JK_GRADE;
            case 5:
                return GradeType.SK_GRADE;
            case 6:
                return GradeType.GRADE_1;
            case 7:
                return GradeType.SECOND_GRADE;
            case 8:
                return GradeType.THIRD_GRADE;
            case 9:
                return GradeType.FOURTH_GRADE;
            case 10:
                return GradeType.FIFTH_GRADE;
            case 11:
                return GradeType.SIXTH_GRADE;
            case 12:
                return GradeType.SEVENTH_GRADE;
            case 13:
                return GradeType.EIGHTTH_GRADE;
            case 14:
                return GradeType.NINTH_GRADE;
            case 15:
                return GradeType.TENTH_GRADE;
            case 16:
                return GradeType.ELEVENTH_GRADE;
            case 17:
                return GradeType.TWELVETH_GRADE;
            default:
                throw new AgeNotCorrectException("age has to be between 4 and 17");
        }
    }
}
