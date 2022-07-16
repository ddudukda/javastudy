package ch12;

import java.util.Objects;

public class Member {

	private int memberId;
	private String memberName;
	
	//생성자
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		else return false;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public String toString() {
		return memberName + "의 아이디는 " + memberId + "입니다.";
		
	}
	
	
}
