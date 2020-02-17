package mn223dn_assign4.newsagency;

import java.util.*;

public class Newspaper {

	private ArrayList<News> arr = new ArrayList<News>();
	private String name = "" ;
	
	public Newspaper() {
	}

	/** Name the Newspaper
	 * 
	 * @param a The name
	 */
	public void addName(String a) {
		name = a;
	}
	
	public String toString() {
		return name;
	}
	
	/** Add news to a newspaper
	 * 
	 * @param a The news
	 */
	public void addNews(News a) {
		arr.add(a);
	}
	

	/** Show the news that the newspaper has
	 * @return The news
	 */
	
	public String itsNews(){
		StringBuilder sb = new StringBuilder();
		for (News a : arr)
			sb.append(a + " ,");
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	
	/** Check if a newspaper has the provided news
	 * 
	 * @param a the news that we want to check
	 * @return the result if it has the news or not
	 */
	public boolean checkHasNews(News a){
		for (int i = 0; i < arr.size(); i++){
			if (arr.get(i) == a)
				return true;
		}
		return false;
	}
	
	
	/** Sell news to a news agency
	 * 
	 * @param n the news agency that will buy the news
	 * @param a the news that will be sold
	 */
	public void sellNews(NewsAgency n, News a) {
		if (! checkHasNews(a)){
			System.out.println("\"Error\": The newspaper doesn't have this news!!! ");
		}
		else {
			n.buyNews(a);
		}
		
	}
	
	
}
