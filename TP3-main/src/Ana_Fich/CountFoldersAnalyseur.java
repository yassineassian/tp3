package Ana_Fich;

public class CountFoldersAnalyseur {
	
	private CountFolders countFolders;
	   private Analyseur analyseur;
	   
	   public CountFoldersAnalyseur(CountFolders countFolders, Analyseur analyseur) {
	      this.countFolders = countFolders;
	      this.analyseur = analyseur;
	   }
	   
	   public int getCount(String path) {
	      //Analyseur analyseur = Analyseur.createAnalyseur();
	      //String[] folders = analyseur.parse(path);
	      return countFolders.getCount(path);
	   }

}
