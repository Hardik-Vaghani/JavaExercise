package Exercise.basic;

public class Test1 {
    public static void main(String[] args) {

//                "Round" : ["-2","+2-6.5","+6.5-9","+9-11","+11-12","+12-13","+13-14","+14-15","+15-16","+16-17","+17-18","+18-19","+19-20"],
//                "Emerald" : ["32EM","3.52EM","42EM","43EM","4.53.5EM","53EM","5.5-3.5EM"],


        String[][] data = {{"-2", "+2-6.5", "+6.5-9", "+9-11", "+11-12", "+12-13", "+13-14", "+14-15", "+15-16", "+16-17", "+17-18", "+18-19", "+19-20"},
                {"32EM", "3.52EM", "42EM", "43EM", "4.53.5EM", "53EM", "5.5-3.5EM"}};
//        for (int i = 0; i < data.length; ++i) {
//            for (int j = 0; j < data[i].length; ++j) {
//             System.out.println(data[i][j]);
        for (int i=0;i<data.length;++i){
                System.out.println(data);
                String[][] a = data;
//            for (String  data1 : i){
//                System.out.println(data1);
//            }
        }

    }
}