//package ChocoHolicInc;
//
//import static P04Singleton.Singleton.uniqueInstance;
//import static sun.util.locale.LocaleUtils.isEmpty;
//
//public class ChocolateBoiler {
//    private boolean empty;
//    private boolean boiled;
//    ChocolateBoiler boiler = ChocolateBoiler.getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new ChocolateBoiler();
//        }
//        return uniqueInstance;
//    };
//
//
//    public ChocolateBoiler(){
//        empty = true;
//        boiled = false;
//    }
//    public void fill(){
//        if(isEmpty()){
//            empty = false;
//            boiled = false;
//            //fill the boiler with a milk/chocolate mixture
//        }
//    }
//    public void drain(){
//        if(!isEmpty() && isBoiled()){
//            empty = true; //drain the boiled milk and chocolate
//        }
//    }
//    public void boil(){
//        if(!isEmpty() && !isBoiled()){
//            boiled = true; //bring the contents to a boil
//        }
//    }
//
//
//    private boolean isEmpty() {
//        return empty;
//    }
//    private boolean isBoiled(){
//        return boiled;
//    }
//}
//
