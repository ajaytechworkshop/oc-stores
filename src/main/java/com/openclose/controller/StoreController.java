package com.openclose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openclose.bean.Store;
import com.openclose.config.Constants;
import com.openclose.service.StoreService;

@RestController
@RequestMapping(value = Constants.URL_CONTEXT_ROOT)
public class StoreController
{
	@Autowired
	private StoreService storeService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void createStores(@RequestBody Store store)
	{
		storeService.save(store);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public void updateStores(@RequestBody Store store)
	{
		storeService.update(store);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Store> getAllStores()
	{
		return storeService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Store getStore(@PathVariable(name = "id") String storeId)
	{
		return storeService.getStore(storeId);
	}

	@RequestMapping(value = "/{id}/{isopen}", method = RequestMethod.PUT)
	public void updateStoreStatus(@PathVariable(name = "id") String storeId,
			@PathVariable(name = "isopen") boolean isOpen)
	{
		storeService.updateStoreStatus(storeId, isOpen);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStore(@PathVariable(name = "id") String storeId)
	{
		storeService.delete(storeId);
	}

	@RequestMapping(value = Constants.URL_GET_SHOP_STATUS, method = RequestMethod.GET)
	public boolean isOpen(@PathVariable(name = "id") String storeId)
	{
		return storeService.checkStoreStatus(storeId);
	}

}
