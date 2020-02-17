package mn223dn_assign4.newsagency;

import java.util.*;

public class NewsAgency {

	private ArrayList<Newspaper> arr = new ArrayList<Newspaper>();
	private ArrayList<News> newsArr = new ArrayList<News>();

	public NewsAgency() {

	}

	/**
	 * Add a newspaper to a news agency to be registered
	 * 
	 * @param a
	 *            the newspaper
	 */
	public void addNewspaper(Newspaper a) {
		arr.add(a);
	}

	/**
	 * Unregister a newspaper from a news agency
	 * 
	 * @param a
	 *            the newspaper
	 */
	public void removeNewspaper(Newspaper a) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == a)
				arr.remove(i);
		}
	}

	/**
	 * Check if the newspaper registered
	 * 
	 * @param a
	 *            the newspaper
	 * @return boolean if the newspaper registered or not
	 */
	public boolean checkHasNewspaper(Newspaper a) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == a)
				return true;
		}
		return false;
	}

	/**
	 * Check if the news agency has the news
	 * 
	 * @param a the news
	 *   
	 * @return boolean if the newspaper has the news
	 */
	public boolean checkHasNews(News a) {
		for (int i = 0; i < newsArr.size(); i++) {
			if (newsArr.get(i) == a)
				return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Newspaper a : arr)
			sb.append(a + ",");
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	/**
	 * Buy news
	 * 
	 * @param a the news
	 */
	public void buyNews(News a) {
		if (checkHasNews(a)) {
			System.out.println("\"Error\": The news agency already has this news");
		}
		else {
			newsArr.add(a);
		}
	}

	/**
	 * The news that the news agency has
	 * @return String contain the news that the news agency has
	 */
	public String hasNews() {
		StringBuilder sb = new StringBuilder();
		for (News a : newsArr)
			sb.append(a + " ,");
		if (sb.length() != 1)
			sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	/**
	 * Broadcast news that the news agency has to the registered newspapers
	 * except the newspaper that news agency bought the news from
	 * Error will handle if the news agency doesn't have the news
	 * 
	 * @param a
	 *            the news
	 */
	public void broadcast(News a) {
		if (! checkHasNews(a))
			System.out.println("\"Error\": The news agency doesn't have this news!!! Buy it first to sell it.");
		
		else{
			for (int i = 0; i < arr.size(); i++) {
				if (!arr.get(i).checkHasNews(a))
					arr.get(i).addNews(a);
			}
		}

	}

}
