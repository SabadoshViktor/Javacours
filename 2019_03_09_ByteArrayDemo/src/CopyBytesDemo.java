import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CopyBytesDemo {

	public static void main(String[] args) throws IOException {
		try (InputStream in = new FileInputStream("test.txt");
				OutputStream os = new FileOutputStream("outtest.txt")) {
			
			int a;
			byte [] arr = new byte[8];
			while(( a = in.read(arr)) != -1){
				System.out.print(a);
				os.write(arr, 0, a);
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		} 
	}
}
