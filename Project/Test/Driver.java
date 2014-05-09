import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){

	Music player = new Music("Thor.wav");
	Scanner scan = new Scanner(System.in);
	player.play();
	scan.next();
    }
}
