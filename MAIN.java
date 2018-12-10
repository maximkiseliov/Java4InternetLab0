/*
 * Vipolnil: Kiseliov Maxim
 * Gruppa: I1602
 * Laboratornaya rabota #0
 * Zadanie:
 * - Sozdati class Student (familia, imea, god rojdenia, srednii bal);
 * - Sozdati spisok Studentov (kollektzia);
 * - Otsortirovati po familii, godu rojdenia, srednemu ballu s pomosiu lambda-virajenii
 */


import java.util.ArrayList;
import java.util.Comparator;

public class MAIN {
    public static void main(String[] args) {
    	//lambda - virajenia
    	Comparator<Student> poFamilii = (Student s1, Student s2) -> s1.getFamilia().compareTo(s2.getFamilia());
        Comparator<Student> poImeni = (Student s1, Student s2) -> s1.getImea().compareTo(s2.getImea());
        Comparator<Student> poGoduRojdeniya = (Student s1, Student s2) -> s1.getGod() <= s2.getGod() ? 1 : -1;
        Comparator<Student> poSredneiOtzenke = (Student s1, Student s2) -> s1.getSredniayaOtzenka() <= s2.getSredniayaOtzenka() ? 1 : -1;

        //spisok studentov
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rondo", "Rajon", 1997, 8));
        students.add(new Student("Abrines", "Alex", 1993, 6.8));
        students.add(new Student("Fournier", "Evan", 1992, 7.2));
        students.add(new Student("Green", "Danny", 1987, 7.8));
        students.add(new Student("Jokic", "Nicola", 1995, 8.5));
        students.add(new Student("James", "LeBron", 1984, 10));
        students.add(new Student("MbahAMoute", "Luc", 1986, 5));

        //sravnenie + vivod po fanmilii A->Z
        System.out.println("Po familii:");
        students.sort(poFamilii.thenComparing(poImeni));
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        //sravnenie + vivod po godu DESC
        System.out.println("\n-*-*-*-*-*-*");
        System.out.println("Po godu rojdeniya:");
        students.sort(poGoduRojdeniya);
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        //sravnenie + vivod po otzenke DESC
        System.out.println("\n-*-*-*-*-*-*");
        System.out.println("Po srednei otzenke:");
        students.sort(poSredneiOtzenke);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}