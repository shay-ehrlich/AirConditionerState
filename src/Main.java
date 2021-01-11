import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        AirConditioner ac = new AirConditioner();
//        ac.on();
//        ac.setR_temp(27);
//        ac.setC_temp(34);
//        ac.off();

        // menu
        System.out.println("Welcome to Air Conditioner!");
        System.out.println("The system is Off..");
        boolean flag = true;
        while (flag) {
            System.out.println("1.On\n2.set C-Temp\n3.set R-Temp\n4.OFF");
            Scanner input = new Scanner(System.in);
            try {
                switch (input.nextInt()) {
                    case 1: {
                        ac.on();
                        break;
                    }
                    case 2: {
                        if(ac.getMode() == ac.getOff()){
                            ac.getOff().setC_temp(1);
                            break;
                        }
                        System.out.println("Please enter temperature for C-temp:");
                        Scanner c_temp = new Scanner(System.in);
                        try {
                            int c_temp_int = c_temp.nextInt();
                            if (c_temp_int >= 35 || c_temp_int <= 10) {
                                System.out.println("The temperature is out of the system range..");
                                break;
                            }
                            ac.setC_temp(c_temp_int);
                        } catch (Exception e) {
                            System.out.println("You entered invalid temp for c-temp. Try again..");
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if(ac.getMode() == ac.getOff()){
                            ac.getOff().setR_temp(1);
                            break;
                        }
                        System.out.println("Please enter temperature for R-temp:");
                        Scanner r_temp = new Scanner(System.in);
                        try {
                            int r_temp_int = r_temp.nextInt();
                            if (r_temp_int > 35 || r_temp_int <= 10) {
                                System.out.println("The temperature is out of the system range..");
                                break;
                            }
                            ac.setR_temp(r_temp_int);
                        } catch (Exception e) {
                            System.out.println("You entered invalid temp for c-temp. Try again..");
                            break;
                        }
                        break;
                    }
                    case 4: {
                        ac.off();
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Please enter number from the menu option (1-4)");
                        break;
                    }
                }
            }catch(Exception e){
                System.out.println("Please enter number from the menu option (1-4)");

            }
        }
    }
}
