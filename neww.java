class HelloWorld {
    public static void main(String[] args) {
        int rup_ee = 2000;
        double Convert = rup_ee / 83.5;
        System.out.println(Convert + " Dollars");
        
        System.out.println("--------hours-minutes-seconds------------");
        
        double hr_1 = 3.5;
        double into_minutes = hr_1 * 60;
        double seconds = into_minutes * 60;
        int sec = (int)seconds;
        System.out.println("Minutes :" + into_minutes);
        System.out.println("Seconds:" + sec);
        System.out.println("----------Area and perimeter of Rectangle------------");
        int length = 20;
        int breadth = 18;
        int area = (length * breadth);
        int peri = (2*length + breadth);
        System.out.println("perimeter of Rectangle:" + peri);
        System.out.println("Area of Rectriangle: " + area);
        
        System.out.println("A to a using ASCII");
        
        char alpha = 'A';
        int small_a = (int)alpha + 32;
        char final_letter = (char)small_a;
        System.out.println(final_letter)
        
    }
}