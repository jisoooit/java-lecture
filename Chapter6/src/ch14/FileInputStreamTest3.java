package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("Input2.txt")){
			
			byte[] bs = new byte[10];
			while((i=fis.read(bs))!=-1) { //i값이 byte수가 됨
				
				for(int j=0; j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"바이트 읽음");
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
