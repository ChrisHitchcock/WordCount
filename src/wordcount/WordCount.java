/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordcount;
import java.io.*;
/**
 *
 * @author chhit5249
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File text = new File("source.txt");
        FileReader in;
        BufferedReader readFile;
        String txt;
        String txtReal="";
        int words=0;
        boolean letter;
        try {
            in = new FileReader(text);
            readFile = new BufferedReader(in);
            while ((txt = readFile.readLine()) != null ) {
                    txtReal+=txt;
                    for (int i = 0; i<txt.length(); i++)
                    {
                        if (((int)txt.charAt(i)>=65&&(int)txt.charAt(i)<=90)||((int)txt.charAt(i)>=97&&(int)txt.charAt(i)<=122))
                        {
                            letter = ((int)txt.charAt(i+1)>=65&&(int)txt.charAt(i+1)<=90)||((int)txt.charAt(i+1)>=97&&(int)txt.charAt(i+1)<=122);
                            if (letter==false)
                            {
                                words++;
                            }
                        }
                    }
    		}
            System.out.println(txtReal);
            System.out.println(words);
            in.close();
            readFile.close();
        } catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
                
    }
    
}
