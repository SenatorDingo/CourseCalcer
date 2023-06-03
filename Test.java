import java.util.*;

public class Test {
    private static String[] Courses = {"GNG1105","MAT1341","CHM1311","CEG2136",
            "CSI2101","CSI2110","SEG2106","CSI2132","GNG2101","MAT2377","SEG2105","SEG2911","EVS1101"
            ,"PHY2390", "CEG3185","CEG3105","CSI3131","SEG3101","SEG3102","SEG3103","SEG3125"};

    private static String[][] PreReqs = {{null},{null},{null},{"ITI1100"}
            ,{"MAT1348"},{"ITI1121","MAT1348"},{"SEG2105","CSI2110"},{"CSI2110"},{null}
            ,{"MAT1320","MAT1322"},{"ITI1121"},{null},{null},{"PHY1321"},{"MAT2377"},
            {"CSI2110","CSI2110"},{"CEG2136","CSI2110"},{"SEG2105"},{"SEG2105"},{"SEG2105"}
            ,{"SEG2105"}};
    public static List<Course> coursesList = new ArrayList<>();
    public static void main(String[] args){

        for (int i = 0; i < Courses.length; i++){
            coursesList.add(i, new Course(Courses[i]));
        }




        Course ITI1120 = new Course("ITI1120", false,null);
        List<Course> prereques = new ArrayList<>();
        prereques.add(ITI1120);
        Course ITI1121 = new Course("ITI1121",false,prereques);
        List<Course> pre2 = new ArrayList<>();
        pre2.add(ITI1121);
        Course CSI2110 = new Course("CSI2110",false,pre2);


        System.out.println();
        CSI2110.toDo();
    }
}
