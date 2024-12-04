package parkinglot.models;

public class Gate {
    private int id;
    private GateType gateType;
    private Operator currentOperator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }
}
