// Store a student's age using int, percentage using double, grade using char, and pass status using boolean. Print all four values with meaningful labels.

class StudentInformation{
    public static void main(String[] args){
        int age = 16;
        double percentage = 83.5;
        char grade = 'A';
        boolean isPassed = true;

        System.out.println("----------Student Information----------");
        System.out.println("Age : " + age);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);
        System.out.println("IsPassed : " + isPassed);
    }
}