package codegenerator;

/**
 * Created by ASUSCenter on 8/19/2020.
 */
public class ImidiateAddress extends Address {
    public ImidiateAddress(int num, VarType varType, TypeAddress type) {
        super(num, varType, type);
    }

    public ImidiateAddress(int num, VarType varType) {
        super(num, varType);
    }


    public String toString(){
        return "#"+ getNum();
    }
}
