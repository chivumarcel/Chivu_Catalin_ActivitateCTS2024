package ro.ase.acs.strategy;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) { //setter injection - se foloseste cand se doreste schimbarea strategiei la runtime
        this.operation = operation;
    }

    public double compute(Integer... values) throws OperationNotSetException {
        List<Integer> list = List.of(values);
        if(this.operation != null){
            return this.operation.doOperation(list);
        }else{
            throw new OperationNotSetException();
        }


    }
}
