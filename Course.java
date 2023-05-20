public class Course {

    private final String name;
    private boolean taken;
    private boolean offeredFall;
    private boolean offeredWinter;
    private boolean offeredSummer;
    private Course[] prerequisites;

    public Course(String name){
        this.name = name;
        this.taken = false;
        this.prerequisites = null;
        this.offeredFall = true;
        this.offeredWinter = true;
        this.offeredSummer = true;
    }

    public Course(String name, boolean taken,Course[] prerequisites){
        this.name = name;
        this.taken = taken;
        this.prerequisites = prerequisites;
        this.offeredFall = true;
        this.offeredSummer = true;
        this.offeredWinter = true;
    }

   public Course(String name, boolean taken,Course[] prerequisites,boolean offeredFall, boolean offeredWinter, boolean offeredSummer) {
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

    public Course[] getPrerequisites(){
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

    public void setPrerequisites(Course[] prerequisites){
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
