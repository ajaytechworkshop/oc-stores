package com.openclose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openclose.bean.Stores;
import com.openclose.config.Constants;
import com.openclose.service.StoresService;

@RestController
@RequestMapping(value = Constants.URL_CONTEXT_ROOT)
public class StoresController
{
	@Autowired
	private StoresService storesService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void createStores(@RequestBody Stores store)
	{
		storesService.save(store);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public void updateStores(@RequestBody Stores store)
	{
		storesService.update(store);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Stores> getAllStores()
	{
		return storesService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Stores getStore(@PathVariable(name = "id") String storeId)
	{
		return storesService.getStore(storeId);
	}

	@RequestMapping(value = "/{id}/{isopen}", method = RequestMethod.PUT)
	public void updateStoreStatus(@PathVariable(name = "id") String storeId,
			@PathVariable(name = "isopen") boolean isOpen)
	{
		storesService.updateStoreStatus(storeId, isOpen);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStore(@PathVariable(name = "id") String storeId)
	{
		storesService.delete(storeId);
	}

}
