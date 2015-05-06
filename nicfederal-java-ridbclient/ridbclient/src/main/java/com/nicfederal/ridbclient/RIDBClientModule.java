package com.nicfederal.ridbclient;

/*
Copyright 2015 NIC Federal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
 * A base class for the client modules which are specific to entities within RIDB.
 * 
 * @author NIC Federal
 */
public class RIDBClientModule {
	
	/** The reference to the client which owns the module. */
	protected final RIDBClient client;
	
	/**
	 * Make the default constructor protected.
	 */
	protected RIDBClientModule() {
		this.client = null;
	}
	
	/**
	 * Construct a new module object.
	 *
	 * @param client the client object that owns the client module
	 */
	public RIDBClientModule(RIDBClient client)
	{
		this.client = client;
	}
}
