package epam.JunitAndTDDHometask;

public class CharacterARemovalAtFirst2Chars {
	String resultantString;
	public String removeCharacterA(String string) {
		int length=string.length();
		
		if(string.charAt(0)=='A' && string.charAt(1)!='A') {
			resultantString = (String) string.subSequence(1, length);
		}
		else if(string.charAt(0)=='A' && string.charAt(1) =='A') {
			resultantString =(String)string.subSequence(2, length);
		}
		else if(string.charAt(0)!='A' && string.charAt(1) =='A') {
			resultantString = string.charAt(0) + (String)string.subSequence(2, length);
		}else {
			resultantString=string;
		}
		return resultantString;
	}
}
