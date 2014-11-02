package cn.edu.ustc.clientcard.service;

import cn.edu.ustc.clientcard.model.MstUser;


public interface LoginService {

	public boolean hasUser(String name);

	public boolean checkUserLogin(MstUser user,String name, String password);

	public MstUser getUserFromName(String name);
}