package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		//¹öÆÛ·Î °¨½Î¼­ ÈÎ¾À »¡¶óÁü
		try ( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip")) ;
				BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("copy.zip")) ) {
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(millisecond+"¼Ò¿äµÊ");
	}

}
