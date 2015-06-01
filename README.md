## Synopsis

The NIC Federal Java RIDB Client project provides an easy way for RIDB data to be used in Java applications and websites.
The client library wraps up the full capabilities of the RIDB JSON API into a simple to use client gateway that returns Java
objects.

## Code Examples

To use the RIDB client library, you must first instantiate the a `RIDBClient` object.  You have two choices regarding how to do this.  The first is
to use the default constructor in which case the RIDB settings will be pulled from the system properties.  The second option is
to instantiate using the parameterized constructor which requires you to pass in the essential RIDB configuration.

### Default Constructor

	// java -DRIDB.BaseUrl="https://ridb.recreation.gov/api/v1" -DRIDB.ApiKey="555AAQWSDDA348BF42E20F8988280535"
	// or use other methods available to your application container
	
	RIDBClient ridb = new RIDBClient();

### Parameterized Constructor

	RIDBClient ridb = new RIDBClient("https://ridb.recreation.gov/api/v1", "555AAQWSDDA348BF42E20F8988280535");

### Client Modules

Once the `RIDBClient` object is constructed, RIDB data is accessed by calling modules on that client object.  There are a total of
10 modules.  Each module corresponds to an entity within RIDB.

*	Activity
*	Campsite
*	Event
*	Facility
*	Link
*	Media
*	Org
*	PermitEntrance
*	RecArea
*	Tour

To use a module, you reference the field of the client object corresponding to the entity for which you wish to retrieve data from RIDB.  Here are
examples of several popular modules being used to access RIDB data.  These examples assume that the client object has already been instantiated
for use as discussed above.

	// Retrieve all organizations from RIDB
	RIDBOrganization[] allOrgs = ridb.Org.getAll();

	// Search for recreation areas with "yellowstone" in their title or metadata
	RIDBSearchParameters params = new RIDBSearchParameters();
	params.setQuery("yellowstone");
	RIDBList<RIDBRecArea> yellowstoneRecAreas = ridb.RecArea.search(params);

	// Get all facilities associated with RecArea 123
	RIDBFacility[] facilities = ridb.RecArea.getAllFacilities(123);

	// retrieve a specific facility
	RIDBFacility facility = ridb.Facility.get(456);

## API Reference

The API for the current release can be downloaded as a jar file from the current release using the following link.

TODO:  Once release is performed, complete this link
[Alpha 1 Release API Documentation JAR File](https://google.com)

## Build and Installation

The RIDB Client API is a maven solution.  Use the maven command line or your IDE to build the project.  The build will create the jar file can be referenced
from your own project.  When the solution builds it will also build the javadocs packaged as a jar file.

## Tests

A test suite is provided in the solution using JUnit 3.8.1.  Since tests can be taxing to the RIDB API server, tests are not currently
ran on every maven build.  Instead you will need to use the maven command line or your IDE to explicitly execute the provided tests.

## Contributors

This framework was originally created by the NIC Federal team at the myAmerica Developer Summit in Washington, DC.  In the weeks that followed,
what was started at the hackathon was finished by the NIC Federal team.  It is the hope of NIC Federal that others will find this
useful and will contribute fixes, improvements, and features.

## License

The NIC Federal Java RIDB Client project is licensed under the Apache 2.0 license.  Therefore, the
following license rights apply.

> Copyright 2015 NIC Federal
>
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this file except in compliance with the License.
> You may obtain a copy of the License at
> 
>    http://www.apache.org/licenses/LICENSE-2.0
> 
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.
