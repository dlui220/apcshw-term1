import java.io.*;
import java.util.*;

public class Driver {
    ArrayList<Integer> al = new ArrayList<Integer>();
    Random r = new Random();
    for (int i = 0;i<20;i++) {
	al.add(r.nextInt(5));
	System.out.println(al);
	
    }

}
