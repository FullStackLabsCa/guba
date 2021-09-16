package school;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static  int id =0;
    static School preSchool = new PreSchool();
    static School elementarySchool = new ElementarySchool();
    static School middleSchool = new MiddleSchool();
    static School highSchool = new HighSchool();

    public static void main(String[] args) throws AgeNotCorrectException, ClassFullException, GradeNotCorrectException {

        System.out.println("Hello world");
        try {
            takeInput();
        } catch (GradeNotCorrectException e) {
            e.printStackTrace();
        } catch (ClassFullException e) {
            e.printStackTrace();
        } catch (AgeNotCorrectException e) {
            System.out.println("Information Entered is wrong.Please try again and check the age");
            takeInput();
        }
    }

    public static void takeInput() throws AgeNotCorrectException, GradeNotCorrectException, ClassFullException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        boolean flag = true;
        String name = null;
        while(flag){
            if(!scanner.hasNextInt()) {
                 name = scanner.next();
                flag=false;
            }else{
                System.out.println("Please do not enter numbers");
                scanner.next();
            }
        }
        System.out.println("Enter your age:");
        flag=true;
        while(flag) {

            if(scanner.hasNextInt()) {
                boolean sign = false;
                int age=0;
                age = scanner.nextInt();
                if(age>18 || age<4){
                    throw new AgeNotCorrectException("checkyour age");
                }else{
                    sign =true;
                }
                while(sign) {
                    GradeType gradeType = UtilityClass.determineGradeBasedOnAge(age);
                    Student student = new Student(id++, name, age, gradeType);
                    SchoolType schoolType = UtilityClass.determineSchoolBasedOnGrade(gradeType);
                    School school = retrieveSchoolObjectBasedOnSchoolType(schoolType);
                    school.admitStudent(student);
                    System.out.println("Student" + student + " has been admitted");
                    doYouWantToContinue();
                    sign =false;
                    flag = false;
                }
            }
            else{
                System.out.println("Please Enter valid age");
                scanner.next();
            }
        }
    }

    private static School retrieveSchoolObjectBasedOnSchoolType(SchoolType schoolType) {
        switch (schoolType) {
            case HIGH_SCHOOL:
                return highSchool;
            case ELEMENTARY_SCHOOL:
                return elementarySchool;
            case MIDDLE_SCHOOL:
                return middleSchool;
            case PRE_SCHOOL:
                return preSchool;
            default:
                throw new IllegalArgumentException("wrong school type");
        }
    }

    private static void doYouWantToContinue() throws AgeNotCorrectException, ClassFullException, GradeNotCorrectException {
        Scanner s = new Scanner(System.in);
        System.out.println("If you want to add more students press N AND if you want to exit Press X");

        char input = s.next().toUpperCase().charAt(0);
        if(input =='X'){
            System.exit(0);
        }else if(input == 'N'){
            takeInput();
        }
    }
}
