package mn223dn_assign4.newsagency;

public class News {

	private String title = "";
	private String article = "";

	public News() {

	}

	public String toString() {
		return title;
	}
	/** Adding atitle for the News
	   @param text The title
	 */
	public void addTitle(String text) {
		title = text;
	}
	
	/** Adding an article to the news
	 * @param text The article
	 */
	public void addArticle(String text) {
		article = text;
	}

	/** Show the article
	 * @return the article
	 */
	public String getArticle() {
		return article;
	}

}
