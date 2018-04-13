package com.openclose.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclose.bean.Store;
import com.openclose.bean.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService
{

	@Autowired
	private StoreRepository storesRepo;

	@Override
	public void save(Store store)
	{
		storesRepo.save(store);
	}

	@Override
	public void update(Store store)
	{
		storesRepo.save(store);
	}

	@Override
	public void delete(String id)
	{
		storesRepo.deleteById(id);
	}

	@Override
	public List<Store> getAll()
	{
		return storesRepo.findAll();
	}

	@Override
	public Store getStore(String id)
	{
		if (storesRepo.findById(id).isPresent())
		{
			return storesRepo.findById(id).get();
		}
		return null;
	}

	public void updateStoreStatus(String storeId, boolean isOpen)
	{
		Optional<Store> result = storesRepo.findById(storeId);
		if (result.isPresent())
		{
			Store store = result.get();
			store.setOpen(isOpen);
			storesRepo.save(store);
		}
	}

	@Override
	public boolean checkStoreStatus(String storeId)
	{
		return getStore(storeId).isOpen();
	}

}
