class Main {
  public static void main(String[] args) {
    BlogEntry b1 = new BlogEntry("User1", "This is a new blog entry containing more than ten words to test that only ten words are sent back by the getSummary method");
		b1.displayEntry();
		b1.getSummary();
		
		BlogEntry b2 = new BlogEntry("User2", "This blog is less than ten words");
		b2.displayEntry();
		b2.getSummary(); 
		
		BlogEntry b3 = new BlogEntry("GooglyEyes", "hello");
		b3.displayEntry();
		b3.getSummary();
  }
}