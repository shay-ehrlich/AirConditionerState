public class Heat implements AirConditionerState {
    AirConditioner airConditioner;

    public Heat (AirConditioner ac) {
        this.airConditioner =ac;
    }

    @Override
    public void on () {
        System.out.println("The air conditioner is already on. The system in mode-heat");
    }

    @Override
    public void off () {
        System.out.println("OFF");
    }

    @Override
    public void setC_temp (int temp) {
        if (temp < airConditioner.getR_temp()-5){
            airConditioner.setMode(airConditioner.getCool());
//            System.out.println("MODE-COOL");
            airConditioner.setOperation("cooling");
            System.out.println("operating cooling");
        }
//        airConditioner.setC_temp(temp);
        System.out.format("set C_temp to %d%n", temp);
    }

    @Override
    public void setR_temp (int temp) {
        if (airConditioner.getOperation()== "fanning"){
            if(temp< airConditioner.getC_temp()+2){
                System.out.println("delay for 2 minuets");
                System.out.println("2 minuets pass");
                airConditioner.setOperation("heating");
                System.out.println("operating heating");
            }
        }
        else {
            if(temp >= airConditioner.getC_temp() +2){
                airConditioner.setOperation("fanning");
                System.out.println("operating fanning");
            }
        }
//        airConditioner.setR_temp(temp);
//        System.out.println("room temperature is: "+airConditioner.getR_temp());
        System.out.format("room temperature is: %d%n", temp);
    }

}
