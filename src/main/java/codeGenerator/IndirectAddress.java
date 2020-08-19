package codegenerator;

/**
 * Created by ASUSCenter on 8/19/2020.
 */
public class IndirectAddress extends Address {
    public IndirectAddress(int num, codegenerator.varType varType, TypeAddress Type) {
        super(num, varType, Type);
    }

    public IndirectAddress(int num, codegenerator.varType varType) {
        super(num, varType);
    }


    public String toString(){
        return "@"+num;

    }
}
