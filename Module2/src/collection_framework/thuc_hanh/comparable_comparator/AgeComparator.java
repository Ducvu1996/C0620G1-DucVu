package collection_framework.thuc_hanh.comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student student_1, Student student_2) {
        if(student_1.getAge() > student_2.getAge()){
            return 1;
        }else if(student_1.getAge() == student_2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
