package it.develhope.interfaces;

/*
 * considering that a student **is** a `CollegePerson` that **can learn**, define a subclass `Student` that:
 * implements the right interface and overrides the abstract method with an informative message
 * has an attribute `academicYear` of type `int`
 * has a constructor that takes 4 params (`name`, `surname`, `id`, `year`) and assigns their values to the right attributes
 */
public class Student extends CollegePerson implements ILearningPerson{

    private int academicYear;

    /**
     * Constructor method for Student
     *
     * @param name         a String for the Student name
     * @param surname      a String for the Student surname
     * @param collegeId    an int for the Student identifier
     * @param academicYear an int for the academic year
     */
    public Student(String name,String surname,int collegeId,int academicYear){
        super(name,surname,collegeId);
        this.academicYear = academicYear;
    }


    @Override
    public void studyAtHome(){
        System.out.println("Hey I'm a student since "+academicYear+" years");
    }
    public int getAcademicYear(){
        return academicYear;
    }

    public void setAcademicYear(int academicYear){
        this.academicYear = academicYear;
    }
}

   


    
