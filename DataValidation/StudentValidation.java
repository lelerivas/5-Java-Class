package DataValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentValidation {

	Pattern patt;
	Matcher matc;
	
	public boolean VerifyName(String name){
		patt = Pattern.compile("[a-zA-Zá-ú ]{3,40}"); //create a rule
		matc = patt.matcher(name);					  //apply the rule
		return matc.matches();						  //return true or false according the rule;
	}
	public boolean VerifyGender(String gender){
		boolean verif = false;
		if(gender.equals("female")||gender.equals("male")){
			verif = true;
		}
		return verif;
	}
}
