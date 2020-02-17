package mn223dn_assign3;

public class SweID {

	public static String getFirstPart(String id) {
		String first = id.substring(0, 6);
		return first;
	}

	public static String getSecondPart(String id) {
		String second = id.substring(7, 11);
		return second;
	}

	public static boolean isFemaleNumber(String id) {
		boolean female;
		if (id.charAt(9) % 2 == 0)
			female = true;
		else {
			female = false;
		}

		return female;
	}

	public static boolean isMaleNumber(String id) {
		boolean male;
		if (id.charAt(9) % 2 == 0)
			male = false;
		else {
			male = true;
		}

		return male;
	}

	public static boolean areEqual(String firId, String secId) {
		boolean equal;

		if (firId == secId)
			equal = true;
		else
			equal = false;

		return equal;
	}
	
	private static boolean isCorrectDate(String date){
		String month = date.substring(0, 2);
		String day = date.substring(2 , 4);

		if (date.length() == 4 && Integer.parseInt(month) <=12 && Integer.parseInt(day) <=31 && Integer.parseInt(day) > 0){
				if ( Integer.parseInt(month) == 02  && Integer.parseInt(day) <= 28 ){
				return true;}
			
				else if ( (Integer.parseInt(month) == 01  || Integer.parseInt(month) == 03 ||Integer.parseInt(month) == 05 ||Integer.parseInt(month) == 07 ||Integer.parseInt(month) == 8 ||Integer.parseInt(month) == 10 ||Integer.parseInt(month) == 12 )){
					if (Integer.parseInt(day) <= 31 )
						return true;
				}
				else if ( (Integer.parseInt(month) == 04  || Integer.parseInt(month) == 06 ||Integer.parseInt(month) == 9 ||Integer.parseInt(month) == 11 )){
					if (Integer.parseInt(day) <= 30 )
						return true;
				}
		}	
		return false;
		
	
	}

	private static boolean isCorrectSN (String id){
		String sub = id.substring(0, 10);
		
		int a = (Character.getNumericValue(sub.charAt(0))*2/10) +(Character.getNumericValue(sub.charAt(0))*2%10);
		int b = Character.getNumericValue(sub.charAt(1));
		int c = Character.getNumericValue(sub.charAt(2))*2;
		int d = Character.getNumericValue(sub.charAt(3));
		int e = Character.getNumericValue(sub.charAt(4))*2;
		int f = Character.getNumericValue(sub.charAt(5));
		int g =(Character.getNumericValue(sub.charAt(7))*2/10) +(Character.getNumericValue(sub.charAt(7))*2%10) ;
		int h = Character.getNumericValue(sub.charAt(8));
		int i =(Character.getNumericValue(sub.charAt(9))*2/10) +(Character.getNumericValue(sub.charAt(9))*2%10) ;
		int j = a+b+c+d+e+f+g+h+i ;
		int k = (10 - (j % 10)) % 10 ;
		
		String sn = sub + k ;
		if ( id.equals(sn)){
			return true;
		}
		return false;
	}
	
	public static boolean isCorrect (String id){
		if (id.length() == 11 && (id.charAt(6) == '-' || id.charAt(6) == '+') && isCorrectDate(id.substring(2, 6)) && isCorrectSN(id)){
				return true;	
		}
	return false;
	}
	
	public static void main(String[] args) {
		String alex = "550414-0912";
		String john = "930104-0341";

		System.out.println("First Part: " + getFirstPart(alex));

		System.out.println("Second Part: " + getSecondPart(alex));

		System.out.println("Female: " + isFemaleNumber(alex));

		System.out.println("Male: " + isMaleNumber(alex));

		System.out.println("Are Equal: " + areEqual(alex, john));
		
		System.out.println("Correct ID: "+ isCorrect(alex) );

	}
}