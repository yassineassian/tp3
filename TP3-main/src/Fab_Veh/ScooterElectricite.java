package Fab_Veh;

public class ScooterElectricite extends Scooter{
	
	private float autonomie;

    public ScooterElectricite(String modele, String couleur, int puissance, float autonomie) {
        super(modele, couleur, puissance);
        this.autonomie = autonomie;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Modèle : " + getModele());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Puissance : " + getPuissance() + " kW");
        System.out.println("Autonomie : " + autonomie + " km");
    }

    // Getter et setter pour l'attribut spécifique à ScooterElectricite
    public float getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(float autonomie) {
        this.autonomie = autonomie;
    }

}
