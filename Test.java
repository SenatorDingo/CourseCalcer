public class Test {
    public static void main (String[] args){
        Course ITI1120 = new Course("ITI1120", true,null);
        Course[] prereques = new Course[1];
        prereques[0] = ITI1120;
        Course ITI1121 = new Course("ITI1121",true,prereques);
        Course[] pre2 = new Course[1];
        pre2[0] = ITI1121;
        Course CSI2110 = new Course("CSI2110",false,pre2);


        System.out.println(CSI2110.checkRequirements());
    }
}
