package com.openclose.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclose.bean.Stores;
import com.openclose.bean.repository.StoresRepository;

@Service
public class StoresServiceImpl implements StoresService
{

	@Autowired
	private StoresRepository storesRepo;

	@Override
	public void save(Stores store)
	{
		storesRepo.save(store);
	}

	@Override
	public void update(Stores store)
	{
		storesRepo.save(store);
	}

	@Override
	public void delete(String id)
	{
		storesRepo.deleteById(id);
	}

	@Override
	public List<Stores> getAll()
	{
		return storesRepo.findAll();
	}

	@Override
	public Stores getStore(String id)
	{
		if (storesRepo.findById(id).isPresent())
		{
			return storesRepo.findById(id).get();
		}
		return null;
	}

	public void updateStoreStatus(String storeId, boolean isOpen)
	{
		Optional<Stores> result = storesRepo.findById(storeId);
		if (result.isPresent())
		{
			Stores store = result.get();
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
