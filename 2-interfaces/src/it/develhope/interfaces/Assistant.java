package it.develhope.interfaces;

/*
 * considering that an assistant **is** a `CollegePerson` that **can learn and teach**, define a subclass `Assistant` that:
 * implements the right interfaces and overrides the abstract methods with informative messages
 * has an attribute of type `boolean` called `isGoingToBeAPhD`
 * has a constructor that takes 4 params (`name`, `surname`, `id`, `willBeAPhD`) and assigns their values to the right attributes
 */
public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{

    private boolean isGoingToBedAPhD;


    /**
     * Assistant method constructor
     *
     * @param name             a String for the Assistant name
     * @param surname          a String for the Assistant surname
     * @param collegeId        an int identifier for the Assistant
     * @param isGoingToBedAPhD a boolean for the Assistant possible PhD
     */
    public Assistant(String name,String surname,int collegeId,boolean isGoingToBedAPhD){
        super(name,surname,collegeId);
        this.isGoingToBedAPhD = isGoingToBedAPhD;
    }


    @Override
    public void studyAtHome(){
        System.out.println("I'm a student and I'm going to bed: "+isGoingToBedAPhD);
    }

    @Override
    public void teachingToOtherPerson(){
        System.out.println("Hey I'm professor too and I'm going to bed: "+isGoingToBedAPhD);
    }
    public boolean isGoingToBedAPhD(){
        return isGoingToBedAPhD;
    }

    public void setGoingToBedAPhD(boolean goingToBedAPhD){
        isGoingToBedAPhD = goingToBedAPhD;
    }
}
