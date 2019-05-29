public class Alumne {
    private String nom;
    private int primeraEval;
    private int segonaEval;
    private int terceraEval;

    public Alumne(String nom,int primeraEval,int segonaEval,int terceraEval){
        this.nom=nom;
        if(primeraEval<10 && primeraEval>0 && segonaEval<10 && segonaEval>0 && terceraEval<10 && terceraEval>0 ){
            this.primeraEval=primeraEval;
            this.segonaEval=segonaEval;
            this.terceraEval=terceraEval;
        }
        else{
            System.out.println("Hi ha un error al introduir les dades!!!");
        }

    }

    public String getNom() {
        return nom;
    }

    public int getPrimeraEval() {
        return primeraEval;
    }

    public int getSegonaEval() {
        return segonaEval;
    }

    public int getTerceraEval() {
        return terceraEval;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrimeraEval(int primeraEval) {
        this.primeraEval = primeraEval;
    }

    public void setSegonaEval(int segonaEval) {
        this.segonaEval = segonaEval;
    }

    public void setTerceraEval(int terceraEval) {
        this.terceraEval = terceraEval;
    }
}
