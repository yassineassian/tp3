package Fab_Veh;

public class ScooterEssence extends Scooter{
	
	private float consommation;

    public ScooterEssence(String modele, String couleur, int puissance, float consommation) {
        super(modele, couleur, puissance);
        this.consommation = consommation;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " kW");
        System.out.println("Consommation : " + consommation + " L/100km");
    }

    // Getter et setter pour l'attribut spécifique à ScooterEssence
    public float getConsommation() {
        return consommation;
    }

    public void setConsommation(float consommation) {
        this.consommation = consommation;
    }

}
