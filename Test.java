import java.util.*;

public class Test {
    public static void main (String[] args){
        Course ITI1120 = new Course("ITI1120", true,null);
        List<Course> prereques = new ArrayList<>();
        prereques.add(ITI1120);
        Course ITI1121 = new Course("ITI1121",false,prereques);
        List<Course> pre2 = new ArrayList<>();
        pre2.add(ITI1121);
        Course CSI2110 = new Course("CSI2110",false,pre2);


        System.out.println(CSI2110.checkRequirements());
    }
}
