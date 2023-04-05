package Ana_Fich;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class AnalyseurWindows extends Analyseur{
	
	public AnalyseurWindows createAnalyseur() {
	      return new AnalyseurWindows(); //un objet WindowsAnalyseur pour l'analyse des chemins de fichiers Windows
	   }

}
