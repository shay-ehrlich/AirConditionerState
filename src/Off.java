public class Off implements AirConditionerState{
    AirConditioner airConditioner;

    public Off (AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void on (){

        System.out.println("Waiting 30 sec");
        System.out.println("ON");
        airConditioner.setMode(airConditioner.getCool());
        airConditioner.setOperation("fanning");
        System.out.println("operating fanning");

    }

    @Override
    public void off () {
        System.out.println("air conditioner is already off");
    }

    @Override
    public void setC_temp (int temp) {
        System.out.println("Please Turn on first..");
    }

    @Override
    public void setR_temp (int temp) {
        System.out.println("Please Turn on first..");
    }
}
