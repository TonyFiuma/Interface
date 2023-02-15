package it.develhope.interfaces;

public class Test{
    /*
     * create 3 objects, 1 for each subclass type
     * invoke the `goToCollege()` method for each of the newly created objects
     * invoke the implemented methods from interfaces (1 for `Student`, 1 for `Professor` and 2 for `Assistant`)
     */
    public static void main(String[] args){

        Student student1 = new Student("Gianni","Flo",233,2);
        Professor professor1 = new Professor("Luigi","Rossi",111,"Java");
        Assistant assistant1 = new Assistant("Dino","Gialli",145,true);

        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();

        student1.studyAtHome();
        professor1.teachingToOtherPerson();
        assistant1.studyAtHome();
        assistant1.teachingToOtherPerson();

    }
}
