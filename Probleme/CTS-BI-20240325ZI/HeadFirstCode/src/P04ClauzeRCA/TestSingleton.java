package P04ClauzeRCA;

import P03SingletonGeekific.Singleton;

public class TestSingleton {
    public static void main(String[] args) throws Exception{
        SingletonClauzeRCA clauzaRCA1 = SingletonClauzeRCA.getInstance();
        SingletonClauzeRCA clauzaRCA2 = SingletonClauzeRCA.getInstance();

        if(clauzaRCA1 == clauzaRCA2){
            System.out.println("Referinte identice");
        }else{
            System.out.println("Referintele nu sunt identice");
        }

        clauzaRCA1.setLimitamaximaAsigurareAutoturisme(5000);
        System.out.println(clauzaRCA1.getLimitamaximaAsigurareAutoturisme());
        System.out.println(clauzaRCA2.getLimitamaximaAsigurareAutoturisme());
    }
}
