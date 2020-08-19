package codegenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */
public class Address {

    public int getNum() {
        return num;
    }

    public TypeAddress getType() {
        return type;
    }

    public VarType getVarType() {
        return varType;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setType(TypeAddress type) {
        this.type = type;
    }

    public void setVarType(VarType varType) {
        this.varType = varType;
    }

    private int num;
    private TypeAddress type;
    private VarType varType;

    public Address(int num, VarType varType, TypeAddress type) {
        setNum(num);
        setType(type);
        setVarType(varType);
    }

    public Address(int num, VarType varType) {
        setNum(num);
        setType(TypeAddress.Direct);
        setVarType(varType);
    }
}
