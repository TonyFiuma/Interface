package it.develhope.interfaces;

/*
 * considering that a professor **is** a `CollegePeorson` that **can teach**, define a subclass `Professor` that:
 * implements the right interface and overrides the abstract method with an informative message
 * has an attribute of type `String` called `teachingSubject`
 * has a constructor that takes 4 params (`name`, `surname`, `id`, `subject`) and assigns their values to the right attributes
 */
public class Professor extends CollegePerson implements ITeachingPerson{
    private String teachingSubject;

    /**
     * Constructor method for Professor object
     *
     * @param name            a String for the Professor name
     * @param surname         a String for the Professor surname
     * @param collegeId       an int identifier for the Professor
     * @param teachingSubject a String for the Professor subject
     */
    public Professor(String name,String surname,int collegeId,String teachingSubject){
        super(name,surname,collegeId);
        this.teachingSubject = teachingSubject;
    }


    @Override
    public void teachingToOtherPerson(){
        System.out.println(" Hey I'm a professor of "+teachingSubject);
    }

    public String getTeachingSubject(){
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject){
        this.teachingSubject = teachingSubject;
    }
}