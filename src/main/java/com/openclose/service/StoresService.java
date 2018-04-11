package com.openclose.service;

import java.util.List;

import com.openclose.bean.Stores;

public interface StoresService
{
	public void save(Stores store);

	public void update(Stores store);

	public void delete(String id);

	public List<Stores> getAll();

	public Stores getStore(String id);

	public void updateStoreStatus(String storeId, boolean isOpen);
}
