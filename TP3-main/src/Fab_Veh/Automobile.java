package Fab_Veh;

public class Automobile {
	
	private String modele;
    private String couleur;
    private int puissance;
    private int espace;

    public Automobile(String modele, String couleur, int puissance, int espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }

    public void afficherCaracteristiques() {
	}
    
    // Getters et setters pour les attributs
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getEspace() {
        return espace;
    }

    public void setEspace(int espace) {
        this.espace = espace;
    }

}
