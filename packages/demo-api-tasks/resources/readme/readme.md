<link rel="stylesheet" href="https://static.torocloud.com/martini-assets/css/mkdocs.css">

###### DEMOS: API


# Demo Task Management API


## **User story**

Use the Demo Task Management API to learn how to create your own RESTful API and web application or use it to mock a service or integration with another system such as CRM. Includes the basic operations of a task management system that ship with commercial offerings such as Trello, Asana, Monday, Jira, ServiceNow, and many others. Demo APIs are intended for learning, mocking, and playing only. To consume the API of a commercial task management system search for it by name in the Toro Marketplace or consume any API directly using the Consume API wizard.


## **Test procedure**



*   View the API:
    *   In the Navigator double click the file `\\demo-api-tasks\code\api\demo_api_tasks`
    *   The API will open in Martini’s API editor. A tree hierarchy will visually represent all of the paths available for the API. Expand the path `/task/Operations` to view the Operations that have been declared for the path `/task`.
*   Test the API:
    *   Option 1: \
Testing the API with Postman (for Martini Online or Martini Desktop users): 
        *   Click the Preview tab at the bottom of the API window. 
        *   Switch the view to postman.json from the drop down menu in the top right. 
        *   Click the Download icon next to the URL and save the file to disk.
        *   Open Postman (install Postman if you don’t have it already) and click Import | File | Upload Files. Select the file you saved to disk and import as a Collection.
        *   In Postman expand the tree `demo_api_tasks API` and the folder `task`.
        *   Click `SelectAllTask` and click Send.
        *   Note the Response containing a list of all Tasks is returned by the API.
    *   Option 2: \
Testing the API with Martini’s HTTP Client (for Martini Desktop users only):
        *   In the Operations tab, right click the API path `/task/Operations/GET` and then select `Invoke in HTTP Client`.
        *   The HTTP Client view will be shown in a tab at the bottom of the screen with the path for the GET /tasks operation populated.
        *   Click Send in the HTTP Client.
        *   In the Response window a list of all Tasks is returned by the API.
*   View the Demo Task Management application:
    *   An application user interface for the Demo Task Management API has been included with the Package that uses each operation from the API. The user interface was created using Martini Templates. To access the application:
        *   In the Navigator right click the file `\\demo-api-tasks\code\template\Index` and click Run. Leave the values in the modal window at their defaults and click Run. The application will open in a tab within Martini.
        *   Experiment with the application by clicking menu items and adding new Projects, Tasks, and Users. You can also click on a Task and add Timesheets and Notes to the selected task.


## **Implementation**

Behind the scenes, these API operations are just services exposed as a REST API. These services are built using several functions, _steps_, and services that are pieced together to create an application flow or logic. To give you a better understanding of what takes place when an API operation is called, let’s take a look at one of the services being exposed in this API.



*   `InsertTask` - This is a service that is being invoked when a request is made to `POST /task`. Sending a request to this endpoint will create a new task in the Task Management API.
*   When a new task request is sent to `/task`, it executes the service `InsertTask` which is found in `\\demo_api_tasks\services\task` in the `code` folder of this package.
*   The invoice creation process that makes up the service logic below.
    *   The following lines are grouped together because they are used for the same purpose, that is validating the fields if it has a value. These validations checks the following:
        *   Line 4: This line contains validation logic for checking if the `projectId` provided in the request exists. If the provided `projectId` does not exist in the API, it will terminate the service prematurely and will return an error response.
        *   Line 11: This line contains validation logic for checking if the `assignedUserId` provided in the request exists. If the provided `userId` does not exist in the API, it will terminate the service prematurely and will return an error response.
        *   Line 18: This line contains validation logic for checking if the `dependencyTaskId` provided in the request exists. If the provided `dependencyTaskId` does not exist in the API, it will terminate the service prematurely and will return an error response.
        *   For validation blocks, it follows the logic below:
            *   If there is a provided value in the property being checked, pull the record from the API database using their respective SQL service for pulling an API record from the database
            *   If there’s a record returned by calling the SQL service, it will go over the next validation step.
            *   If there’s no matching record for the provided id in the current validation, it will map an error response, then terminate the service execution using the `Break Step`
    *   Line 25: `InsertTask` \
This is an SQL service being used as a function in this service. This line adds a new task in the API database.
    *   Line 27: `Fork` \
This step checks if the adding of a new task record in the database is successful. Depending whether the insert is successful or not, it will map a success response, or an error response.