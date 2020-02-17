package mn223dn_assign4.newsagency;

public class NewsAgencyMain {

	public static void main(String[] args) {
		News news1 = new News();
		News news2 = new News();
		News news3 = new News();
		News news4 = new News();
		News news5 = new News();
		News news6 = new News();

		news1.addTitle("First news");
		news2.addTitle("Second news");
		news3.addTitle("Third news");
		news4.addTitle("Fourth news");
		news5.addTitle("Fifth news");
		news6.addTitle("Sixth news");

		Newspaper ind = new Newspaper();
		ind.addName("Independent");
		ind.addNews(news1);
		ind.addNews(news2);
		System.out.println("The news that the Independent has: " + ind.itsNews());


		Newspaper tim = new Newspaper();
		tim.addName("Times");
		tim.addNews(news3);
		tim.addNews(news4);
		System.out.println("The news that the Times has: " + tim.itsNews());

		
		Newspaper sid = new Newspaper();
		sid.addName("8 Sidor");
		sid.addNews(news5);
		sid.addNews(news6);
		System.out.println("The news that the 8 Sidor has: " + sid.itsNews());

		System.out.println();

		NewsAgency reuters = new NewsAgency();
		reuters.addNewspaper(ind);
		reuters.addNewspaper(tim);
		System.out.println("The registered newspapers in Reuters: " + reuters);

		
		ind.sellNews(reuters, news1);
		tim.sellNews(reuters, news3);
		
		/*A news agency can buy news whether the newspaper that has the news is registered 
		 * in the news agency or not*/
		reuters.buyNews(news5);
		
		System.out.println("News that reuters has: "+reuters.hasNews());

		System.out.println();

		reuters.broadcast(news1);
		System.out.println("The news that the Independent has after broadcasting: " + ind.itsNews());
		System.out.println("The news that the Times has after broadcasting: " + tim.itsNews());
		System.out.println("The news that 8 Sidor has after broadcasting: " + sid.itsNews());
		
		System.out.println();

		/* Trying to sell news that a newspaper doesn't have */
		ind.sellNews(reuters, news5);
		
		/* Trying to sell sell news that the news agency already has */ 
		ind.sellNews(reuters, news1);
		
		/*Trying to broadcast news that news agency doesn't has */
		reuters.broadcast(news6);

		
	}

}
