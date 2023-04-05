package Fab_Veh;

public class AutomobileEssence extends Automobile{
	
	private float consommation;
    private int capaciteReservoir;

    public AutomobileEssence(String modele, String couleur, int puissance, int espace, float consommation, int capaciteReservoir) {
        super(modele, couleur, puissance, espace);
        this.consommation = consommation;
        this.capaciteReservoir = capaciteReservoir;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " kW");
        System.out.println("Espace : " + getEspace() + " m3");
        System.out.println("Consommation : " + consommation + " L/100km");
        System.out.println("Capacité du réservoir : " + capaciteReservoir + " L");
    }

    // Getters et setters pour les attributs spécifiques à AutomobileEssence
    public float getConsommation() {
        return consommation;
    }

    public void setConsommation(float consommation) {
        this.consommation = consommation;
    }

    public int getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public void setCapaciteReservoir(int capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }

}
