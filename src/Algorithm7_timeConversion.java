public class Algorithm7_timeConversion {
    public static void main(String[] args) {
        timeConversion("07:05:45AM");

    }

    public static void timeConversion(String string){
        String hour = string.substring(0,2);
        if (string.endsWith("AM")) {
            if (hour.equals("12")) {
                System.out.println("00".concat(string.substring(2)));
            } else {
                System.out.println(string);
            }
        }
        if (string.endsWith("PM")){
            if (hour.equals("12")){
                System.out.println(string);
            }else {
                int h = Integer.valueOf(hour)+12;
                System.out.println(String.valueOf(h).concat(string.substring(2)));
            }
        }

    }
}
