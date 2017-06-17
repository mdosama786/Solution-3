/**
 * Write a program to print the contents of a given tag. 
 * Ex: Input: <h1> This is content </h1> ->
 * output: This is content
 * Note: this should satisfy even if inner tags are available. 
 * Ex: <h1><font color=red> This is content </font></h1> 
 */

/**
 * @author Osama
 *
 */

/** @Creating Class **/
public class ContentPrograms {
	/** @Main Method */
	public static void main(String[] args) {
		/** @String first */
		String html = "<h1> This is content </h1>";
		/** @String Second */
		html = "<h1><font color=red> This is content</font></h1>";

		String noHTMLString = html.replaceAll("\\<.*?>", "");
		/** @Output */
		System.out.println(noHTMLString);
	}

}