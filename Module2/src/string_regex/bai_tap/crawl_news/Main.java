package string_regex.bai_tap.crawl_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException  {
		URL url = new URL("https://dantri.com.vn/the-gioi.htm");
		// open the stream and put it into BufferedReader
		Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
		//
		scanner.useDelimiter("\\Z");
		String content = scanner.next();
		// close scanner
		scanner.close();
		// remove all new line
		//System.out.println(content);
		content = content.replaceAll("\\R", "");
		Pattern p = Pattern.compile("<h3 class='news-item__title'> {20}<a {2}data-utm=\\\"(.*?)\\\" {2}href=\\\"(.*?)\\\" {2}title=\\\"(.*?)\\\"");
		Matcher m = p.matcher(content);
	
		while (m.find()) {
		   System.out.println(m.group(3));
		}
	}
}
