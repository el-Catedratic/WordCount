import java.io.File;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			 System.out.println("Usage: java WordCount <file>");
	            System.exit(1);
		}
		else {
			String fileName = args[0];
			File f = new File(fileName);
			System.out.println(f.length() +" "+ fileName);
			System.out.println("Next line" + f.getPath());
		}
	}

}
