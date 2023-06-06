import java.util.ArrayList;
import java.util.List;

public class CourseList extends ArrayList<Course>{

    public CourseList(){
        super();
    }

    public Course find(String name){
        for (int i = 0; i < size(); i++){
            if (this.get(i).getName().equals(name)){
                return get(i);
            }
        }
        return null;
    }



}




