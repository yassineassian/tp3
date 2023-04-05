package Fab_Veh;

public class FabriqueVehiculeEssence implements FabriqueVehicule{

	@Override
    public Automobile creerAutomobile() {
        return new AutomobileEssence("Peugeot 308", "Bleu",1,2, 120, 6);
    }

    @Override
    public Scooter creerScooter() {
        return new ScooterEssence("Honda PCX", "Blanc", 7, 3.5f);
    }
}
