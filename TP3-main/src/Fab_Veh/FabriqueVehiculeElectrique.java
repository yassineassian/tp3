package Fab_Veh;

public class FabriqueVehiculeElectrique implements FabriqueVehicule{
	
	@Override
    public Automobile creerAutomobile() {
        return new AutomobileElectricite("Tesla Model S", "Rouge",1,2, 300, 4);
    }

    @Override
    public Scooter creerScooter() {
        return new ScooterElectricite("Vespa Elettrica", "Noir", 4, 100);
    }

}
