package cn.edu.ustc.clientcard.service;

import cn.edu.ustc.clientcard.model.TrnMid;
import cn.edu.ustc.clientcard.model.TrnNc;

public interface CardService {

	public void save(TrnMid trnMid, TrnNc trnNc);
	
	public void update(TrnNc trnNc);
	
	public TrnNc get(String id);
	
	public void delete(String id);
}