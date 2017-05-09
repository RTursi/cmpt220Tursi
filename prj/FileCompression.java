/*
Joe Tursi
Dr. Rivas
CMPT220
proj2

Objective: Compressing files
*/

import java.io.*;
import java.util.zip.*;

public class FileCompression{
  public static void compress(File source, File destination)throws IOException{ //method for file compression method has two arguments
  	/*
		Reading byte-by-byte inefficient, with buffer you can read a couple thousand bytes
	*/
  byte[] buffer = new byte[1024];//buffer byte array 1kb..Buffer reads data
  FileInputStream fis = new FileInputStream(source); // create stream to read from source file
  FileOutputStream fos = new FileOutputStream(destination);//  compressed file 
  GZIPOutputStream gzos = new GZIPOutputStream(fos);// file output stream argument,writes the compressed data
  int read; //bytes stored in read
  while((read = fis.read(buffer))!= -1){
    gzos.write(buffer, 0, read);//Gzip outputstream, method of GzipOutputstream -- writes an array of bytes to compressed file
  }
  gzos.finish(); //gzip, finishes writing the compressed file to out..doesn't close the statement
  gzos.close(); //close GZIPoutputstream
  fos.close(); //close fileoutputstream
  fis.close(); //close fileinput stream
  }
  public static void main(String[]args){ //main method
  	File source = new File("Users//JoeTursi//Desktop//cmpt220tursi//prj//2//wiki.rdf");
  	File destination = new File("Users/JoeTursi/Desktop//cmpt220tursi//prj//2//BrandSpankingNew.rdf"); //puts compressed file into this new one
  	try{
  	  compress(source, destination);
  	}
  	catch(IOException e){
  	  System.out.println(e);
  	}
  }
}
/*
UPDATE: Diffculties with effin' identifier!!!! can't even compress rn	
UPDATE: Decompress compiles, then cant be found life is going well
UPDATE: its 3am, and you are waking up for an 8am
UPDATE: This is why not to procrastinate
UPDATE; went to bed hope for the best
UPDATE; works
*/

