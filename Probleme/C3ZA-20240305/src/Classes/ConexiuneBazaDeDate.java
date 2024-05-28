package Classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instanta = null;
}

private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune){
    this.numeBaza = numeBaza;
    this.nrTabele = nrTabele;
    this.linkConexiune = linkConexiune;
}

@Override
public String toString(){
    final StringBuffer sb = new StringBuffer("ConexiuneBazaDeDate{");
    sb.append("numeBaza = ").append(numeBaza).append('\'');
    sb.append(" , nrTabele= ").append(nrTabele).append('\'');
    sb.append("Link: ").append(linkConexiune).append('\'');

    return null;
}




}