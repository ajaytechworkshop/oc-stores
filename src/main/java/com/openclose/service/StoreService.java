package com.openclose.service;

import java.util.List;

import com.openclose.bean.Store;

public interface StoreService
{
	public void save(Store store);

	public void update(Store store);

	public void delete(String id);

	public List<Store> getAll();

	public Store getStore(String id);

	public void updateStoreStatus(String storeId, boolean isOpen);

	public boolean checkStoreStatus(String storeId);
}
