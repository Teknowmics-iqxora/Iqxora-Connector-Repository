# Iqxora-Connector-Repository

A platform end point to build API for connecting external resources

**List Of Connectors**
1. External Connectors : used to handle HTTP services and other things
2. Document Connectors : Office document management

**Getting Started**

**_Method 1: Using Template Model_**

To build an external connector in faster way is to use template model and add custom change on the template model.

Step 1 : Checkout the project to local directory and open project in your IDE.

Step 2 : To Execute connector task you can use default service Implementation class(ConnectorServiceImpl) or you can create your own custom Implementation class.

Step 3 : Extend abstract class, you have to extend abstract class (com.teknowmics.externalconnector.fw.service.Impl.AbstractConnectorPluginServiceImpl). if you are creating your own implementation class

Step 4 : Then need to implement abstract methods. 

The abstract methods are:

1. **getEndConnectorKey** - Used to identify your connector, have to provide connector key. That is used while in connector creation(sysAdmin)
2. **isAsync** - used to check the process is synchronised or not
3. **executeTask** - It will triggered when connector task is excuted and connector task key is matched with the connector key that provide in the getEndConnectorKey method. In this executeTask method you can provide your custom implementation for the external resources.

**Input and OutPut Managment**

To work Connector succesfully, have to manage the input and output response properly.
In method executorTask, EndPointConnectorDetailsForm contain the input and outparams. you can use getter method to get input parameters and output response parameters.
I/O fiedls are:

private List<ExternalConnectorInputs> externalConnectorInputs;
private List<ExternalConnectorOutputDetails> externalConnectorOutputDetails;

For submitting response, Should follow the system accepting standards.
In Responce data the ExternalConnectorOutputDetails must be attached!

**_Method 2: Without Using Template Model_**

1. To use external connector service, have to build a java application and need to add the required dependency library.

step 1 : Create a java maven application in your IDE

step 2: Add Client library in your pom.xml file

<dependency>
<groupId>com.teknowmics.smartdocs</groupId>
<artifactId>ExternalConnectorFramework</artifactId>
<version>1.0.0-SNAPSHOT</version>
</dependency>

follow above mentioned steps, from step 2.
