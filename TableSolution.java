import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableSolution {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int i;
        
        for (i= 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}

        bufferedReader.close();
    }
}
