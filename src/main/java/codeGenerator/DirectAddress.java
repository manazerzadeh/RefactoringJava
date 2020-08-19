package codegenerator;

/**
 * Created by ASUSCenter on 8/19/2020.
 */
public class DirectAddress extends Address {
    public DirectAddress(int num, VarType varType, TypeAddress Type) {
        super(num, varType, Type);
    }

    public DirectAddress(int num, VarType varType) {
        super(num, varType);
    }

    public String toString(){
        return num+"";
    }

}
