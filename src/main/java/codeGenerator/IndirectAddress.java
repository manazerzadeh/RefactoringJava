package codegenerator;

/**
 * Created by ASUSCenter on 8/19/2020.
 */
public class IndirectAddress extends Address {
    public IndirectAddress(int num, VarType varType, TypeAddress type) {
        super(num, varType, type);
    }

    public IndirectAddress(int num, VarType varType) {
        super(num, varType);
    }


    public String toString(){
        return "@"+ getNum();

    }
}
