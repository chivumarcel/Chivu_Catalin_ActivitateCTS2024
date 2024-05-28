package P04ClauzeRCA;
/*
* Cerinta> în cadrul firmei Broker Asigurări S.A. se dorește implementarea
contextului de setare a limitei maxime de asigurare din cadrul asigurărilor
auto obligatorii RCA. Firma are mai mulți angajați de tip analiști contracte,
care se ocupă de personalizarea de contracte de asigurări. Acești analiști au
referință la o unică instanță care gestionează limita maximă de asigurare RCA.
Pe măsură ce limita RCA se modifică, analiștii trebuie să dețină aceeași referință
la noile valori modificate.
* */


public class SingletonClauzeRCA {
    private static SingletonClauzeRCA instance = null;
    private int limitamaximaAsigurareCamioane = 2500;
    private int limitamaximaAsigurareAutoturisme = 2000;
    public int getLimitamaximaAsigurareCamioane(){
        return limitamaximaAsigurareCamioane;
    }
    public void setLimitamaximaAsigurareCamioane(int limitamaximaAsigurareCamioane) {
        this.limitamaximaAsigurareCamioane = limitamaximaAsigurareCamioane;
    }

    public int getLimitamaximaAsigurareAutoturisme() {
        return limitamaximaAsigurareAutoturisme;
    }
    public void setLimitamaximaAsigurareAutoturisme(int limitamaximaAsigurareAutoturisme) {
        this.limitamaximaAsigurareAutoturisme = limitamaximaAsigurareAutoturisme;
    }

    // constructor privat
    private SingletonClauzeRCA() throws Exception{
        if(instance !=null){
            throw new Exception("Obiectul Singleton este deja creat");
        }
    }
    // metoda publica
    public static SingletonClauzeRCA getInstance() throws Exception{
        if(instance == null){
            instance = new SingletonClauzeRCA();
        }
        return instance;
    }
}
