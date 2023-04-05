package Fab_Veh;

public class AutomobileElectricite extends Automobile{
	
	 private int autonomie;
	    private int tempsCharge;

	    public AutomobileElectricite(String modele, String couleur, int puissance, int espace, int autonomie, int tempsCharge) {
	        super(modele, couleur, puissance, espace);
	        this.autonomie = autonomie;
	        this.tempsCharge = tempsCharge;
	    }

	    @Override
	    public void afficherCaracteristiques() {
	        System.out.println("Modèle : " + getModele());
	        System.out.println("Couleur : " + getCouleur());
	        System.out.println("Puissance : " + getPuissance() + " kW");
	        System.out.println("Espace : " + getEspace() + " m3");
	        System.out.println("Autonomie : " + autonomie + " km");
	        System.out.println("Temps de charge : " + tempsCharge + " heures");
	    }

	    // Getters et setters pour les attributs spécifiques à AutomobileElectricite
	    public int getAutonomie() {
	        return autonomie;
	    }

	    public void setAutonomie(int autonomie) {
	        this.autonomie = autonomie;
	    }

	    public int getTempsCharge() {
	        return tempsCharge;
	    }

	    public void setTempsCharge(int tempsCharge) {
	        this.tempsCharge = tempsCharge;
	    }

}
