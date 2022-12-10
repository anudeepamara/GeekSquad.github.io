## This Document Describes the Functional and Non-Functional Requirements for the project.

# Functional Requirements

1. Login/Register
   1. Login page where user needs to enter the credentials of his/her Shall account. and then it shall redirect to home page.
   2. if the user is new to account/application. When the user  tries to login, there shall be a option called sign up page. 
      When he clicks on sign up page. Registration page should get opened.
   3. In registration page, there will be multiple fields to enter the details the user. For few fields there shall be 
      validation for email and password.  
   4. after successful login, application shall redirect to homepage. The application shall validate the user data from the database.
      in the homepage user can be able to see the multiple options in the application.

2. Home Page 
   1. user can be able to access the homepage fully and there shall be multiple options available in the hompepage.and can be 
      able to view the features in the application.
   2. In the home page there shallbe a navigation bar and user can be able to access that navigation bar and the options showing in 
      the bar able to click them.for example, there will be an option called order now. user can be able to click that option.
   3. Whenever user clicks the order now option it should redirect to the restaurant’s page and able to show the data of 
      restaurants present in that location.  

3. Restaurant’s Page
   1. In the restaurant page user can be able to select the restaurant and able to see all the food items presented in the restaurant.

4. Food Items Page   
   1. the user shall be able to access the food items and he can be able to add that item to his cart and then it should store 
      in his cart. the data needs to get update in the database as of user preferences.

5. Cart 
   1. The all the cart items which shall be added in his account user can be able to view those items and he can be able to 
      edit the   quantity of those and he can able to delete the items whatever he needs.
   2. The moment user updated or deleted few items all the data needs to be updated and the changes also needs to show in the 
      webpage as per updated database.in the user account.
   3. The cart page user can be able to see the option called place an order where user shall be able to place his order and 
      then API should redirect to the payment page and he can be able to perform the operation.

6. Settings Page      
   1. In the application there shall be a footer section where the user can be able to see the option called settings when he clicks
      that he can be able to see what all available options in that page.
   2. In the settings page user can be able to see the option called update the password, whenever user clicks the option, 
      he shall be  able to edit the password of his account. and the same data needs to get updated in the database.

7. OrderItems Page
   1. The application shall be having an option called orders. he can be able to click and perform the operation when the user 
      tries to open the orders it should display all the records of his orders from the database

# Non-Functional Requirements

1. Reliablity
   1. The food order application has been easily interacting with the users and accessible to them. And it should meet all the 
      regulatory requirements to the application.
   2. The application should be reliable, and it should not have any vulnerability and it should check the other competitors 
      like swiggy and zomato also in the same business. They need to understand what the mistakes are doing by them and rectify in the competition with upgrading technologies.

2. Scalability 
   1. The applications need to be tested all the possible scenarios and negative ways to keep the application bug free 
      and the  performance of the application and the speed needs to be accurateto access the application and work with that.
   2. If the user wants to change the password of the Application, the user will get a email verification to change the password.    

3. Perfomance
   1. In the food order application, performance is extremely important and can be compared to how quickly the system reacts to
      user activity or how long a user must wait for an operation to complete.   
   2. If a problem arises from the buyer's side or otherwise from the seller side, the seller shall act quickly and accurately 
      fullfill the order by the estimated delivery date and time.  

4. Manageability 
   1. The system's upkeep and manageability are measured by how long it takes to resolve problems thatarise in the middle of 
      operations and by how simple it is for the administrator to control the system.

5. Security
   1. It must allow users to verify their accounts using their phone number.

6. Portablity
   1. The application is portable.where it shall be responsive from one device to others as well.

7. Usablity
   1. The application shall open without any flaw or malfunction for the homepage and other features.
   2. The user shall easily navigate one page to other page with ease and can easily understand the purpose of features,anduseer 
      friendly where it can be defined as Usability.

8. Interoperability 
   1. The application is interoperable is the ease with which a system can interchange data and share information with other 
      computers and external devices.      



    

## Change Management Plan

This section was the quick setup Guide for the users how to use our application and what are the steps involved in this application to understand the usage in easy manner.

## How To Train the People To Use The Application:

- This Application was a completed Web-Based Application.
- Users can easily redirect to the application with the URL.
- The users can visible the features that we are provided in the application a button for SIGNUP.
- That Signup button will take the users to the Registration Page where they can setup their account in the application.
- Once They setup completed, they can see one option called Login in the page, if they click that option it will redirect them to the Login page. so that they can be able to login to the application.
- After Successfully Logged In They can see various Option in the webpage like Order Now, Cart, Settings. these three are hyperlinks and whenever user clicks to any of those links it will take to the respected page. each page has its own features.
- If The user Clicks the Order Now page it show all the Restaurant’s which were Located in the particular Location and the user Needs To select one of the restaurant and they user can able to see all The Food Items Presented in the Restaurant.
- The User can See the Option Called ADD TO CART This button will help user to add the interested Food item in the cart form there he can place the order.
- After The user added The Item, He can an Option Called ORDER NOW whenever the user clicks that button it will redirect to another page and it will show all the items that user has added into his cart. Here user can update the quantity of those items or else he can remove some of the items from his cart and check the Total Price. in the Bottom Hew can see Order Button.
- If The user clicks the order button it will redirect him to the payment page and user needs to enter his credit/debit card details and process the payment.
- In The Main Page User Can see the option called Order History where the user can see all his/her previous orders in the application.
_ There is one more option added in this application was SETTINGS page whenever user wants to update his personal information like Password , Location preferences he can choose that option and update the data.

## How To ensure that it integrates within their ecosystem / software:

- This Application was normal Spring Boot application we made this whole application in the Form of a JAR file.
- Customers can Install this jar file in their system this will support all the platforms like windows, Linux and MacOS.
- This was consisting of the Maven Build methods. if you run the build, it will show the tests results that the installation of the product.

Run These Commands in order to install all the dependencies for the application.

```sh
mvn clean install 
mvn install
```
After The successful installation you can see the report that Build has been passed or Failed.

- After Installed the dependencies. this consists of various Junit Test files that has mocked up the data in all the methods to test the functionality of the application.
- The report suggests the status of the application weather successfully installed or not.

This application is currently extended with the following plugins which was coded in the POM.XML file in the application.

| Plugin | DESCRIPTION |
| ------ | ------ |
| org.apache.tomcat.embed | This plugin was used to run the server in the web application |
| mysql-connector-java | This plugin was used to setup the database integration |
| mysql-connector-java | This plugin was used to setup the database integration |
| org.junit.vintage    | This was the plugin for the Jnuint to run the test cases in the system |
| org.springframework.boot | This plugin was used to create the spring nature in the application |

- We can check for the user feedback also to ensure that the application has been installed smoothly and working in all possible ways.
- Based on the Booking’s made by user we can ensure that all the functional requirements have been working.

## To ensure that it has resolved the issues of food ordering:

## Traceability links

This section was about to Guide all the artifacts which were developed while creating the application. And we will assign the function and non-functional requirements to align with the artifacts.

## use case Diagram + Activity Diagram

| Artifact ID | Artifact Name | Requirement ID |
| :-------------: | :----------: | :----------: |
|    UseCase1     | Food Items    |     FR5     |
|    UseCase1     | View Items    |     FR5     |
|    UseCase1     | Add To Cart   |     FR5     |


## Class Diagram + Object Model

| Artifact Name   | Requirement ID |
| :----------:    | :----------: |
| Class User      |     FR5     |
| Class Location  |     FR5     |
| Class Restuarent     |     FR5     |
| Class Food      |     FR5     |
| Class Admin      |     FR5     |
| Class Cart      |     FR5     |
| Class Cart Items      |     FR5     |
| Class Orders      |     FR5     |
| Class Order Items      |     FR5     |














   
   



