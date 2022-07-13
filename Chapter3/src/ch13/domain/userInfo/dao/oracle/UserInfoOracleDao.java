package ch13.domain.userInfo.dao.oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into oracleDB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into oracleDB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInf(UserInfo userInfo) {
		System.out.println("Delete from oracleDB userId = " + userInfo.getUserId());
		
	}

}