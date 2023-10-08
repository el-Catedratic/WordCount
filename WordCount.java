import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			if(args.length == 1){
				String fileName = args[0];
				try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
						String line;
						long lineCount = 0;
						long charCount = 0;
						long wordCount = 0;
						while ((line = br.readLine()) != null) {
							lineCount++;
							charCount += line.length();
							String[] words = line.split("\\s+");
							wordCount += words.length;
						}
						System.out.println(lineCount+" "+wordCount+" "+charCount+" "+fileName);
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
			else{
				System.out.println("Usage: wordcount -c <file>");
	            System.exit(1);
			}
		}
		else {
			String fileName = args[1];
			if(args[0].equals("-c")){
				File f = new File(fileName);
				System.out.println(f.length() +" "+ fileName);
			}
			else if(args[0].equals("-help")){
				System.out.println("Usage: wordcount -c <file>");
			}
			else{
				if(args[0].equals("-l")){
					try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
						String line;
						long lineCount = 0;
						while ((line = br.readLine()) != null) {
							lineCount++;
						}
						System.out.println(lineCount+" "+fileName);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else if(args[0].equals("-w")){
					try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
						String line;
						long wordCount = 0;
						while ((line = br.readLine()) != null) {
							String[] words = line.split("\\s+");
							wordCount += words.length;
						}
						System.out.println(wordCount+" "+fileName);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else if(args[0].equals("-m")){
					try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
						String line;
						long charCount = 0;
						while ((line = br.readLine()) != null) {
							charCount += line.length();
						}
						System.out.println(charCount+" "+fileName);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else{
					 System.out.println("Usage: wordcount -c <file>"+
					 " Usage: wordcount -c <file>"+
					" Usage: wordcount -l <file>"+
					" Usage: wordcount -w <file>"+
					" Usage: wordcount -m <file>"+
					" Usage: wordcount <file>"
					 );
	            System.exit(1);
				}
			}
			//System.out.println("Next line" + f.getPath());
		}
	}

}
