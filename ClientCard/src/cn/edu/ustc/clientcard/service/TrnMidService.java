package cn.edu.ustc.clientcard.service;

import java.util.List;

import cn.edu.ustc.clientcard.model.TrnMid;

public interface TrnMidService {

	public void save(TrnMid o);

	public void update(TrnMid o);

	public void delete(String id);

	public TrnMid get(String id);
	public TrnMid getByCreateUserId(String id);
	public List<TrnMid> getList();

	public List<TrnMid> getList(int begin, int end);

	public Long totalNum();

}