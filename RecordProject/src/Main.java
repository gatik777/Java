public class Main {
    public static void main(String[] args) {

        LPAStudent s = new LPAStudent(" S92300" , " Gatik", " 07/07/2007", " Java Masterclass");
        System.out.println(s);



        Student pojoStudent = new Student(" S923006", " Gatik", "05/11/1985", " Java Masterclass");
        LPAStudent recordStudent = new LPAStudent(" S923007", " Bill", "5/11/1985", " Java Masterclass");
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
    }
}