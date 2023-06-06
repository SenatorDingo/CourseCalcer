import java.util.*;public class Initializer {

    public static CourseList courseList = new CourseList();
    public static final String[] sentinelPrereq = {"0"};

    public static void initializer() {

        if (Database.PreReqs.length != Database.Courses.length){
            throw new RuntimeException("Invalid PreReqs");
        }

        for (int i = 0; i < Database.Courses.length; i++) {
            courseList.add(new Course(Database.Courses[i]));
        }

        for (int i = 0; i < Database.Courses.length; i++) {
            if (Database.PreReqs[i] == null) {
                courseList.get(i).setPrerequisites(null);
                continue;
            }
            for (int j = 0; j < Database.PreReqs[i].length; j++) {
                courseList.get(i).setPrerequisite(courseList.find(Database.PreReqs[i][j]));
            }

        }
    }
}


