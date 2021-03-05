
import java.io.*;
import javax.swing.*;
//code got from https://www.codejava.net/java-se/swing/redirect-standard-output-streams-to-jtextarea
public class CustomOutputStream extends OutputStream{
	//Sets up the OutputStream that will help form the output for the program. 
	private JTextArea textArea;
	public CustomOutputStream(JTextArea textArea) {
		this.textArea = textArea;
		
	}
	@Override
	public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
	
	
}
