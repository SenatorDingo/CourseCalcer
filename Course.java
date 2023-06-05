import java.util.*;

public class Course {

    private final String name;
    private boolean taken;
    private boolean offeredFall;
    private boolean offeredWinter;
    private boolean offeredSummer;
    private List<Course> prerequisites;

    public Course(String name){
        this.name = name;
        this.taken = false;
        this.prerequisites = new ArrayList<>();
        this.offeredFall = true;
        this.offeredWinter = true;
        this.offeredSummer = true;
    }

    public Course(String name, boolean taken,List<Course> prerequisites){
        this.name = name;
        this.taken = taken;
        this.prerequisites = prerequisites;
        this.offeredFall = true;
        this.offeredSummer = true;
        this.offeredWinter = true;
    }

    //checks if the Course can be taken ie. if the immediate prerequisites have been completed.
    public boolean checkRequirements(){
        int toTake = 0;
        //base case
        if (this.taken == true){
            return true;
        }
        if (this.prerequisites == null) {
            return true;
        }
        for (int i = 0; i < this.prerequisites.size(); i++) {
            if (!prerequisites.get(i).taken) {
                toTake++;
            }
        }
        if (toTake != 0) {
            return false;
        }
        return true;
    }
    
    //returns a list of courses to be done before a course is taken using recursion
    private List<Course> toDo(Course course){
        List<Course> toDo = new ArrayList<>();
        if (course.prerequisites == null){
            toDo.add(course);
            return toDo;
        }
        for (int i = 0; i < course.prerequisites.size(); i++)
            if (course.prerequisites.get(i).taken != true) {
                toDo.addAll(toDo(course.prerequisites.get(i)));
            }
        toDo.add(course);
        List<Course> toDoDupe = new ArrayList<>(new HashSet<>(toDo));
        return toDoDupe;

    }

    public List<Course> toDo(){
        return toDo(this);
    }

   public Course(String name, boolean taken,List<Course> prerequisites,boolean offeredFall, boolean offeredWinter, boolean offeredSummer) {
       this.name = name;
       this.taken = taken;
       this.prerequisites = prerequisites;
       this.offeredFall = offeredFall;
       this.offeredWinter = offeredWinter;
       this.offeredSummer = offeredSummer;
   }

   //Getters

    public String getName(){
        return this.name;
    }

    public List<Course> getPrerequisites(){
        return this.prerequisites;
    }

    public boolean getTaken(){
        return this.taken;
    }

    public boolean isOfferedFall(){
        return this.offeredFall;
    }

    public boolean isOfferedWinter(){
        return this.offeredWinter;
    }

    public boolean isOfferedSummer(){
        return this.offeredSummer;
    }

    //setters

    public void setPrerequisites(List<Course> prerequisites){
        this.prerequisites = prerequisites;
    }

    public void setTaken(boolean taken){
        this.taken = taken;
    }

    public void setOfferedFall(boolean offeredFall){
        this.offeredFall = offeredFall;
    }

    public void setOfferedWinter(boolean offeredWinter){
        this.offeredWinter = offeredWinter;
    }

    public void setOfferedSummer(boolean offeredSummer){
        this.offeredSummer = offeredSummer;
    }

}
