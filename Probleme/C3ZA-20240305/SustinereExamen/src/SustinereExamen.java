import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String nume;
    Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String, nume){
        this.nume = nume;
    }

    public String getNume(){
        return nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudenti(Student student){
        if(listaStudenti.containsKey(student.getId())){

            System.out.println("Studentul "+student+" a sustinut deja examenul");
        }else{
            listaStudenti.put(student.getId());

        }

    }
}
