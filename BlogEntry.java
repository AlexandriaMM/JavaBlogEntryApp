import java.time.*;

public class BlogEntry {
	private String userName, blogEntry;
	private LocalDateTime entryDate;
	
	public BlogEntry(String nUserName, String nBlogEntry) {
		userName = nUserName;
		blogEntry = nBlogEntry;
		entryDate = LocalDateTime.now();
	}
	
	public void displayEntry() {
		System.out.println("User Name: " + userName + "\n" + "Entry Date: " + entryDate + "\n" + "Entry: " + blogEntry);
	}
	
	public void getSummary() {
		String [] summaryArray = blogEntry.split(" ");
		int arrSize = summaryArray.length;
		String summary = " ";
		if(arrSize < 10)
		{
			for(int i = 0; i<arrSize; i++) {
				summary = summary + " " + summaryArray[i];
			}
		}
		else {
			for(int i=0; i<10; i++) {
				summary = summary + " " + summaryArray[i];
			}
		}
		System.out.println("Summary: " + summary);
	}

}