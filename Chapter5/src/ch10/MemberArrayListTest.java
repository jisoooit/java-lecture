package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		
		
		Member lee = new Member(10001, "¿Ã");
		Member kim = new Member(10001, "±Ë");
		Member kang = new Member(10001, "∞≠");
		Member hone = new Member(10001, "»•");
		memberArrayList.addMember(lee);
		memberArrayList.addMember(kim);
		memberArrayList.addMember(kang);
		memberArrayList.addMember(hone);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(kim.getMemberId());
		memberArrayList.showAllMember();
	}

}
