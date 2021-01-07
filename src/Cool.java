import java.text.spi.CollatorProvider;

public class Cool implements AirConditionerState {

    AirConditioner airConditioner;


    public Cool (AirConditioner ac) {
        airConditioner = ac;
    }

    @Override
    public void on () {
        System.out.println("the air conditioner is already on mode cool");
    }

    @Override
    public void off () {
        System.out.println("OFF");
    }

    @Override
    public void setC_temp (int temp) {
        System.out.format("set C_temp to %d%n", temp);
        if (temp > airConditioner.getR_temp() +5){
            airConditioner.setMode(airConditioner.getHeat());
//            System.out.println("MODE-HEAT");
            airConditioner.setOperation("heating");
            System.out.println("operating heating");
        }
//        airConditioner.setC_temp(temp);
//        System.out.println("set C_temp to" + temp);
    }

    @Override
    public void setR_temp (int temp){
        System.out.format("room temperature is: %d%n ",temp);
        if (airConditioner.getOperation()== "fanning"){
            if (temp >= airConditioner.getC_temp()+2) {
                System.out.println("delay for 2 minuets");
                System.out.println("2 minuets pass");
                airConditioner.setOperation("cooling");
                System.out.println("operating cooling");
            } // still fanning
        }
        else {
            if (temp <= airConditioner.getC_temp() - 2) {
                airConditioner.setOperation("fanning");
                System.out.println("operating fanning");
            }// still cooling

//            airConditioner.setR_temp(temp);
//            System.out.println("room temperature is: "+airConditioner.getR_temp());
        }
    }

}
