package ch12;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);

	}

}
