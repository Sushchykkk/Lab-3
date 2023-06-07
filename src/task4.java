public class task4{
    public static void main(String[] args) {
        for (int hour = 0; hour < 3; hour++) {
            for (int hvylyna = 0; hvylyna < 60; hvylyna++) {
                for(int secunda = 0; secunda < 60; secunda++)
                    System.out.println(hour + " h " + hvylyna + " min " + secunda + " sec");
            }
        }
    }
}


