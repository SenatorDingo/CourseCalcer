import javax.xml.crypto.Data;
import java.util.*;
public class Initializer {

    public static List<Course> courseList = new ArrayList<>();
    public static final String[] sentinelPrereq = {"0"};
    public static void initializer(){

        for (int i = 0; i < Database.Courses.length; i++){
            courseList.add(new Course(Database.Courses[i]));
        }

        for (int i = 0; i < Database.Courses.length; i++){
            List<Course> prereqList = new ArrayList<>();
            if (Database.PreReqs[i] == null) {
                courseList.get(i).setPrerequisites(null);
                continue;
            }
            for (int k =0; k < courseList.size(); k++){
                for (int j = 0;j < Database.PreReqs[i].length; j++){
                        if (Database.PreReqs[i][j].equals(courseList.get(k).getName())){
                            prereqList.add(courseList.get(k));
                        }
                    }
            }
            courseList.get(i).setPrerequisites(prereqList);
        }



    }

}
