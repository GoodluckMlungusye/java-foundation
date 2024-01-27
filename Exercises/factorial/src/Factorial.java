import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Factorial {

    String number;

    public void Fact() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter ouput = new PrintWriter(System.out,true);

        ouput.println("Enter a number");
        number = bufferedReader.readLine();
        int factNum = Integer.parseInt(number);
        ouput.println(factNum);
    }
}


