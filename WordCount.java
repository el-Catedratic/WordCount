import java.io.File;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			 System.out.println("Usage: wordcount -c <file>");
	            System.exit(1);
		}
		else {
			String fileName = args[1];
			File f = new File(fileName);
			if(args[0].equals("-c")){
				System.out.println(f.length() +" "+ fileName);
			}
			else if(args[0].equals("-help")){
				System.out.println("Usage: wordcount -c <file>");
			}
			//System.out.println("Next line" + f.getPath());
		}
	}

}
