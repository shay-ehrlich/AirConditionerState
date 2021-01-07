public class AirConditioner {
    AirConditionerState cool;
    AirConditionerState heat;
    AirConditionerState off;
    AirConditionerState mode;
    int C_temp;
    int R_temp;
    Operation operation;


    public AirConditioner () {
        System.out.println("OFF");
        C_temp= 25;
        R_temp =25;
        cool = new Cool(this);
        heat = new Heat(this);
        off = new Off(this);
        mode = off;

    }

    enum Operation{
        cooling,
        heating,
        fanning,
    }

    void on(){
        this.mode.on();
    }

    void off(){

        this.mode.off();
    }

    void setC_temp(int temp){
        this.mode.setC_temp(temp);
        this.C_temp = temp;
    }
    void setR_temp(int temp){
        this.mode.setR_temp(temp);
        this.R_temp= temp;
    }


    public void setCool(AirConditionerState cool) {
        this.cool = cool;
    }

    public void setHeat(AirConditionerState heat) {
        this.heat = heat;
    }

    public void setMode (AirConditionerState mode) {
        this.mode = mode;
        System.out.println("mode-" + this.mode.getClass().getName());
    }

    public void setOperation (String operation) {
        if ( operation =="cooling"){
            this.operation = Operation.cooling;

        }
        if ( operation =="heating"){
            this.operation = Operation.heating;
        }
        if ( operation =="fanning"){
            this.operation = Operation.fanning;
        }

    }
    public AirConditionerState getCool () {
        return cool;
    }

    public AirConditionerState getHeat () {
        return heat;
    }

    public AirConditionerState getMode () {
        return mode;
    }

    public int getC_temp () {
        return C_temp;
    }

    public int getR_temp () {
        return R_temp;
    }

    public String getOperation () {
        return operation.name();
    }
}
